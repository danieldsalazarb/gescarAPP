
import java.util.*;


/**
 * Class Administrador
 */
public class Administrador extends Usuario {

  //
  // Fields
  //


  //
  // Constructors
  //

  public Administrador(String nombre, String apellido1, String apellido2, String contrasena, String email) {
    super(nombre, apellido1, apellido2, contrasena, email);

  }


  //
  // Methods
  //


  //
  // Accessor methods
  //


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

  //
  // Other methods
  //

  /**
   * Este metodo se usa para mostrar los vehiculos a nivel de la aplicacion para que
   * el cliente interactue con él
   */
  public void mostrarVehiculo(Vehiculo vehiculo) {

    vehiculo.visibilidad = !vehiculo.visibilidad;

  }


}
