fun main() {
    // Pilha Estática Normal
    val pilhaEstatica = PilhaEstatica(3);
    pilhaEstatica.empilhar("Untouchables")
    pilhaEstatica.empilhar("Hybrid Theory")
    pilhaEstatica.empilhar("White Pony")

    // Pilha Estática Invertida
    val pilhaEstaticaInvertida = PilhaEstaticaInvertida(3)
    pilhaEstaticaInvertida.empilhar("Untouchables")
    pilhaEstaticaInvertida.empilhar("Hybrid Theory")
    pilhaEstaticaInvertida.empilhar("White Pony")

    // Pilha Estática Dupla
    val pilhaEstaticaDupla = PilhaEstaticaDupla(6)
    pilhaEstaticaDupla.empilhar1("Untouchables");
    pilhaEstaticaDupla.empilhar1("Hybrid Theory")
    pilhaEstaticaDupla.empilhar1("White Pony")
    pilhaEstaticaDupla.empilhar2("Issues")
    pilhaEstaticaDupla.empilhar2("Meteora")
    pilhaEstaticaDupla.empilhar2("Around the Fur")

    //Fila
    val filaEstatica = FilaEstatica(3)
    filaEstatica.enfileirar("Here to Stay")
    filaEstatica.enfileirar("Points of Authority")
    filaEstatica.enfileirar("Digital Bath")
    println(filaEstatica.imprimir())

    val filaEstaticaCircular = FilaEstaticaCircular(3)
    filaEstaticaCircular.enfileirar("Here to Stay")
    filaEstaticaCircular.enfileirar("Points of Authority")
    filaEstaticaCircular.enfileirar("Digital Bath")
    println(filaEstaticaCircular.imprimir())
}