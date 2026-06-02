<head>
    <meta charset="UTF-8">
    <title>Deletar Acomodação</title>
    <link rel="stylesheet" href="style.css">
</head>

<script>

    function confirmarExclusao(){

        return confirm(
            "Deseja realmente excluir esta acomodação?"
        );
     }

</script>

<body>
    
    <div class="container">
        
        <h1>Deletar Acomodação</h1>

        <form action="controle_acomodacao" method="post">

            <label>ID da acomodação:</label>
            <input type="number" name="txtid" required>
                
            <div class="botoes"> 
                    <input type="submit" 
                        name="op" 
                        value="CONFIRMAR DELETAR" 
                        onclick="return confirmarExclusao()">
           </div>
            
        </form>

        <a class="voltar" href="index.html">Voltar</a>
    
    </div>

</body>
