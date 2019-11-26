const api = "http://localhost:8080/usuario"; //Fazer endpoint de login
const token = localStorage.getItem("token");

$(document).ready(()=> {
    if(token == null) {
        window.location.href ="/logar";
    }
    $.ajax({
        url: api ,
        type: 'GET',
        // Fetch the stored token from localStorage and set in the header
        headers: {"Authorization": localStorage.getItem('token')},
        success: (msg, status, jqXHR) => {
            const user = jqXHR.responseJSON;
            user.map(x => {
                $("#lista-usuarios").append(`
                    <tr>
                        <td>${x.id}</td>
                        <td>${x.nome}</td>
                        <td>${x.email}</td>
                        <td>${x.quantidadesTelefones}</td>
                        <td><a href="/verTelefones?id=${x.id}">Ver telefones cadastrados</a></td>
                        <td><a href="/editarUsuario?id=${x.id}">Editar</a></td>
                        <td><a href="/removerUsuario?id=${x.id}">Excluir</a></td>
                    </tr>
                `);
            });
        }
    });
});


$("#btnSair").click(() => {
    localStorage.removeItem("token");
    localStorage.removeItem("id");
    window.location.href = "/logar";
})