<html>
<head>
    <title>Formulário</title>
    <!-- Link para o arquivo CSS -->
    <link rel="stylesheet" type="text/css" href="css/styles.css">
</head>
<body>
    <!-- Mini curso front-end -->
    <form action="" onsubmit="return validarDados()" autocomplete="off">
        <!-- Criar uma tabela -->
        <table class="form-table">
            <!-- "<tr>Criar uma linha na tabela</tr>" -->
            <tr>
                <!-- "<td>para Criar uma célula na linha <td/>"  -->
                <td>Nome:</td>
                <td><input type="text" id="nome" name="nome" class="input-field"></td>
            </tr>

            <tr>
                <td>Login:</td>
                <td><input type="text" id="login" name="login" class="input-field"></td>
            </tr>

            <tr>
                <td>Senha:</td>
                <td><input type="password" id="senha" name="senha" class="input-field"></td>
            </tr>
            <tr>
                <td></td>
                <!-- "<td>Célula vazia para alinhamento</td>" -->
                <td><input type="submit" value="Salvar" class="submit-button"></td>
            </tr>
        </table>
    </form>
    <script type="text/javascript">
    	function validarDados() {
			var nome = document.getElementById("nome").value.trim();
			var login = document.getElementById("login").value.trim();
			var senha = document.getElementById("senha").value.trim();
			
			if (nome === ''){
				alert('Informe o nome!');
				return false;
			} else if (login === ''){
				alert('Informe o login!');
				return false;
			} else if (senha === ''){
				alert('Informe a senha!');
				return false;
			}
			return true;	
		}    
    </script>
</body>
</html>


