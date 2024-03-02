class PilhaInvertida : IPilhaInvertida {
    private var ponteiroTopo: Int
    private var dados: Array<Any?>

    constructor(tamanho: Int) {
        ponteiroTopo = tamanho
        dados = arrayOfNulls(tamanho)
    }

    constructor() : this(10)

    override fun isFull(): Boolean {
        return (ponteiroTopo == 0)
    }

    override fun isEmpty(): Boolean {
        return (ponteiroTopo == dados.size)
    }

    override fun print(): String {
        var retorno: String = "["

        for (i in ponteiroTopo until dados.size - 1) {
            if (i == dados.size - 1)
                retorno += "${dados[i]}"
             else
                 retorno += "${dados[i]}, "

        }

        return "$retorno]"
    }

    override fun addToStack(dado: Any?) {
        if (!isFull()) {
            ponteiroTopo--
            dados[ponteiroTopo] = dado
        } else
            println("Stack is Full!")

    }

    override fun removeFromStack(): Any? {
        var retorno: Any? = null

        if (!isEmpty()) {
            retorno = dados[ponteiroTopo]
            ponteiroTopo++
        } else
            println("Stack is Empty")


        return retorno
    }

    override fun top(): Any? {
        var retorno: Any? = null

        if (!isEmpty())
            retorno = dados[ponteiroTopo]
         else
            println("Stack is Empty")


        return retorno
    }
}