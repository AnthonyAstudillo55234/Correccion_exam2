package src;
import src.viajes.*;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        Normal cliente1 = new Normal("Juan","1726195207",19,"Quito","1234","14/06/2024","15/06/2024",5,"Quito","Cuenca",23.25,"ventana",1,true,5.00);
        ServicioExtra cliente2= new ServicioExtra("Carlos","1736105951",23,"Guayaquil","5678","15/06/2024","16/06/2024",8,"Guayaquil","Ambato",25.25,"Televisión,internet ",2,true,5.00,"Comida");
        Normal cliente3 = new Normal("María", "1726195208", 27, "Cuenca", "9012", "16/06/2024", "17/06/2024", 3, "Cuenca", "Quito", 18.75, "pasillo", 1, false, 4.50);
        ServicioExtra cliente4 = new ServicioExtra("Pedro", "1736105952", 31, "Ambato", "3456", "17/06/2024", "18/06/2024", 6, "Ambato", "Guayaquil", 22.50, "Televisión", 2, true, 4.75, "Comida");
        ServicioExtra cliente6 = new ServicioExtra("Andrés", "1736105953", 29, "Machala", "2468", "19/06/2024", "20/06/2024", 7, "Machala", "Quito", 24.00, "Televisión,internet", 2, false, 5.50, "Comida");



// public Normal(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio, String seleccion_asiento, int espacio_maletas, Boolean maleta_extra, Double cargo_extra)
        Normal cliente7 = new Normal();
        ServicioExtra cliente8 = new ServicioExtra();
        Normal cliente9 = new Normal();
        ServicioExtra cliente10 = new ServicioExtra();
        Normal cliente11 = new Normal();
        Normal cliente12 = new Normal();
        Normal cliente13 = new Normal();


        cliente7.setNombre("Pablo");
        cliente7.setCedula("1726195207");
        cliente7.setEdad(19);
        cliente7.setCuidad("Quito");
        cliente7.setCodigo("1234");
        cliente7.setFecha_llegada("14/06/2024");
        cliente7.setFecha_salida("15/06/2024");
        cliente7.setNumero_bus(5);
        cliente7.setLugar_llegada("Cuenca");
        cliente7.setLugar_salida("Salinas");
        cliente7.setSeleccion_asiento("ventana");
        cliente7.setEspacio_maletas(1);
        cliente7.setMaleta_extra(true);
        cliente7.setPrecio(5.00);

        cliente9.setNombre("Lupe");
        cliente9.setCedula("1726195207");
        cliente9.setEdad(19);
        cliente9.setCuidad("Quito");
        cliente9.setCodigo("1234");
        cliente9.setFecha_llegada("14/06/2024");
        cliente9.setFecha_salida("15/06/2024");
        cliente9.setNumero_bus(5);
        cliente9.setLugar_llegada("Cuenca");
        cliente9.setLugar_salida("Quito");
        cliente9.setSeleccion_asiento("ventana");
        cliente9.setEspacio_maletas(1);
        cliente9.setMaleta_extra(true);
        cliente9.setPrecio(25.25);
        cliente9.setCargo_extra(5.00);

        cliente11.setNombre("Lupe");
        cliente11.setCedula("1726195207");
        cliente11.setEdad(19);
        cliente11.setCuidad("Quito");
        cliente11.setCodigo("1234");
        cliente11.setFecha_llegada("14/06/2024");
        cliente11.setFecha_salida("15/06/2024");
        cliente11.setNumero_bus(5);
        cliente11.setLugar_llegada("Cuenca");
        cliente11.setLugar_salida("Quito");
        cliente11.setSeleccion_asiento("ventana");
        cliente11.setEspacio_maletas(1);
        cliente11.setMaleta_extra(true);
        cliente11.setPrecio(25.25);
        cliente11.setCargo_extra(5.00);

        cliente12.setNombre("Andres");
        cliente12.setCedula("1726195208");
        cliente12.setEdad(30);
        cliente12.setCuidad("Guayaquil");
        cliente12.setCodigo("1235");
        cliente12.setFecha_llegada("13/06/2024");
        cliente12.setFecha_salida("16/06/2024");
        cliente12.setNumero_bus(6);
        cliente12.setLugar_llegada("Guayaquil");
        cliente12.setLugar_salida("Quito");
        cliente12.setSeleccion_asiento("pasillo");
        cliente12.setEspacio_maletas(1);
        cliente12.setMaleta_extra(true);
        cliente12.setPrecio(25.25);
        cliente12.setCargo_extra(5.00);

        cliente13.setNombre("Pedro");
        cliente13.setCedula("1726195209");
        cliente13.setEdad(21);
        cliente13.setCuidad("Quito");
        cliente13.setCodigo("1324");
        cliente13.setFecha_llegada("11/06/2024");
        cliente13.setFecha_salida("16/06/2024");
        cliente13.setNumero_bus(5);
        cliente13.setLugar_llegada("Puyo");
        cliente13.setLugar_salida("Quito");
        cliente13.setSeleccion_asiento("ventana");
        cliente13.setEspacio_maletas(1);
        cliente13.setMaleta_extra(false);
        cliente13.setPrecio(28.25);
        cliente13.setCargo_extra(5.00);

        cliente1.mostrarDatos();
        cliente1.precio_total();
        System.out.println();
        cliente2.mostrarDatos();
        cliente2.precio_total();
        cliente3.mostrarDatos();
        cliente3.precio_total();
        System.out.println();
        cliente4.mostrarDatos();
        cliente4.precio_total();
        System.out.println();
        cliente6.mostrarDatos();
        cliente6.precio_total();
        System.out.println();
        cliente7.mostrarDatos();
        cliente7.precio_total();
        System.out.println();
        cliente8.mostrarDatos();
        cliente8.precio_total();
        System.out.println();
        cliente9.mostrarDatos();
        cliente9.precio_total();
        System.out.println();
        cliente10.mostrarDatos();
        cliente10.precio_total();
        System.out.println();
        cliente11.mostrarDatos();
        cliente11.precio_total();
        System.out.println();
        cliente12.mostrarDatos();
        cliente12.precio_total();
        System.out.println();
        cliente13.mostrarDatos();
        cliente13.precio_total();
        System.out.println();
    System.out.println("h");

    }
}
