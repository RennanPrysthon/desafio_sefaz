const api = "http://localhost:8080/usuario"; //Fazer endpoint de login

$(document).ready(()=> {
    $.get(api, (data) => {
        data.map(x => {
            console.log(x)
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
        })
    })
});