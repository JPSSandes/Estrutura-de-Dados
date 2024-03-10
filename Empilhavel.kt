interface Empilhavel {
    // métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String

    // métodos principais
    fun empilhar(dado: Any?)
    fun desempilhar(): Any?
    fun topo(): Any?
}