//Grupo: Vinicios Alves e Pedro Chaves

fun main() {
    val livro1 = Livro(1, "A Cabana", "J.K. Howlin", 2005, 120.0,
        10.0, "Disponivel")
    val livro2 = Livro(2, "O cravo e a rosa", "J.K. Stuart", 2005, 150.0,
        10.0, "Disponivel")
    val livro3 = Livro(3, "Hoje e ontem", "J.K. Tokkien", 2005, 200.0,
        10.0, "Disponivel")
    val livro4 = Livro(4, "Ponta de lança", "J.K. Anthony", 2005, 20.0,
            10.0, "Disponivel")
    val livro5 = Livro(5,"Estatal", "J.K. Lobato", 2005, 10.0,
            10.0, "Disponivel")
    val livro6 = Livro(6, "Foco na medalha", "J.K. Oliveira", 2005, 90.0,
            10.0, "Disponivel")

    val colecao1 = Colecao(mutableListOf(livro2, livro3), "Disponivel")
    val colecao2 = Colecao(mutableListOf(livro6), "Disponivel")

    val biblioteca = Biblioteca("Biblioteca Central", "1950")

    biblioteca.cadastrarLivro(livro1)
    biblioteca.cadastrarLivro(livro4)
    biblioteca.cadastrarLivro(livro5)

    biblioteca.cadastrarColecao(colecao1)
    biblioteca.cadastrarColecao(colecao2)

    biblioteca.listaColecoes.forEach {
        for (i in it.value.livros) {
            println("${it.key}- ${i.autor}")
        }
    }
    println("--------------------------------------------------")
    biblioteca.consultarLivro(1)
    println("--------------------------------------------------")
    biblioteca.alugarLivro(2, "Alugado")
    println("--------------------------------------------------")
    biblioteca.efetuarVenda(1)
    println("--------------------------------------------------")
    biblioteca.efetuarVenda(5)
    println("--------------------------------------------------")
    biblioteca.verificarEstoque()

}




