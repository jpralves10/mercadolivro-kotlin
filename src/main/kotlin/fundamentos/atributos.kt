package fundamentos

//val é imutável
//var é mutavel

class Carro(var cor:String, val anoFabricacao:Int, val dono:Dono)

data class Dono(var nome:String, var idade:Int)

/*fun main(){

    var carro = Carro("Branco", 2021, Dono("Jean", 31))

    println(carro.cor)
    carro.cor = "Preto"
    println(carro.cor)

    println(carro.dono.nome)
}*/