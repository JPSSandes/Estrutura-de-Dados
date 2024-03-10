fun main() {
    // Pilha Estática Normal
    var pilhaEstatica = PilhaEstatica();
    pilhaEstatica.empilhar("Untouchables")
    pilhaEstatica.empilhar("Hybrid Theory")
    pilhaEstatica.empilhar("White Pony")
    println(pilhaEstatica.imprimir())
    println(pilhaEstatica.topo())

    // Pilha Estática Invertida
    var pilhaEstaticaInvertida = PilhaEstaticaInvertida()
    pilhaEstaticaInvertida.empilhar("Untouchables")
    pilhaEstaticaInvertida.empilhar("Hybrid Theory")
    pilhaEstaticaInvertida.empilhar("White Pony")
    println(pilhaEstaticaInvertida.imprimir())
    println(pilhaEstaticaInvertida.topo())

    // Pilha Estática Dupla
    var pilhaEstaticaDupla = PilhaEstaticaDupla()
    pilhaEstaticaDupla.empilhar1("Untouchables");
    pilhaEstaticaDupla.empilhar1("Hybrid Theory")
    pilhaEstaticaDupla.empilhar1("White Pony")
    pilhaEstaticaDupla.empilhar2("Issues")
    pilhaEstaticaDupla.empilhar2("Meteora")
    pilhaEstaticaDupla.empilhar2("Around the Fur")
    println(pilhaEstaticaDupla.imprimir1())
    println(pilhaEstaticaDupla.topo1())
    println(pilhaEstaticaDupla.imprimir2())
    println(pilhaEstaticaDupla.topo2())

    //Fila

}