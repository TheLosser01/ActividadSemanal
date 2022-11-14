val nros = List(727.7, 1083.5, 1091.0, 1361.3, 1490.5, 1956.1)
def promedio(valores : List[Double]) : Double = valores. sum / valores.size

def desvEst(valores : List[Double]): Double = {
    val avg = promedio(valores)

    def varianza(valores : List[Double]) : Double = 
        valores.map(x => Math.pow(x - avg, 2)).sum * (1.0 / (valores.size - 1))

    Math.sqrt(varianza(valores))    
}

//Contar

def clasifica(valores : List[Double]): Unit = {
    val s = desvEst(valores)
    val avg1 = promedio(valores)

    (1 to 3).foreach( i => 
        println(valores.filter(x =>
            x => avg1 - i * s) && x <= (avg1 + i * s).size))
}

//Tuplas

//Una tupla es un contenedor de datos en donde cada elemento puede ser de tipo diferente

val par = (1, "Abad Ana")

println(par._1)
println(par._2)

val student = (1, "Abad Ana")
val datos =("jorgaf", "M", 45, 95.2, true)
val student1: Tuple2[Int, String]
val datos: Tuple5[String, Char, Int, Double, Boolean]

val student1 = (1, "Abad Ana")
val (edad, nombre) = student1
print(edad)
print(nombre)

student1.canEqual((1, "Aban Ana"))

student1.swap

//Listas
//declaraciones

val values = List(42, 31, 36, 40, 43)

val names = List ("Jorge", "Rene", "Ma. del Carmen")


//Dentro de las listas se pueden realizar algunas operaciones.
//Count Exists, Filter, ForAll, Lenght, Map, (Max, maxBy), (Min, minBy), Product, Size

//flodLeft

var myList : List[Double] = List

myList.foldLeft(0)((x, y) => x + y)
myList.foldLeft(0)( _ + _ )

myList.foldRight(0) ((x, y) => x + y)
myList.foldRight(0)( _ + _ )

def average(valores : Seq[Double]) : Double = {
    val t = valores.foldLeft(0.0, 0)((acc, currVal) => ((acc._1 + currVal, acc._2 + 1)))
    t._1/ t._2
}

def average2(valores: Seq[Double]) : Double = {
    val t = valores.foldLeft(0.0, 0) { (acc, currVal) =>
        val sum = acc._1 + currVal
        val cont = acc._2 + 1
        printf("Suma: %f - contador: %d%n", sum, cont)
        (sum, cont)
    }
    t._1 / t._2    
}



