import flet as ft
import random

def main(page: ft.Page):
    page.scroll = ft.ScrollMode.AUTO
    page.bgcolor = ft.colors.DEEP_PURPLE_100
    

    kerdesek = [
        {
            "kérdés": "Merre elterjedt a Quokka?",
            "típus": "single",
            "valaszlehetőségek": ["Európa", "Észak-Afrika", "Nyugat-Ausztrália ", "Atlanti óceán"],
            "jó_valasz": ["Nyugat-Ausztrália "]
        },
        {
            "kérdés": "Hol található a Nyulak-szigete?",
            "típus": "single",
            "valaszlehetőségek": ["Okunoshima", "Húsvét-sziget", "Bangkok","Osaka"],
            "jó_valasz": ["Okunoshima"]
        },
        {
            "kérdés": "Melyek a kutya fajták?",
            "típus": "multiple",
            "valaszlehetőségek": ["Dik-dik", "Bernedoodle", "Kuvik", "Basenji"],
            "jó_valasz": ["Bernedoodle","Basenji"]
        },
        {
            "kérdés": "Melyiktől fél jobban (ő) ?",
            "típus": "single",
            "valaszlehetőségek": ["patkány", "egér"],
            "jó_valasz": ["patkány"]
        },
        {
            "kérdés": "Ki szól bele?",
            "típus": "single",
            "valaszlehetőségek": ["te", "én", "egyse szólal belé"],
            "jó_valasz": ["egyse szólal belé"]
        },
        {
            "kérdés": "Ki festette A csók című alkotást?",
            "típus": "single",
            "valaszlehetőségek": ["Pablo Picasso", "Gustav Klimt", "Jackson Pollock", "Paul Gauguin"],
            "jó_valasz": ["Gustav Klimt"]
        },
        {
            "kérdés": "Melyek az input eszközök?",
            "típus": "multiple",
            "valaszlehetőségek": ["billenytyűzet", "scanner", "headset", "nyomtató"],
            "jó_valasz": ["billenytyűzet", "scanner"]
        },
        {
            "kérdés": "Ki hozta létre a  Windows operációs rendszert?",
            "típus": "single",
            "valaszlehetőségek": ["Bill Gates", "Andrew Tate", "Jack Black", "Steve Buscemi"],
            "jó_valasz": ["Bill Gates"]
        },
        {
            "kérdés": "Honnan származik a gyros?",
            "típus": "single",
            "valaszlehetőségek": ["Mexiko", "Török", "Közel-Kelet", "Oszmán-Birodalom"],
            "jó_valasz": ["Oszmán-Birodalom"]
        },
        {
            "kérdés": "Melyek az output eszközök?",
            "típus": "multiple",
            "valaszlehetőségek": ["joystick", "monitor", "egér","hangszóró" ],
            "jó_valasz": ["monitor", "hangszóró"]
        }
    ]

    random.shuffle(kerdesek)  

    user_answers = {}

    def submit(e):
        score = 0
        total = len(kerdesek)
        for i, q in enumerate(kerdesek):
            if q["típus"] == "single":
                if user_answers.get(i) in q["jó_valasz"]:
                    score += 1
            elif q["típus"] == "multiple":
                if set(user_answers.get(i, [])) == set(q["jó_valasz"]):
                    score += 1
        result_text.value = f"You scored {score} out of {total}"
        page.update()

    def create_question_ui(q, index):
        if q["típus"] == "single":
            options = q["valaszlehetőségek"]
            random.shuffle(options)  
            radio_group = ft.RadioGroup(
                content=ft.Column(
                    [ft.Radio(label=o, value=o) for o in options],
                    spacing=10
                ),
                on_change=lambda e: user_answers.update({index: e.control.value})
            )
            return ft.Column([ft.Text(q["kérdés"])] + [radio_group])
        elif q["típus"] == "multiple":
            valaszok = q["valaszlehetőségek"]
            random.shuffle(valaszok)  
            checkboxes = [
                ft.Checkbox(label=o, on_change=lambda e, o=o: update_multiple_answers(index, o, e.control.value))
                for o in valaszok
            ]
            return ft.Column([ft.Text(q["kérdés"])] + checkboxes)

    def update_multiple_answers(index, option, checked):
        if index not in user_answers:
            user_answers[index] = []
        if checked:
            user_answers[index].append(option)
        else:
            user_answers[index].remove(option)

    question_uis = [create_question_ui(q, i) for i, q in enumerate(kerdesek)]
    submit_button = ft.ElevatedButton(text="Submit", on_click=submit)
    result_text = ft.Text()

    scrollable_column = ft.Column(
        controls=question_uis + [submit_button, result_text],
        scroll="always"
        
    )

    page.add(scrollable_column)

ft.app(target=main)