// Mapeo

def isEven  (k : Int) : Int = (k % 2) match {
    case 0 => 1
    case _ => 0
}
def countEven (s : List[Int]) : Int = s.map( isEven).sum

def countEven( s : List[Int]) : Int = {
    def isEven (k : Int) : Int = (k % 2 ) match {
        case 0 => 1
        case _ => 0
    }
    s.map( isEven ).sum
}

def countEven ( s : List[Int]) : Int = {
    val isEven = (k : Int) => k % 2 match{
        case 0 => 1
        case _ => 0
    }
    s.map( isEven).sum
}

// Cadenas de Texto

val names : List[String] = List ("Leo", "Cristiano", "Enner", "Felipe")
names.map( _.length() )


//Ejercicio Mapeo
val numbers = List(3, 4, 11, 12)
val isPrime = (nro : Int) => (2 to nro -1).forall( nro % _!= 0)
numbers.map(isPrime(_) match {
    case true => 1
    case false => 0
}).sum

//Filtrar Secuancies

val numbers0 = List(6, 28, 15, 12, 11, 24)

numbers.max

numbers.min

numbers.size


//forral y exists

def isPrime (nro : Int) : Boolean = ( 2 until nro).forall(nro %_ != 0)

def isPrime(nro : Int) : Boolean = !(2 until nro).exists(nro % _ == 0)

//Filtrar y Truncar Secuancias

List (1, 2, 3, 4, 5 ).filter( k => k % 3 != 0)

List (1, 2, 3, 4, 5 ).takeWhile( k => k % 3 != 0)

// Map/Reduce

val divP = (n : Int) => (1 until n).filter(div => n % div == 0).sum
divP(10)

val number1 = List(6, 28, 15, 12, 11, 24)
val sumDiv = (nro : Int) => (1 until nro).filter(div => nro % div == 0).sum
numbers.filter(nro => nro == sumDiv(nro)).size


//Factorial Escalonado

def !!(n : Int ): Int ={
    n % 2 match{
        case 0 => (2 to n by 2).product
        case _ => (1 to n by 2).product
    }
}

!!(8)
!!(9)


val number2 = (1 to 20).toList

//Contar Pares

number2.filter(nro => nro % 2 == 0).size
number2.count(nro => nro % 2 == 0)

//Contar Primos

def contarPrimos(nros : List[Int]): Int = {
    val isPrime = (n : Int) => (2 until n).forall(n % _ != 0)
    nros.filter(isPrime).size
}
contarPrimos(number2)

//Presentar 3 Factores

def tresFactrores(nros: List[Int]): List[Int] = {
    val factores = (n : Int) => (2 until n).filter(n % _ == 0)

    nros.filter(nro => factores(nro).size == 3)
} 
tresFactrores((1 to 1000).toList)