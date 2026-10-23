object Ejercicio3 {
  def transformar[A, B](valor: A, funcion: A => B): B = funcion(valor)

  def main(args: Array[String]): Unit = {
    val res1 = transformar[Int, String](42, x => x.toString)
    val res2 = transformar[String, Int]("Scala", s => s.length)
    val res3 = transformar[Double, Boolean](3.5, d => d > 0.0)

    println(res1)
    println(res2)
    println(res3)
  }
}