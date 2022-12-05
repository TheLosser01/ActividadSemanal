
//EJERCICIO FACTORIAL ESCALONADO
def factorialEscalonado(num: Int) : Int = {
    num % 2 match {
        case 0 => (2 to num by 2).product
        case _ => (1 to num by 2).product
    }
}

factorialEscalonado(8)
factorialEscalonado(9)

//LISTA DE ENTEROS PARES
val numbers = (1 to 20).toList
numbers.filter(nro => nro % 2 == 0).size
numbers.count(nro => nro % 2 == 0)

//LISTA DE ENTEROS IMPARES
numbers.filter(nro => nro % 2 != 0).size
numbers.count(nro => nro % 2 != 0)

//LISTA DE NUMEROS PRIMOS
def contarPrimos(nros : List[Int]) : Int = {
    val isPrime = (n : Int) => (2 until n).forall(n % _ != 0)
    nros.filter(isPrime).size
    //-- nros.count(isPrime)
    //-- nros.count((n : Int) => (2 until n).forall(n % _ != 0))
}
contarPrimos(numbers)

//PRESENTAR 3 FACTORES
def tresFactores(nros : List[Int]) : List[Int] = {
    val factores = (n : Int) => (2 until n).filter(n % _ == 0)

    nros.filter(nro => factores(nro).size == 3)
}
tresFactores((1 to 1000).toList)
