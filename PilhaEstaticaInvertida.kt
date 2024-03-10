class PilhaEstaticaInvertida(tamanho: Int = 10): Empilhavel {
    private var ponteiroTopo: Int = tamanho
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    // métodos auxiliares
    override fun estaCheia(): Boolean {
        return (ponteiroTopo == 0)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroTopo == dados.size)
    }

    override fun imprimir(): String {
        var impressao = "["

        for  (i in ponteiroTopo .. dados.size - 1) {
            if (i == dados.size - 1) {
                impressao += "${dados[i]}"
            } else {
                impressao += "${dados[i]}, "
            }
        }

        return "$impressao]"
    }

    // métodos principais
    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroTopo--
            dados[ponteiroTopo] = dado
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun desempilhar(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroTopo]
            ponteiroTopo++
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun topo(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroTopo]
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }
}