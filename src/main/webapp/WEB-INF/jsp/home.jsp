<!DOCTYPE html>
<html lang="en">
<head>
    <title>Tela principal</title>
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
        <span class="navbar-text">
            <a class="nav-link" id="btnSair">Sair</a>
        </span>
    </nav>
    <div class="main">
        <table class="table table-hover">
            <thead>
                <tr>
                <th scope="col">#</th>
                <th scope="col">Nome</th>
                <th scope="col">Email</th>
                <th scope="col">Quantidade de numeros</th>
                <th></th>
                <th></th>
                <th></th>
                </tr>
            </thead>
            <tbody id="lista-usuarios"></tbody>
        </table>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/home.js"></script>
</body>
</html>