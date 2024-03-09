fun main() {
    var filaEstatica: FilaEstatica = FilaEstatica()
    filaEstatica.enfileirar("ábaco")
    filaEstatica.enfileirar("calculadora")
    filaEstatica.enfileirar("celular")

    println(filaEstatica.imprimir())
}