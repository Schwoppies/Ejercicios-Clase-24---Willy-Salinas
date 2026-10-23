object Ejercicio7 {
  class Animal
  class Perro extends Animal
  class Gato extends Animal

  trait Productor[+A] {
    def producir: A
  }

  trait Consumidor[-A] {
    def consumir(valor: A): String
  }

  def main(args: Array[String]): Unit = {
    val productorPerro: Productor[Perro] = new Productor[Perro] {
      def producir: Perro = new Perro()
    }
    val productorAnimal: Productor[Animal] = productorPerro

    val consumidorAnimal: Consumidor[Animal] = new Consumidor[Animal] {
      def consumir(valor: Animal): String = "Consumido"
    }
    val consumidorPerro: Consumidor[Perro] = consumidorAnimal

    println(productorAnimal.producir)
    println(consumidorPerro.consumir(new Perro()))
  }
}