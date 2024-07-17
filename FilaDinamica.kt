class FilaDinamica (private val tamanho: Int = 10) :Enfileiravel {
    private var ponteiroFrente: NoDuplo? = null
    private var ponteiroTras: NoDuplo? = null
    private var quantidade: Int = 0

    // metodos 1 //

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var ponteiroAux: NoDuplo? = ponteiroFrente
        var resultado =  "["

        for (i in 0 until quantidade) {
            resultado += "${ponteiroAux?.dado}"

            if (i != quantidade - 1) {
                resultado += ", "
            }

            ponteiroAux = ponteiroAux?.proximo
        }

        return "$resultado]"
    }

    // metodos 2 //

    override fun atualizar(dado: Any?) {
        if (!estaVazia()) {
            ponteiroFrente?.dado = dado
        } else {
            println("Fila Vazia!");
        }
    }

    override fun enfileirar(dado: Any?) {
        if (!estaCheia()) {
            var noAux = NoDuplo(dado)
            noAux.anterior = ponteiroTras
            if (!estaVazia()) {
                ponteiroTras?.proximo = noAux
            } else {
                ponteiroFrente = noAux
            }

            ponteiroTras = noAux
            quantidade++
        } else {
            println("Fila Cheia!");
        }
    }

    override fun desenfileirar(): Any? {
        var dadoAux: Any? = null

        if (!estaVazia()) {
            dadoAux = ponteiroFrente?.dado
            ponteiroFrente = ponteiroFrente?.proximo
            quantidade--
            if (!estaVazia()) {
                ponteiroFrente?.anterior = null
            } else {
                ponteiroTras = null
            }
        } else {
            println("Fila Vazia!");
        }

        return dadoAux
    }

    override fun frente(): Any? {
        var dadoAux: Any? = null

        if (!estaVazia()) {
            dadoAux = ponteiroFrente?.dado
        } else {
            println("Fila Vazia!");
        }

        return dadoAux
    }
}