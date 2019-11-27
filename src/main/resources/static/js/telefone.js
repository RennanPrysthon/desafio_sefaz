const api = "https://rennan-desafio-sefaz.herokuapp.com/telefone"; //Fazer endpoint de login
const token = localStorage.getItem("token");

$(document).ready(() => {
    if(token == null) {
        window.location.href ="/logar";
    }
})

$("#btnAddTelefone").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    telefone = {
        ddd: $("#ddd").val(),
        numero: $("#numero").val(),
        tipo: $("#tipo").val()
    }
    $("#ddd").val("");
    $("#numero").val("");
    $("#tipo").val("");
    $.ajax({ 
        type: 'POST',
        url: `${api}/${id}`,
        headers: {"Authorization": localStorage.getItem('token')},
        contentType: 'application/json',
        data: JSON.stringify(telefone),
        dataType: 'json',
        success: window.location.href = `/verTelefones?id=${id}`
    });
});

$("#btnVoltar").click(() => {
    var idUser =  $("#idUser");
    var id = idUser.val();
    window.location.href = `/verTelefones?id=${id}`
})

$("#btnSair").click(() => {
    localStorage.removeItem("token");
    window.location.href = "/logar";
})