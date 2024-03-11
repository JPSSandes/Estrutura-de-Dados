class FilaEstaticaCircular(tamanho: Int = 10): Enfileiravel {
    private var ponteiroInicio: Int = 0
    private var ponteiroFim: Int = 0
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade: Int = 0

    // métodos auxiliares
    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String {
        var impressao: String = "["
        var ponteiroAux: Int = ponteiroInicio

        for (i in 0 .. quantidade - 1) {
            if (i == quantidade - 1) {
                impressao += "${dados[ponteiroAux % dados.size]}"
            } else {
                impressao += "${dados[ponteiroAux % dados.size]}, "
                ponteiroAux++
            }
        }

        return "$impressao]"
    }

    // métodos principais
    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            dados[ponteiroInicio] = dado
        } else {
            println("Fila Vazia!")
        }
    }

    override fun enfileirar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim++
            if (ponteiroFim == dados.size) {
                ponteiroFim = 0
            }
            quantidade++
            dados[ponteiroFim]  = dado
        } else {
            println("Fila Cheia!")
        }
    }

    override fun desenfileirar(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroInicio]
            ponteiroInicio++
            if  (ponteiroInicio == dados.size) {
                ponteiroInicio = 0
            }
            quantidade--
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun frente(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroInicio]
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

}