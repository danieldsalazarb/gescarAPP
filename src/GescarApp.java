import java.util.ArrayList;
import java.util.Scanner;

public class GescarApp {
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        String emailLogueado = "";

        boolean esCliente = false;

        boolean esAdministrador = false;

        Administrador administrador = new Administrador("Daniel", "Salazar", "Bastardo", "1", "hola.com");

        ArrayList<Cliente> clientes = new ArrayList<>();

        ArrayList<Vehiculo> vehiculos1 = new ArrayList<>();

        ArrayList<Vehiculo> vehiculos2 = new ArrayList<>();

        vehiculos1.add(new Vehiculo("Toyota", "2017","12234567", true, "Yaris",30000, "Gasolina","Manual", "Venta"));
        vehiculos1.add(new Vehiculo("Ford", "2012","1423424", true, "Focus",20000, "Diesel","Automático", "Alquiler"));

        vehiculos2.add(new Vehiculo("Volkswagen", "2009","ysdcsaq112", true, "Fox",1100000, "Gasolina","Manual", "Venta"));


        clientes.add(new Cliente("Francisco", "Bastardo", "Marcano", "1", "fran@gmail.com", "Y123457","Urbanización Villas el Prado", vehiculos1));
        clientes.add(new Cliente("José", "Jimenez", "Aguilar", "4567899", "joseaguilar@gmail.com", "B123475","Vega de aca", vehiculos2));


        System.out.println("Bienvenido a GESCAR" + "\nElija una opción" +"\n1. Iniciar sesión" + "\n2. Registrarse" + "\n3. Ver todos los vehiculos");

        int opcion = leer.nextInt();
        leer.nextLine();

        if (opcion == 1) {

            while (emailLogueado.isEmpty()) {

                System.out.println("Introduzca su email y contraseña");

                System.out.println("email: ");

                String email = leer.nextLine();

                System.out.println("contraseña: ");

                String contrasena = leer.nextLine();

                for (Cliente busqueda : clientes) {

                    if (email.equals(busqueda.email)  && contrasena.equals(busqueda.contrasena)) {

                        System.out.println("Bienvenido " + busqueda.nombre);

                        emailLogueado = busqueda.email;

                        esCliente = true;

                    }

                }
                if (email.equals(administrador.email)  && contrasena.equals(administrador.contrasena) ) {

                    System.out.println("Bienvenido " + administrador.nombre);

                    emailLogueado = administrador.email;

                    esAdministrador = true;

                }

                if (emailLogueado.isEmpty()){

                    System.out.println("No se encontro el usuario");
                }

            }


        }
        if (opcion == 2) {

            System.out.println("Introduce tu email");

            String email = leer.nextLine();

            System.out.println("Introduce tu contraseña");

            String contrasena = leer.nextLine();

            System.out.println("Introduce tu nombre");

            String nombre = leer.nextLine();

            System.out.println("Introduce tu primer apellido");

            String apellido1 = leer.nextLine();

            System.out.println("Introduce tu segundo apellido");

            String apellido2 = leer.nextLine();

            System.out.println("Introduce tu DNI");

            String dni = leer.nextLine();

            System.out.println("Introduce tu dirección");

            String direccion = leer.nextLine();

            clientes.add(new Cliente(nombre,apellido1,apellido2,contrasena,email,dni,direccion, new ArrayList<Vehiculo>()));

            emailLogueado = email;



        }
        if (opcion == 3) {

            System.out.println("Estos son todos los vehiculos para la venta o alquiler");

            for (Cliente cliente:clientes) {

                for (Vehiculo vehiculo:cliente.vehiculos ) {

                    System.out.println(vehiculo);

                }

            }
        }
        if (!emailLogueado.isEmpty()){

            System.out.println("Que desea hacer" + "\nElija una opción" +"\n1. Añadir vehiculo" + "\n2. Eliminar vehiculo");

            int opcion2 = leer.nextInt();
            leer.nextLine();

            if (opcion2 == 1) {

                System.out.println("Introduzca los datos del vehiculo:");

                System.out.println("Introduce la marca");

                String marca = leer.nextLine();

                System.out.println("Introduce la fecha de salida: ");

                String fechaSalida = leer.nextLine();

                System.out.println("Introduce la matricula ");

                String matriculaVehiculo = leer.nextLine();

                System.out.println("Introduce el modelo");

                String modelo = leer.nextLine();

                System.out.println("Introduce el kilometraje");

                int kilometraje = leer.nextInt();
                leer.nextLine();

                System.out.println("Introduce el tipo de combustible");

                String tipoCombustible = leer.nextLine();

                System.out.println("Introduce el tipo de transmisión");

                String transmision = leer.nextLine();

                System.out.println("¿Deseas alquilar o vender?");

                String accion = leer.nextLine();

                if (esCliente){

                    for (Cliente cliente: clientes) {

                        if (emailLogueado.equals(cliente.email)){

                            cliente.crearVehiculo(marca,fechaSalida,matriculaVehiculo,true,modelo,kilometraje,tipoCombustible,transmision,accion,cliente);
                        }

                    }
                }else {

                    System.out.println("¿A cual cliente deseas añadirle el vehiculo?");

                    System.out.println(clientes);

                    System.out.println("Introduce el DNI del cliente: ");

                    String dni = leer.nextLine();

                    for (Cliente cliente: clientes) {

                        if (dni.equals(cliente.dni)){

                            cliente.crearVehiculo(marca,fechaSalida,matriculaVehiculo,true,modelo,kilometraje,tipoCombustible,transmision,accion,cliente);


                        }

                    }
                }
                for (Cliente customers: clientes) {

                    System.out.println(customers.vehiculos);

                }



            }
            if (opcion2 == 2) {

                System.out.println("Escriba la matricula del vehiculo a eliminar: ");

                if (esCliente){

                    for (Cliente cliente: clientes) {

                        if (emailLogueado.equals(cliente.email)){

                            System.out.println(cliente.vehiculos);

                        }

                    }
                    String matriculaVehiculo = leer.nextLine();

                    for (Cliente cliente: clientes) {

                        if (emailLogueado.equals(cliente.email)){


                            for (Vehiculo vehiculo:cliente.vehiculos) {
                                if (matriculaVehiculo.equals(vehiculo.matriculaVehiculo)){

                                    cliente.eliminarVehiculo(cliente,vehiculo);
                                }

                            }

                        }

                    }
                }else {

                    for (Cliente cliente: clientes) {

                            System.out.println(cliente.vehiculos);

                    }

                    String matriculaVehiculo = leer.nextLine();

                    for (Cliente cliente: clientes) {
                        for (Vehiculo vehiculo:cliente.vehiculos) {
                            if (matriculaVehiculo.equals(vehiculo.matriculaVehiculo)){
                                cliente.eliminarVehiculo(cliente,vehiculo);
                            }
                        }
                    }
                }
                for (Cliente cliente: clientes) {
                    System.out.println(cliente.vehiculos);
                }
            }
        }
    }
}
