class PilhaEstaticaDupla(tamanho: Int = 10): EmpilhavelDuplo {
    private var ponteiroTopo1: Int = -1
    private var ponteiroTopo2: Int = tamanho
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    // auxiliares pilha 1
    override fun estaCheia1(): Boolean {
        return (ponteiroTopo1 == ponteiroTopo2 - 1)
    }

    override fun estaVazia1(): Boolean {
        return (ponteiroTopo1 == -1)
    }

    override fun imprimir1(): String {
        var impressao: String = "["

        for (i in ponteiroTopo1 downTo 0) {
            if (i == 0) {
                impressao += "${dados[i]}"
            } else {
                impressao += "${dados[i]}, "
            }
        }

        return "${impressao}]"
    }

    // auxiliares pilha 2
    override fun estaCheia2(): Boolean {
        return estaCheia1()
    }

    override fun estaVazia2(): Boolean {
        return (ponteiroTopo2 == dados.size)
    }

    override fun imprimir2(): String {
        var impressao: String = "["

        for (i in ponteiroTopo2 .. dados.size - 1) {
            if (i == dados.size - 1) {
                impressao += "${dados[i]}"
            } else {
                impressao += "${dados[i]}, "
            }
        }

        return "${impressao}]"
    }

    // principais pilha 1
    override fun empilhar1(dado: Any?) {
        if (!estaCheia1()) {
            ponteiroTopo1++
            dados[ponteiroTopo1] = dado
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun desempilhar1(): Any? {
        var retorno: Any? = null

        if (!estaVazia1()) {
            retorno  = dados[ponteiroTopo1]
            ponteiroTopo1--
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }
    override fun topo1(): Any? {
        var retorno: Any? = null

        if (!estaVazia1()) {
            retorno  = dados[ponteiroTopo1]
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    // principais pilha 2
    override fun empilhar2(dado: Any?) {
        if (!estaCheia2()) {
            ponteiroTopo2--
            dados[ponteiroTopo2] = dado
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun desempilhar2(): Any? {
        var retorno: Any? = null

        if (!estaVazia2()) {
            retorno = dados[ponteiroTopo2]
            ponteiroTopo2++
        }

        return retorno
    }

    override fun topo2(): Any? {
        var retorno: Any? = null

        if (!estaVazia2()) {
            retorno = dados[ponteiroTopo2]
        }

        return retorno
    }
}