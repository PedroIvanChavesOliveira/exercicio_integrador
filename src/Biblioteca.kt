class Biblioteca(var nome: String, var dataCriacao: String) {

    var listaLivros: MutableList<Livro> = mutableListOf()
    var listaColecoes: MutableMap<Int, Colecao> = mutableMapOf()
    var contador = 1
    var controle: Boolean = true

    fun cadastrarLivro(livro: Livro){
        listaLivros.add(livro)
    }


    fun cadastrarColecao(colecao: Colecao){
        listaColecoes[contador] = colecao
        contador++
    }

    fun consultarLivro(id: Int) {
        controle=true
        var lista: MutableList<String> = mutableListOf()
        listaColecoes[id]?.let {
            for(i in it.livros) {
                lista.add(i.titulo)
            }
            println("A coleção $id é composta pelos livros: $lista")
            controle = false
        }

        listaLivros.forEach {
            if(it.codigo == id) {
                println("O livro $id é '${it.titulo}'")
                controle = false
            }
        }
        if(controle) {
            println("Livro/ coleção não encontrado")
        }
    }

    fun alugarLivro(id: Int, estado: String) {
        controle=true

        listaColecoes[id]?.let {
            it.estadoAtual = estado
            println("A coleção $id possue o estado atual de ${it.estadoAtual}")
            controle = false
        }

        listaLivros.forEach {
            if(it.codigo == id) {
                it.estadoAtual = estado
                println("O livro ${it.titulo} possui o estado atual de ${it.estadoAtual}")
                controle = false
            }
        }

        if(controle) {
            println("Livro/ coleção não encontrado")
        }
    }

    fun efetuarVenda(id: Int) {
        listaColecoes[id]?.let {
            it.estadoAtual = "Vendido"
            println("A coleção $id foi ${it.estadoAtual}")
        }

        listaLivros.forEach {
           if (it.codigo == id) {
                it.estadoAtual = "Vendido"
               println("O livro ${it.titulo} foi ${it.estadoAtual}")
            }
        }
    }

    fun verificarEstoque() {
        var countDisponivel = 0
        var countVendido = 0
        var countAlugado = 0
        var venda = 0.0

        listaLivros.forEach {
           var upper =  it.estadoAtual.toUpperCase()

            when (upper) {
                "DISPONIVEL" -> {
                    countDisponivel++
                }
                "VENDIDO" -> {
                    countVendido++
                    venda += it.precoDeVenda
                }
                else -> {
                    countAlugado++
                }
            }
        }

        println("Livros Disponiveis: $countDisponivel\nLivros Alugados: $countAlugado\nLivros Vendidos: $countVendido\n" +
                "Preço Total Vendido: $venda")

        println("--------------------------------------------------")

        countDisponivel = 0
        countVendido = 0
        countAlugado = 0
        venda = 0.0

        listaColecoes.forEach {
            var upper =  it.value.estadoAtual.toUpperCase()

            when (upper) {
                "DISPONIVEL" -> {
                    countDisponivel++
                }
                "VENDIDO" -> {
                    countVendido++
                    for (i in it.value.livros) {
                        venda += i.precoDeVenda
                    }
                }
                else -> {
                    countAlugado++
                }
            }
        }

        println("Coleções Disponiveis: $countDisponivel\nColeções Alugadas: $countAlugado\nColeções Vendidas: $countVendido\n" +
                "Preço Total Vendido: $venda")

    }
}