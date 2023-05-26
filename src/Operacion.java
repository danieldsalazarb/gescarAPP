

/**
 * Class Operacion
 */
public class Operacion {

  //
  // Fields
  //

  public String matriculaVehiculo;
  public String tipoOperacion;
  protected int id;
  
  //
  // Constructors
  //

  public Operacion(String matriculaVehiculo, String tipoOperacion, int id) {
    this.matriculaVehiculo = matriculaVehiculo;
    this.tipoOperacion = tipoOperacion;
    this.id = id;
  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of matriculaVehiculo
   * @param newVar the new value of matriculaVehiculo
   */
  public void setMatriculaVehiculo (String newVar) {
    matriculaVehiculo = newVar;
  }

  /**
   * Get the value of matriculaVehiculo
   * @return the value of matriculaVehiculo
   */
  public String getMatriculaVehiculo () {
    return matriculaVehiculo;
  }

  /**
   * Set the value of tipoOperacion
   * @param newVar the new value of tipoOperacion
   */
  public void setTipoOperacion (String newVar) {
    tipoOperacion = newVar;
  }

  /**
   * Get the value of tipoOperacion
   * @return the value of tipoOperacion
   */
  public String getTipoOperacion () {
    return tipoOperacion;
  }

  /**
   * Set the value of id
   * @param newVar the new value of id
   */
  public void setId (int newVar) {
    id = newVar;
  }

  /**
   * Get the value of id
   * @return the value of id
   */
  public int getId () {
    return id;
  }

  //
  // Other methods
  //

}
