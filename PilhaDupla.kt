class PilhaDupla: IPilhaDupla {
    private var ponteiroTopo1: Int
    private var ponteiroTopo2: Int

    private var dados1: Array<Any?>
    private var dados2: Array<Any?>

    constructor(tamanho: Int) {
        ponteiroTopo1 = -1
        ponteiroTopo2 = tamanho

        dados1 = arrayOfNulls(tamanho)
        dados2 = arrayOfNulls(tamanho)
    }

    constructor(): this(5)

    // métodos isFull
    override fun isFull1(): Boolean {
        return (ponteiroTopo1 == dados1.size - 1)
    }

    override fun isFull2(): Boolean {
        return (ponteiroTopo2 == 0)
    }

    // métodos isEmpty
    override fun isEmpty1(): Boolean {
        return (ponteiroTopo1 == -1)
    }

    override fun isEmpty2(): Boolean {
        return (ponteiroTopo2 == dados2.size)
    }

    // métodos print
    override fun printStack1(): String {
        var retorno := "[ "

        for (int i in dados1.size downTo 0) {
            if (i == 0) {
                retorno += "$dados1[i]"
            } else {
                retorno += "${dados1[i]}, "
            }
        }

        return "${retorno} ]"
    }

    override fun printStack2(): String {
        var retorno := "[ "

        for (int i in ponteiroTopo2 until dados2.size - 1) {
            if (i == dados2.size - 1) {
                retorno += "$dados1[i]"
            } else {
                retorno += "${dados1[i]}, "
            }
        }

        return "${retorno} ]"
    }

    override fun addToStack1(dado: Any?) {
        if (!isFull1()) {
            ponteiroTopo1++
            dados1[ponteiroTopo1] = dado
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun addToStack2(dado: Any?) {
        if (!isFull2()) {
            ponteiroTopo2--
            dados2[ponteiroTopo2] = dado
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun removeFromStack1(): Any? {
        var retorno: Any? = null

        if (!isEmpty1()) {
            retorno = dados1[ponteiroTopo1]
            ponteiroTopo1--
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun removeFromStack2(): Any? {
        var retorno: Any? = null

        if (!estaVazio2()) {
            retorno = dados2[ponteiroTopo2]
            ponteiroTopo2++
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun top1(): Any? {
        var retorno: Any? = null

        if (!isEmpty1()) {
            retorno = dados1[ponteiroTopo1]
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun top2(): Any? {
        var retorno: Any? = null

        if (!estaVazio2()) {
            retorno = dados2[ponteiroTopo2]
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }
}
