import java.util.ArrayList;

/**
 * Class Cliente
 */
public class Cliente extends Usuario {

  //
  // Fields
  //

  public String dni;
  public String direccion;

  public ArrayList<Vehiculo> vehiculos = new ArrayList<>();
  
  //
  // Constructors
  //

  public Cliente(String nombre, String apellido1, String apellido2, String contrasena, String email, String dni, String direccion, ArrayList<Vehiculo>vehiculos){
    super(nombre, apellido1, apellido2, contrasena, email);
    this.dni = dni;
    this.direccion = direccion;
    this.vehiculos = vehiculos;
  }




  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of DNI
   * @param newVar the new value of DNI
   */
  public void setDni(String newVar) {
    dni = newVar;
  }

  /**
   * Get the value of DNI
   * @return the value of DNI
   */
  public String getDni() {
    return dni;
  }

  /**
   * Set the value of direccion
   * @param newVar the new value of direccion
   */
  public void setDireccion (String newVar) {
    direccion = newVar;
  }

  /**
   * Get the value of direccion
   * @return the value of direccion
   */
  public String getDireccion () {
    return direccion;
  }

  @Override
  public String toString() {
    return "Cliente " +
            "DNI='" + dni + '\'' +
            ", nombre='" + nombre + '\'' +
            ", email='" + email;
  }

  //
  // Other methods
  //

}
