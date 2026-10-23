object Ejercicio2 {
  def seleccionarPrimero[A](primero: A, segundo: A): A = primero

  def main(args: Array[String]): Unit = {
    println(seleccionarPrimero[Int](5, 10))
    println(seleccionarPrimero[String]("Primero", "Segundo"))
    println(seleccionarPrimero[Double](3.14, 2.71))
  }
}