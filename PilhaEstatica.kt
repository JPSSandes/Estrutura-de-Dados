class PilhaEstatica : IPilha {
    private var ponteiroTopo: Int
    private var dados: Array<Any?>
  
    constructor() : this(10)
  
    constructor(tamanho: Int) {
      ponteiroTopo = -1
      dados = arrayOfNulls(tamanho)
    }
  
    // metodos auxiliares
    override fun isFull(): Boolean {
      return (ponteiroTopo == dados.size - 1)
    }
  
    override fun isEmpty(): Boolean {
      return (ponteiroTopo == -1)
    }
  
    override fun print(): String {
      var retorno = "["
  
      for (i in ponteiroTopo downTo 0) {
        if (i == 0) {
          retorno += "${dados[i]}"
        } else {
          retorno += "${dados[i]}, "
        }
      }
  
      return "${retorno}]"
    }
    // metodos principais
  
    override fun addToStack(dado: Any?) {
      if (!isFull()) {
        ponteiroTopo++
        dados[ponteiroTopo] = dado
      } else {
        throw IllegalArgumentException("Pilha Cheia")
      }
    }
  
    override fun removeFromStack(): Any? {
      var retorno: Any? = null
  
      if (!isEmpty()) {
        retorno = dados[ponteiroTopo]
        ponteiroTopo--
      }
  
      return null
    }
  
    override fun top(): Any? {
      var retorno: Any? = null
  
      if (!isEmpty()) {
        retorno = dados[ponteiroTopo]
      }
  
      return retorno
    }
  }
  