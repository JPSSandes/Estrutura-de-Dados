interface IPilhaInvertida {
    fun isFull(): Boolean
    fun isEmpty(): Boolean
    fun print(): String
    fun addToStack(dado: Any?)
    fun removeFromStack(): Any?
    fun top(): Any?
}