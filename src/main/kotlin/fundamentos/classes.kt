package fundamentos

class Pessoa1(var nome:String, var idade:Int)

data class Pessoa2(var nome:String, var idade:Int)

data class Pessoa3(var nome:String, var idade:Int) {
    override fun toString(): String {
        return "Classe: Pessoa. Nome: ${nome}, Idade: ${idade}"
    }
}

fun main(){
    var pessoa1 = Pessoa1("Jean Alves", 31)
    println(pessoa1)

    var pessoa2 = Pessoa2("Jean Alves", 31)
    println(pessoa2)

    var pessoa3 = Pessoa3("Jean Alves", 31)
    println(pessoa3)
}