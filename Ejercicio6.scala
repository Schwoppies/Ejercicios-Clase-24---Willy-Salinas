object Ejercicio6 {
  class Animal
  class Perro extends Animal

  trait Procesador[-A] {
    def procesar(valor: A): String
  }

  class ProcesadorAnimal extends Procesador[Animal] {
    def procesar(valor: Animal): String = "Procesando animal"
  }

  def main(args: Array[String]): Unit = {
    val procesadorAnimal: Procesador[Animal] = new ProcesadorAnimal()
    val procesadorPerro: Procesador[Perro] = procesadorAnimal
    println(procesadorPerro.procesar(new Perro()))
  }
}