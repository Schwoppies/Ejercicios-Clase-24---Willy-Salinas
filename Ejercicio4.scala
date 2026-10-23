object Ejercicio4 {
  abstract class Vehiculo(val marca: String)
  class Automovil(marca: String) extends Vehiculo(marca)
  class Motocicleta(marca: String) extends Vehiculo(marca)

  class RegistroVehiculo[A <: Vehiculo](val vehiculo: A)

  def main(args: Array[String]): Unit = {
    val auto = new Automovil("Toyota")
    val registro = new RegistroVehiculo(auto)
    println(registro.vehiculo.marca)
  }
}