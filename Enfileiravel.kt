interface Enfileiravel {
    // métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String

    // métodos principais
    fun atualizar(dado: Any?)
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun frente(): Any?
}