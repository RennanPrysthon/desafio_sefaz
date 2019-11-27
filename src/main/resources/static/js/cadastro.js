const api = "https://rennan-desafio-sefaz.herokuapp.com/usuario";

$("#btnCadastrar").click(() => {
    user = {
        nome: $("#nome").val(), 
        email: $("#email").val(),
        senha:$("#pass").val()
    };
    $("#nome").val("");
    $("#email").val("");
    $("#pass").val("");
    $.ajax({ 
        type: 'POST',
        url: api,
        contentType: 'application/json',
        data: JSON.stringify(user),
        dataType: 'json',
        success: () => {}
    })
});

$("#btnVoltar").click(() => {
    window.history.back();
});

$("#btnSair").click(() => {
    localStorage.removeItem("token");
    localStorage.removeItem("id");
    window.location.href = "/logar";
})