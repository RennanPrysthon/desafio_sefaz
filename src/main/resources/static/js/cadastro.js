const api = "http://localhost:8080/usuario";

$("#btnCadastrar").click(function() {
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