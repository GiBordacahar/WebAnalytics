<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
	
    <title>Web Analytics</title>

    <!-- Bootstrap -->
	<link rel="icon" 
      type="image/png" 
      href="imgs/web-analytics.png">
    <link href="css/bootstrap.min.css" rel="stylesheet">
	<link href="css/style.css" rel="stylesheet">

    <!-- HTML5 Shim and Respond.js IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
      <script src="https://oss.maxcdn.com/html5shiv/3.7.2/html5shiv.min.js"></script>
      <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
  </head>
  <body>
  
      <div class="navbar navbar-inverse navbar-fixed-top" role="navigation">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target=".navbar-collapse">
            <span class="sr-only">Toggle navigation</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
		  <ul class="nav navbar-nav">
		  <li><a style="font-size:18px; color:#FFFFFF;" href="index.html">Web Analytics</a></li>
		  </ul>
        </div>
        <div class="navbar-collapse collapse">
          <form class="navbar-form navbar-right" role="form" method="POST" action="Login">
            <div class="form-group">
              <input name="text" type="text" placeholder="Email" class="form-control">
            </div>
            <div class="form-group">
              <input name="password" type="password" placeholder="Password" class="form-control">
            </div>
            <button type="submit" value="Enviar" class="btn btn-success">Log in</button>
          </form>
        </div><!--/.navbar-collapse -->
      </div>
    </div>
	<!-- Main jumbotron for a primary marketing message or call to action -->
    <div class="jumbotron">
      <div class="container">
		
        <h1><img src="imgs/web_analytics.png"> Web Analytics</h1>
        <p>Fácil y rápido de usar. Solo debes registrarte, colocar un pequeño pedazo de código en las paginas que quieres monitorizar, y listo! Web Analytics hace el resto por ti. Incluye un panel de acceso rápido a los informes que desees.</p>
        <p><a class="btn btn-primary btn-lg" role="button">Aprende mas &raquo;</a></p>
		<p><a class="btn btn-success btn-primary btn-lg" role="button" href="signup.html">Registrate YA!</a></p>
      </div>
    </div>

    <div class="container">
      <!-- Example row of columns -->
      <div class="row">
        <div class="col-md-6">
          <h2>Fácil</h2>
          <p>Accede a toda la informacion acerca de tu web en un abrir y cerrar de ojos.</p>
          <p><a class="btn btn-default" href="#" role="button">Ver detalles &raquo;</a></p>
        </div>
        <div class="col-md-6">
          <h2>Rápido</h2>
          <p>Desde el momento en que insertas el codigo, se empieza a procesar información! </p>
          <p><a class="btn btn-default" href="#" role="button">Ver detalles &raquo;</a></p>
       </div>
      </div>

      <hr>

      <footer>
        <p>&copy; Grupo 3 2014</p>
      </footer>
    </div> <!-- /container -->
	
    <!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
    <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.1/jquery.min.js"></script>
    <!-- Include all compiled plugins (below), or include individual files as needed -->
    <script src="js/bootstrap.min.js"></script>
  </body>
</html>