interface Enfileiravel {
    // métodos principais
    fun enfileirar(dado: Any?)
    fun desenfileirar(): Any?
    fun atualizar(dado: Any?)
    fun frente(): Any?

    //  métodos auxiliares
    fun estaCheia(): Boolean
    fun estaVazia(): Boolean
    fun imprimir(): String
}