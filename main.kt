import java.time.LocalDateTime

fun main(args: Array<String>) {

    var teste: String = ""
    var agenda: Agenda = Agenda()
    var texto: Evento = Evento()
    var hoje: Evento = Evento()

    hoje.data = LocalDateTime.of(2021, 7,27,17,30)

    texto.data = LocalDateTime.of(2021, 7,27,17,30)
    texto.titulo = "festa"
    texto.traje = "casual"

    agenda.nome = "Estudo"
    agenda.addEvento(texto)
    agenda.addEvento(hoje)
    agenda.imprimaAgenda()



}


class Agenda {

    private var eventos: MutableList<Evento> = arrayListOf()
    var nome: String = ""


    fun addEvento(evento: Evento){
        eventos.add(evento)
                }

    fun imprimaAgenda(){
        println("O evento é $eventos")
    }

}

class Evento {

    var data: LocalDateTime = LocalDateTime.MIN
    var titulo: String = ""
    var traje: String = ""


}



