document.getElementById('search-btn').addEventListener('click', fetchUserData);
document.getElementById('overall-link').addEventListener('click', showOverallResults);
document.getElementById('languages-link').addEventListener('click', showLanguageResults);

async function fetchUserData() {
    const username = document.getElementById('username').value.trim();
    if (!username) {
        alert('Kérjük, írjon be egy felhasználónevet!');
        return;
    }

    try {
        const response = await fetch(`https://www.codewars.com/api/v1/users/${username}`);
        if (!response.ok) {
            if (response.status === 404) {
                showError();
            } else {
                throw new Error('Hiba történt a lekérdezés során.');
            }
            return;
        }

        const data = await response.json();
        displayUserInfo(data);
    } catch (error) {
        console.error('API hiba:', error);
        showError();
    }
}

function displayUserInfo(data) {
    document.getElementById('real-name').textContent = data.name || 'N/A';
    document.getElementById('user-name').textContent = data.username;

    document.getElementById('total-points').textContent = data.honor;
    document.getElementById('global-rank').textContent = data.ranks.overall.name;

    const languageContainer = document.getElementById('language-data');
    languageContainer.innerHTML = ''; 
    const languages = data.ranks.languages;
    for (const [language, info] of Object.entries(languages)) {
        const langDiv = document.createElement('div');
        langDiv.innerHTML = `<p><strong>${language}</strong>: Pontok - ${info.score}, Rank - ${info.name}</p>`;
        languageContainer.appendChild(langDiv);
    }

    document.getElementById('results').classList.remove('hidden');
    document.getElementById('overall-results').classList.remove('hidden');
    document.getElementById('language-results').classList.add('hidden');
    document.getElementById('error').classList.add('hidden');
}

function showError() {
    document.getElementById('results').classList.add('hidden');
    document.getElementById('error').classList.remove('hidden');
}

function showOverallResults() {
    document.getElementById('overall-results').classList.remove('hidden');
    document.getElementById('language-results').classList.add('hidden');
}

function showLanguageResults() {
    document.getElementById('overall-results').classList.add('hidden');
    document.getElementById('language-results').classList.remove('hidden');
}
