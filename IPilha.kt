interface IPilha{
    // métodos auxiliares
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun print(): String
    // métodos principais
    fun addToStack(dado: <Any?>)
    fun removeFromStack(): Any?
    fun top(): Any?
}