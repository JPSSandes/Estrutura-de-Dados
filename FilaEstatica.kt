class FilaEstatica(tamanho: Int = 10): Enfileiravel {
    // variáveis globais da classe
    private var ponteiroFrente: Int = 0;
    private var ponteiroTras: Int = -1;
    private var dados: Array<Any?> = arrayOfNulls(tamanho)

    // métodos principais
    override fun enfileirar(dado: Any?) {
        if (!estaVazia()) {
            ponteiroTras++
            dados[ponteiroTras] = dado
        }
    }

    override fun desenfileirar(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroFrente]
            ponteiroFrente++
        } else {
            println("Empty Stack")
        }

        return retorno
    }

    override fun atualizar(dado: Any?) {
        if(!estaVazia()) {
            dados[ponteiroFrente] = dado
        } else {
            println("Empty Stack")
        }
    }

    override fun frente(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = dados[ponteiroFrente]
        } else {
            println("Empty Stack")
        }

        return retorno
    }

    // métodos auxiliares
    override fun estaCheia(): Boolean {
        return (ponteiroTras == dados.size - 1)
    }

    override fun estaVazia(): Boolean {
        return (ponteiroFrente == ponteiroTras + 1)
    }

    override fun imprimir(): String {
        var retorno  = "["

        for (i in ponteiroFrente..ponteiroTras) {
            if (i == ponteiroTras)
                retorno += "${dados[i]}"
            else
                retorno += "${dados[i]}, "
        }

        return "$retorno]"
    }


}