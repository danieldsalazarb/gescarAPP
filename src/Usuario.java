
import java.util.*;


/**
 * Class Usuario
 */
public class Usuario {

  //
  // Fields
  //

  public String nombre;
  public String apellido1;
  public String apellido2;
  public String contrasena;
  public String email;
  
  //
  // Constructors
  //

  public Usuario(String nombre, String apellido1, String apellido2, String contrasena, String email) {
    this.nombre = nombre;
    this.apellido1 = apellido1;
    this.apellido2 = apellido2;
    this.contrasena = contrasena;
    this.email = email;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of nombre
   * @param newVar the new value of nombre
   */
  public void setNombre (String newVar) {
    nombre = newVar;
  }

  /**
   * Get the value of nombre
   * @return the value of nombre
   */
  public String getNombre () {
    return nombre;
  }

  /**
   * Set the value of apellido1
   * @param newVar the new value of apellido1
   */
  public void setApellido1 (String newVar) {
    apellido1 = newVar;
  }

  /**
   * Get the value of apellido1
   * @return the value of apellido1
   */
  public String getApellido1 () {
    return apellido1;
  }

  /**
   * Set the value of apellido2
   * @param newVar the new value of apellido2
   */
  public void setApellido2 (String newVar) {
    apellido2 = newVar;
  }

  /**
   * Get the value of apellido2
   * @return the value of apellido2
   */
  public String getApellido2 () {
    return apellido2;
  }

  /**
   * Set the value of contrase�a
   * @param newVar the new value of contrase�a
   */
  public void setContrasena (String newVar) {
    contrasena = newVar;
  }

  /**
   * Get the value of contrase�a
   * @return the value of contrase�a
   */
  public String getContrasena () {
    return contrasena;
  }

  /**
   * Set the value of email
   * @param newVar the new value of email
   */
  public void setEmail (String newVar) {
    email = newVar;
  }

  /**
   * Get the value of email
   * @return the value of email
   */
  public String getEmail () {
    return email;
  }

  //
  // Other methods
  //

  /**
   * Este metodo se implementa para añadir un vehiculo que sera usado para la venta o
   * alqulier.
   */
  public void crearVehiculo(String marca, String fechaSalida, String matriculaVehiculo, boolean visibilidad, String modelo, int kilometraje, String tipoCombustible, String transmision, String accion, Cliente cliente) {

    Vehiculo vehiculo = new Vehiculo(marca, fechaSalida, matriculaVehiculo, visibilidad, modelo, kilometraje, tipoCombustible, transmision, accion);
    cliente.vehiculos.add(vehiculo);

  }


  /**
   * Este metodo se implementa para eliminar un vehiculo que haya sido previamente
   * creado.
   */
  public void eliminarVehiculo(Cliente cliente, Vehiculo vehiculo) {

    String matricula = vehiculo.matriculaVehiculo;

    for (Vehiculo coche: cliente.vehiculos) {

      if (coche.matriculaVehiculo == matricula){

        cliente.vehiculos.remove(vehiculo);

      }
    }
  }
}
