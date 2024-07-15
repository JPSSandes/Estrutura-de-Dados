class PilhaDinamica(private val tamanho: Int = 10) : Empilhavel {
    private var ponteiroTopo: NoDuplo? = null
    private var quantidade: Int = 0

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var ponteiroAux = ponteiroTopo
        var resultado = "["

        for (i in 1..quantidade) {
            resultado += "${ponteiroAux?.dado}"

            if (i != quantidade) {
                resultado += ", "
            }

            ponteiroAux = ponteiroTopo?.anterior
        }

        return "$resultado]"
    }

    override fun empilhar(dado: Any?) {
        if (!estaCheia()) {
            var noAux: NoDuplo? = NoDuplo(dado)
            ponteiroTopo?.proximo = noAux

            if (!estaVazia()) {
                noAux?.anterior = ponteiroTopo
            }

            ponteiroTopo = noAux
            quantidade++
        } else {
            println("Pilha Cheia!")
        }
    }

    override fun desempilhar(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = ponteiroTopo?.dado
            ponteiroTopo = ponteiroTopo?.anterior
            quantidade--
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }

    override fun topo(): Any? {
        var retorno: Any? = null

        if (!estaVazia()) {
            retorno = ponteiroTopo?.dado
        } else {
            println("Pilha Vazia!")
        }

        return retorno
    }
}