package fundamentos

//Unit é o mesmo que void

fun main(): Unit {
    dizOi(retornaNome(), 31)
    dizOi(retornaNome())
}

fun retornaNome(): String {
    return "Jean"
}

fun dizOi(nome:String, idade:Int = 20){
    println("Oi ${nome}, ${idade} anos")
}

