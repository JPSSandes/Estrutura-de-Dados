interface EmpilhavelDuplo {
    // auxiliares da Pilha 1
    fun estaCheia1(): Boolean
    fun estaVazia1(): Boolean
    fun imprimir1(): String

    // auxiliares da Pilha 2
    fun estaCheia2(): Boolean
    fun estaVazia2(): Boolean
    fun imprimir2(): String

    // principais da Pilha 1
    fun empilhar1(dado: Any?)
    fun desempilhar1(): Any?
    fun topo1(): Any?

    // principais da Pilha 2
    fun empilhar2(dado: Any?)
    fun desempilhar2():Any?
    fun topo2():Any?
}