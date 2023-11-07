<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet"
		integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">


	<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js"
		integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz"
		crossorigin="anonymous"></script>

	<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.1/css/all.min.css"
		integrity="sha512-MV7K8+y+gLIBoVD59lQIYicR65iaqukzvf/nwasF0nqhPay5w/9lJmVM2hMDcnK1OnMGCdVK+iQrJ7lzPJQd1w=="
		crossorigin="anonymous" referrerpolicy="no-referrer" />


<link rel="stylesheet" type="text/css" href="style.css">
	

<title>Atualizar</title>
</head>
<body>
    <!-- Cabeçalho -->
    <header>
       <nav class="navbar navbar-expand-lg bg-body-tertiary">

			<div id="navbar" class="container-fluid">

				<a class="navbar-brand" href="index.html"> <img
					src="img/logo.png" width="150" height="100"></a>
				<button class="navbar-toggler" type="button"
					data-bs-toggle="collapse" data-bs-target="#navbarSupportedContent"
					aria-controls="navbarSupportedContent" aria-expanded="false"
					aria-label="Toggle navigation">
					<span class="navbar-toggler-icon"></span>
				</button>

				<div class="collapse navbar-collapse" id="navbarSupportedContent">
					<ul class="navbar-nav me-auto mb-2 mb-lg-0">
						<li class="nav-item"><a class="nav-link active"
							aria-current="page" href="index.html">Home</a></li>
						<li class="nav-item"><a class="nav-link" href="destino.html">Destino</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="promocao.html">Promoções</a>
						</li>

						<li class="nav-item"><a class="nav-link" href="cadastro.jsp">Cadastros</a>
						</li>
						<li class="nav-item"><a class="nav-link" href="contatos.html">Contatos</a>
						</li>
					</ul>
					<form class="d-flex" role="search">
						<input class="form-control me-2" type="search" placeholder=""
							aria-label="Search">
						<button class="btn btn-outline-success" type="submit">Pesquisar</button>
					</form>
				</div>
			</div>
		</nav>
    </header>
	<div class="container">
		<div class="row justify-content-center">
			<div class="col-md-6">
				<h1 class="mt-5" >Atualizar de Cliente</h1>
				<form class="mt-5" action="UpdateController" method="POST">
				<div class="form-group">
						<label for="idCliente">ID:</label> <input type="text"
							class="form-control" id="idCliente" name="idCliente" value="${cliente.idCliente}" readonly>
					</div>
					<div class="form-group">
						<label for="Nome">Nome:</label> <input type="text"
							class="form-control" id="nome" name="nome" value="${cliente.nome}" required>
					</div>
					<div class="form-group">
						<label for="Cpf">CPF:</label> <input type="text"
							class="form-control" id="cpf" name="cpf" value="${cliente.cpf}" required>
					</div>
					<div class="form-group">
						<label for="Telefone">Telefone:</label> <input type="text"
							class="form-control" id="telefone" name="telefone" value="${cliente.telefone}" required>
					</div>
					<div class="form-group">
						<label for="Endereco">Endereço:</label> <input type="text" value="${cliente.endereco}"
						 class="form-control" id="endereco"
							name="endereco" required>
							<div class="form-group">
							
						   <label for="Email">Email:</label> <input type="text"
							class="form-control" id="email" name="email" value="${cliente.email}" required>
					</div>
					</div>
					<button type="submit" class="btn btn-primary">Atualizar</button>
				</form>
			</div>
		</div>
	</div>
	 <!-- Rodapé -->
	 <footer>
   <div id="rodape" class="container-fluid p-4">
		<!-- Grid row -->
		<div class="row">
			<!-- Grid column -->
			<div class="col-lg-4 col-md-6 mb-4 mb-md-0">
				<img src="img/logo.png" class="img-fluid" alt="Logo" width="200" height="150">
			</div>

			<!-- Grid column -->
			<div class="col-lg-4 col-md-6 mb-4 mb-md-0">
				<h4 class="footer h4"> Redes Sociais </h4>
				<a href="#" class="footer-link" id="instagram">
					<i class="fab fa-instagram fa-2x"></i>
				</a>
				<a href="#" class="footer-link" id="facebook">
					<i class="fab fa-facebook fa-2x"></i>
				</a>
				<a href="#" class="footer-link" id="whatsapp">
					<i class="fab fa-whatsapp fa-2x"></i>
				</a>
				<a href="#" class="footer-link" id="twitter">
					<i class="fab fa-twitter fa-2x"></i>
				</a>
			</div>

			<!-- Grid column -->
			<div class="col-lg-4 col-md-12 mb-4 mb-md-0">
				<h4 class="footer h4">Formas de Pagamento</h4>
				<img src="img/pagamento.png" class="img-fluid" alt="Formas de Pagamento" width="300" height="200">
			</div>
			<!-- Copyright -->
			<div class="text-center p-3">
				<h4 class="footer h4"> &copy; 2023 Belém Tour. Todos os direitos reservados</h4>


			</div>

		</div>

	</div>
</footer>
   

</body>
</html>