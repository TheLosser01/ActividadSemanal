//Try Ejemplos - Ingreso de Datos

import scala.io.StdIn
import scala.util.{Try, Success, Failure}
import java.net.URL
import scala.util.Try

val name = StdIn.readLine("Nombre: ")
Nombre: Jorge
//name: String = "Jorge"

val edad = StdIn.readLine("Edad: ").toInt
Edad: 20
//edad: Int = 20

val edad = StdIn.readLine("Edad: ").toInt
edad: Veinte
//java.lang.NumberFormatException: For input string: "veinte"

val edad = StdIn.readLine("Edad: ").toInt
edad: 20.0
//java.lang.NumberFormatException: For input string: "20.0"

val edad = Try{ StdIn.readLine("Edad: ").toInt}
Edad: Veinte
//edad: Try[Int] = Failure(java.lang.NumberFormatException: For input string: "Veinte")

val edad = Try{ StdIn.readLine("Edad: ").toInt}
Edad: 20.0
//edad: Try[Int] = Failure(java.lang.NumberFormatException: For input string: "20.0")

object Exa0{
    def main(args: Array[String]) = {
        val name = StdIn.readLine("Nombre: ")
        val age = StdIn.readLine("Edad: ").toInt
        val weight = StdIn.readLine("Peso: ").toDouble
        printf("Hola %s, tienes %d años y pesas %fKg\n", name, age,weight)

    }
}

object Exa2{
    def main(args: Array[String]) = {
        val name = StdIn.readLine("Nombre: ")
        val age = StdIn.readLine("Edad: ").toInt
        val weight = StdIn.readLine("Peso: ").toDouble
        printf("Hola %s, tienes %d años y pesas %fKg\n", name, 
        age match{
            case Success(v) => v
            case Failure(e) => "Error"
        },
        weight match{
            case Success(v) => v
            case Failure(e) => "Error"
        })
    }
}

object Exa6{
    def main(args: Array[String]): Unit = {
        print(inData())
    }

    def inData(): String = {    
        val name = StdIn.readLine("Nombre: ")
        val age = StdIn.readLine("Edad: ").toInt
        val weight = StdIn.readLine("Peso: ").toDouble
        "Hola %s, tienes %d años y pesas %fKg\n".format(
             name, 
             age match {
                case Success(v) => v
                case Failure(e) => 
                    println("Error en la Edad")
                    inData()
            },
            weight match {
                case Success(v) => v
                case Failure(e) => 
                    println("Error en la Edad")
                    inData()
        })
    }
        
}


//Efectos colaterales - Solucion

case class User(name: String)

def getUser(id: Int): User = {
    if(Set(1, 2, 3).contains(id)) 
        User(s"User-$id") 
    else 
        null  
}

println(getUser(1).name)
println(getUser(10).name)

def getUser1(id: Int): Option[User] = {
    if(Set(1, 2, 3).contains(id))
        Some(User(s"User-$id"))
    else
        None
}

println(getUser(1).get.name)
println(getUser(10).getOrElse("No Existe"))


new URL("http://j4loxa.com")
new URL("miurlpuntocom")

def parseURL(url:String): Try(URL) = {
    Try{new URL(url)}
}

//Lectura de Archivo

Source.fromFile("myData.txt")

def readDataFromFile(filepath: String): Try[List[String]] ={
    Try(Source.fromFile(filepath).getLines.toList)
}

readDataFromFile("/Users/jorgaf/greetings.txt")