object Ejercicio1 {
  class Caja[A](val contenido: A) {
    def obtener: A = contenido
    def combinar[B](otro: B): (A, B) = (contenido, otro)
  }

  def main(args: Array[String]): Unit = {
    val cajaInt = new Caja(10)
    val cajaString = new Caja("Hola")
    val cajaBoolean = new Caja(true)

    println(cajaInt.obtener)
    println(cajaString.obtener)
    println(cajaBoolean.obtener)
    println(cajaInt.combinar("Scala"))
  }
}