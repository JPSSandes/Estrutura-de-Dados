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
   }