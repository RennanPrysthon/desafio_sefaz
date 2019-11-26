<!DOCTYPE html>
<html lang="en">
<head>
    <title>Login</title>
    <link href="css/login.css" rel="stylesheet">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
</head>
<body>
    <div class="main">
        <form class="formulario">
            <div class="form-group">
                <label for="exampleInputEmail1">Email</label>
                <input type="email" class="form-control" id="email" aria-describedby="emailHelp" placeholder="email@example.com">
            </div>
            <div class="form-group">
                <label for="exampleInputPassword1">Senha</label>
                <input type="password" class="form-control" id="pass" placeholder="*****">
            </div>
            <a id="btnEntrar" class="btn btn-primary">Entrar</a>
            <a href="/cadastrar" class="btn btn-primary">Cadastrar</a>
        </form>
    </div>
    <script src="js/jquery.js"></script> 
    <script src="js/login.js"></script>
</body>
</html>