object Ejercicio5 {
  class Animal
  class Perro extends Animal

  class Contenedor[+A](val valor: A)

  def main(args: Array[String]): Unit = {
    val contenedorPerro: Contenedor[Perro] = new Contenedor(new Perro())
    val contenedorAnimal: Contenedor[Animal] = contenedorPerro
    println(contenedorAnimal.valor)
  }
}