
import java.util.*;


/**
 * Class Vehiculo
 */
public class Vehiculo {

  //
  // Fields
  //

  public String marca;
  public String fechaSalida;
  public String matriculaVehiculo;
  public boolean visibilidad;
  public String modelo;
  public int kilometraje;
  public String tipoCombustible;
  public String transmision;

  public String accion;

  public Cliente cliente;
  
  //
  // Constructors
  //

  public Vehiculo(String marca, String fechaSalida, String matriculaVehiculo, boolean visibilidad, String modelo, int kilometraje, String tipoCombustible, String transmision, String accion) {
    this.marca = marca;
    this.fechaSalida = fechaSalida;
    this.matriculaVehiculo = matriculaVehiculo;
    this.visibilidad = visibilidad;
    this.modelo = modelo;
    this.kilometraje = kilometraje;
    this.tipoCombustible = tipoCombustible;
    this.transmision = transmision;
    this.accion = accion;

  }


  //
  // Methods
  //


  //
  // Accessor methods
  //

  /**
   * Set the value of marca
   * @param newVar the new value of marca
   */
  public void setMarca (String newVar) {
    marca = newVar;
  }

  /**
   * Get the value of marca
   * @return the value of marca
   */
  public String getMarca () {
    return marca;
  }

  /**
   * Set the value of fechaSalida
   * @param newVar the new value of fechaSalida
   */
  public void setFechaSalida (String newVar) {
    fechaSalida = newVar;
  }

  /**
   * Get the value of fechaSalida
   * @return the value of fechaSalida
   */
  public String getFechaSalida () {
    return fechaSalida;
  }

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
   * Set the value of visibilidad
   * @param newVar the new value of visibilidad
   */
  public void setVisibilidad (boolean newVar) {
    visibilidad = newVar;
  }

  /**
   * Get the value of visibilidad
   * @return the value of visibilidad
   */
  public boolean getVisibilidad () {
    return visibilidad;
  }

  /**
   * Set the value of modelo
   * @param newVar the new value of modelo
   */
  public void setModelo (String newVar) {
    modelo = newVar;
  }

  /**
   * Get the value of modelo
   * @return the value of modelo
   */
  public String getModelo () {
    return modelo;
  }

  /**
   * Set the value of kilometraje
   * @param newVar the new value of kilometraje
   */
  public void setKilometraje (int newVar) {
    kilometraje = newVar;
  }

  /**
   * Get the value of kilometraje
   * @return the value of kilometraje
   */
  public int getKilometraje () {
    return kilometraje;
  }

  /**
   * Set the value of tipoCombustible
   * @param newVar the new value of tipoCombustible
   */
  public void setTipoCombustible (String newVar) {
    tipoCombustible = newVar;
  }

  /**
   * Get the value of tipoCombustible
   * @return the value of tipoCombustible
   */
  public String getTipoCombustible () {
    return tipoCombustible;
  }

  /**
   * Set the value of transmision
   * @param newVar the new value of transmision
   */
  public void setTransmision (String newVar) {
    transmision = newVar;
  }

  /**
   * Get the value of transmision
   * @return the value of transmision
   */
  public String getTransmision () {
    return transmision;
  }

  @Override
  public String toString() {
    return "Vehiculo" +
            "marca='" + marca + '\'' +
            ", fechaSalida='" + fechaSalida + '\'' +
            ", matriculaVehiculo='" + matriculaVehiculo + '\'' +
            ", visibilidad=" + visibilidad +
            ", modelo='" + modelo + '\'' +
            ", kilometraje=" + kilometraje +
            ", tipoCombustible='" + tipoCombustible + '\'' +
            ", transmision='" + transmision + '\'' +
            ", accion='" + accion;
  }

  //
  // Other methods
  //

}
