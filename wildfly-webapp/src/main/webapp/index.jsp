<html>
<head>
    <title>WildFly Web App</title>

    <!-- Corrigido o erro de digitação no atributo 'rel' -->
    <link rel="stylesheet" type="text/css" href="CSS/styles.css">
    
    <script type="text/javascript">
        // Função para atualizar a data e hora
        function updateDateTime() {
            var now = new Date();

            // Obter a data
            var day = now.getDate().toString().padStart(2, '0'); // Dia com 2 dígitos
            var month = (now.getMonth() + 1).toString().padStart(2, '0'); // Mês (meses começam do 0)
            var year = now.getFullYear();

            // Obter a hora
            var hours = now.getHours().toString().padStart(2, '0');
            var minutes = now.getMinutes().toString().padStart(2, '0');
            var seconds = now.getSeconds().toString().padStart(2, '0');

            // Formatando a data e hora
            var dateString = day + '/' + month + '/' + year;
            var timeString = hours + ':' + minutes + ':' + seconds;

            // Atualizar o conteúdo dos elementos com id 'dateTime'
            document.getElementById('dateTime').textContent = dateString + " " + timeString;
        }

        // Atualizar a data e hora a cada segundo
        setInterval(updateDateTime, 1000);
    </script>
</head>
<body>
    <h1>Bem-vindo ao WildFly!</h1>
    <h2>
        Se a mensagem apareceu, o WildFly foi instalado
        <%= "corretamente" %>.
    </h2>

    <!-- Exibindo a data e a hora na mesma linha -->
    <p class="small-red-text">Hora Atual: <span id="dateTime"></span></p>

    <!-- Texto com estilo para exibir a data e hora -->
    <p class="small-blue-text">Criado em 24/12/2024 às 10:56 por JRS</p>
</body>
</html>



