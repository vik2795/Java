function validateForm() {
    let x = document.forms["vnev"]["utnev"].value;
    if (x == "") {
      alert("A mező nem lehet üres");
      return false;
    }
  }
  var vnev=document.getElementById("vnev").value;  
  var utnev=document.getElementById("utnev").value;  
  var szam=document.getElementById("szam").value;  
  
 