fun main() {

    /* Estruturas de Dados Estáticas */

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

    // Fila Estática
    val filaEstatica = FilaEstatica(3)
    filaEstatica.enfileirar("Here to Stay")
    filaEstatica.enfileirar("Points of Authority")
    filaEstatica.enfileirar("Digital Bath")

    // Fila Estática Circular
    val filaEstaticaCircular = FilaEstaticaCircular(3)
    filaEstaticaCircular.enfileirar("Here to Stay")
    filaEstaticaCircular.enfileirar("Points of Authority")
    filaEstaticaCircular.enfileirar("Digital Bath")

    // Lista
    val listaEstaticaCircular = ListaEstaticaCircular(3)
    listaEstaticaCircular.anexar("Here to Stay")
    listaEstaticaCircular.anexar("Points of Authority")
    listaEstaticaCircular.anexar("Digital Bath")

    /* Estruturas de Dados Dinâmicas */

    // Pilha Dinâmica
    val pilhaDinamica = PilhaDinamica(3)
    pilhaDinamica.empilhar("Here to Stay")
    pilhaDinamica.empilhar("Points of Authority")
    pilhaDinamica.empilhar("Digital Bath")
    println(pilhaDinamica.imprimir())

    // Fila Dinâmica
    val filaDinamica = FilaDinamica(3)
    filaDinamica.enfileirar("Here to Stay")
    filaDinamica.enfileirar("Points of Authority")
    filaDinamica.enfileirar("Digital Bath")
    println(filaDinamica.imprimir())
}