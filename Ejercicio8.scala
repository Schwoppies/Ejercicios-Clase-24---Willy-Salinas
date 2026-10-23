object Ejercicio8 {
  class Persona(val nombre: String)

  class Resultado[A](
    val valor: A,
    val exitoso: Boolean,
    val mensaje: String
  )

  def main(args: Array[String]): Unit = {
    val resInt = new Resultado[Int](100, true, "OK")
    val resString = new Resultado[String]("Exito", true, "OK")
    val resPersona = new Resultado[Persona](new Persona("Ana"), true, "OK")

    println(resInt.valor)
    println(resString.valor)
    println(resPersona.valor.nombre)
  }
}