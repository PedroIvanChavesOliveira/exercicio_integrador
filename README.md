# exercicio_integrador

Até agora nós vimos programação orientada a objetos com Kotlin (com e sem
objetos), herança, classes abstratas, interfaces e exceções. Vamos utilizar alguns
destes conceitos para desenvolver o um sistema de administração de estoque
de uma Livraria/Biblioteca. Para isto, temos os seguintes requisitos:

1. Uma classe Livraria/Biblioteca contendo nome e data de criação;

2. Uma classe Livro com código, título, autor, ano de lançamento, preço de
venda, preço de aluguel (por dia) e estado atual (disponível, alugado ou
vendido);

3. Uma classe Cliente com nome, rg e histórico de aluguéis e compras;

4. Uma classe Funcionário com nome, rg e histórico dos aluguéis e vendas;

5. A biblioteca/livraria deve ter os seguintes métodos:

    a. Cadastrar Livro - Deve incluir um novo livro com todas as
    informações necessárias.

    b. Cadastrar Coleção - Deve incluir uma nova coleção com todas as
    informações necessárias, incluindo a lista de livros.

    c. Consultar Livro/Coleção por código ou por nome - Exibe as
    informações sobre o livro/coleção com o código digitado. Se não
    existir nenhum livro/coleção com esse código, exibir a mensagem
    “Livro/coleção não encontrado”.

    d. Alugar Livro/Coleção - Altere o estado do livro/coleção para
    alugado.

    e. Efetuar venda (por código) - Se o usuário selecionar esta opção,
    ele deve informar o código do livro ou da coleção que será vendido.

    f. Verificar estoque - O sistema deve retornar o número de livros
    disponíveis, alugados e vendidos e também somar o valor dos livros
    vendidos.
