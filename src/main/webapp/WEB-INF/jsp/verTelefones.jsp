<!DOCTYPE html>
<html lang="en">
<head>
    <title>Telefones</title>
    <link href="css/home.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="/home">Home</a>
        <div class="collapse navbar-collapse" id="navbarSupportedContent">
            <ul class="navbar-nav mr-auto">
                <li class="nav-item">
                    <a class="nav-link" href="/cadastrar">Adicionar usuario</a>
                </li>
            </ul>
        </div>
    </nav>
    <input type="hidden" id="idUser" value="<%= request.getParameter("id") %>">
    <div class="main">
        <div id="usuario">

        </div>
        <table class="table table-hover">
            <thead>
                <tr>
                    <th scope="col">ddd</th>
                    <th scope="col">numero</th>
                    <th scope="col">tipo</th>
                </tr>
            </thead>
            <tbody id="lista-usuarios"></tbody>
        </table>
        <a id="btnAddTelefone" class="btn btn-primary">Adicionar telefone</a>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/listaTelefones.js"></script>
</body>
</html>