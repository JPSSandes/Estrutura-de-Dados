class ListaDinamica(private val tamanho: Int = 10) : Listavel {
    // variáveis //

    private var ponteiroInicio: NoDuplo? = null
    private var ponteiroFim: NoDuplo? = null
    private var quantidade: Int = 0

    // métodos 1 //

    override fun anexar(dado: Any?) {
        if (!estaCheia()) {
            val noTemp = NoDuplo(dado)
            noTemp.anterior = ponteiroFim

            if (!estaVazia()) {
                ponteiroFim?.proximo = noTemp
            } else {
                ponteiroInicio = noTemp
            }

            ponteiroFim = noTemp
            quantidade++
        } else {
            println("Lista Cheia!")
        }
    }

    override fun inserir(posicao: Int, dado: Any?) {
        if (!estaCheia()) {
            if (posicao >= 0 && posicao <= quantidade) {
                val noTemp = NoDuplo(dado)
                var ponteiroAnterior: NoDuplo? = null
                var ponteiroProximo = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAnterior = ponteiroProximo
                    ponteiroProximo = ponteiroProximo?.proximo
                }

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = noTemp
                } else {
                    ponteiroInicio = noTemp
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = noTemp
                } else {
                    ponteiroFim = noTemp
                }

                noTemp.proximo = ponteiroProximo
                noTemp.anterior = ponteiroAnterior

                quantidade++
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Cheia!")
        }
    }

    override fun selecionar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }

                dadoAux = ponteiroAuxiliar?.dado
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun selecionarTodos(): Array<Any?> {
        var dadosAux: Array<Any?> = arrayOf(quantidade)

        if (!estaVazia()) {
            var  ponteiroAuxiliar =  ponteiroInicio

            for (i in 0 until quantidade) {
                dadosAux[i] = ponteiroAuxiliar?.dado
                ponteiroAuxiliar =  ponteiroAuxiliar?.proximo
            }
        } else  {
            println("Lista Vazia!")
        }
        return dadosAux
    }

    override fun atualizar(posicao: Int, dado: Any?) {
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }
                ponteiroAuxiliar?.dado = dado
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
    }

    override fun apagar(posicao: Int): Any? {
        var dadoAux: Any? = null
        if (!estaVazia()) {
            if (posicao >= 0 && posicao < quantidade) {
                var ponteiroAuxiliar = ponteiroInicio

                for (i in 0 until posicao) {
                    ponteiroAuxiliar = ponteiroAuxiliar?.proximo
                }

                dadoAux = ponteiroAuxiliar?.dado

                val ponteiroAnterior = ponteiroAuxiliar?.anterior
                val ponteiroProximo  = ponteiroAuxiliar?.proximo

                if (ponteiroAnterior != null) {
                    ponteiroAnterior.proximo = ponteiroProximo
                }
                else {
                    ponteiroInicio = ponteiroInicio?.proximo
                }

                if (ponteiroProximo != null) {
                    ponteiroProximo.anterior = ponteiroAnterior
                }
                else {
                    ponteiroFim = ponteiroFim?.anterior
                }

                quantidade++
            } else {
                println("Indice Inválido!")
            }
        } else {
            println("Lista Vazia!")
        }
        return dadoAux
    }

    override fun apagarTodos(): Array<Any?> {
        var dadosAux: Array<Any?> = selecionarTodos()
        limpar()
        return dadosAux
    }

    override fun limpar() {
        ponteiroInicio = null
        ponteiroFim = null
        quantidade = 0
    }

    // métodos 2 //

    override fun estaCheia(): Boolean {
        return quantidade == tamanho
    }

    override fun estaVazia(): Boolean {
        return quantidade == 0
    }

    override fun imprimir(): String {
        var ponteiroAuxiliar = ponteiroInicio
        var resultado = "["

        for (i in 0 until quantidade) {
            resultado += "${ponteiroAuxiliar?.dado}"

            if (i != quantidade - 1) {
                resultado += ", "
            }

            ponteiroAuxiliar = ponteiroAuxiliar?.proximo
        }

        return "$resultado]"
    }
}