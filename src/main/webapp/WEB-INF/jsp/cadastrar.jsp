<!DOCTYPE html>
<html lang="en">
<head>
    <title>Cadastro</title>
    <link href="css/cadastro.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <div class="main">
        <form class="formulario">
            <div class="form-group">
                <label for="exampleInputEmail1">Nome</label>
                <input type="text" class="form-control" id="nome" aria-describedby="emailHelp" placeholder="Nome">
            </div>
            <div class="form-group">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="email@example.com">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Senha</label>
                <input type="password" class="form-control" id="pass" placeholder="*****">
            </div>
            <a id="btnCadastrar" class="btn btn-primary">Cadastro</a>
            <a id="btnVoltar" class="btn btn-primary">Voltar</a>
        </form>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/cadastro.js"></script>
</body>
</html>