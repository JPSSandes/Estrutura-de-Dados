class ListaEstaticaCircular(tamanho: Int = 10): Listavel {
    private var dados: Array<Any?> = arrayOfNulls(tamanho)
    private var quantidade: Int = 0
    private var ponteiroInicio: Int = 0
    private var ponteiroFim: Int = -1

    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            ponteiroFim++
            if (ponteiroFim == dados.size)
                ponteiroFim = 0

            dados[ponteiroFim] = dado
            quantidade++
        } else {
            println("Lista está Cheia!")
        }
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia())
        {
            if  (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                var ponteiroAux = ponteiroFim + 1
                for (i in posicao until quantidade) {
                    var anterior = ponteiroAux - 1

                    if (ponteiroAux == dados.size) {
                        ponteiroAux = 0
                    }

                    var atual = ponteiroAux

                    dados[atual] = dados[anterior]
                    ponteiroAux--
                }

                dados[posicaoFisica] = dado
                ponteiroFim++

                if (ponteiroFim == dados.size) {
                    ponteiroFim = 0
                }
                quantidade++
            } else {
                println("Índice inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia())
        {
            if  (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dadoAux = dados[posicaoFisica]
            } else {
                println("Índice inválido!")
            }
        } else {
            println("Lista Vazia!")
        }

        return dadoAux
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosAux: Array<Any?> = arrayOfNulls(quantidade)
        if (!estaVazia()) {
            var ponteiroAux = ponteiroInicio
            for (i in 0 .. quantidade)
                dadosAux[i] = dados[(ponteiroAux+i) % dados.size]
        }

        return dadosAux
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dados[posicaoFisica] = dado
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia())
        {
            if  (posicao >= 0 && posicao < quantidade) {
                var posicaoFisica = (ponteiroInicio + posicao) % dados.size
                dadoAux = dados[posicaoFisica]
                var ponteiroAux = posicaoFisica
                for (i in posicao .. (quantidade-1)) {
                    var atual = ponteiroAux
                    var proximo = (ponteiroAux+1)%dados.size

                    dados[atual] = dados[proximo]
                    ponteiroAux++
                }
                ponteiroFim--
            } else {
                println("Índice inválido!")
            }
        } else {
            println("Lista Vazia!")
        }

        return dadoAux
    }

    override fun apagarTodos(): Array<Any?> {
        TODO("Not yet implemented")
    }

    override fun limpar() {
        TODO("Not yet implemented")
    }

    override fun estaCheia(): Boolean {
        return (quantidade == dados.size)
    }

    override fun estaVazia(): Boolean {
        return (quantidade == 0)
    }

    override fun imprimir(): String {
        var impressao = "["
        var ponteiroAux = ponteiroFim

        for (i in 0 .. quantidade) {
            if (i == ponteiroAux) {
                impressao += "${dados[(ponteiroAux+i) % dados.size]} "
            } else {
                impressao += "${dados[(ponteiroAux+i) %  dados.size]}, "
            }
        }

        return "${impressao}]"
    }
}