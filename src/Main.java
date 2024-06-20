package src;
import src.viajes.*;

public class Main {
    public static void main(String[] args) {
        Normal cliente1 = new Normal("Juan","1726195207",19,"Quito","1234","14/06/2024","15/06/2024",5,"Quito","Cuenca",23.25,"ventana",1,true,5.00);
        ServicioExtra cliente2= new ServicioExtra("Carlos","1736105951",23,"Guayaquil","5678","15/06/2024","16/06/2024",8,"Guayaquil","Ambato",25.25,"Televisión,internet ",2,true,5.00,"Comida");
        Normal cliente3 = new Normal("María", "1726195208", 27, "Cuenca", "9012", "16/06/2024", "17/06/2024", 3, "Cuenca", "Quito", 18.75, "pasillo", 1, false, 4.50);
        ServicioExtra cliente4 = new ServicioExtra("Pedro", "1736105952", 31, "Ambato", "3456", "17/06/2024", "18/06/2024", 6, "Ambato", "Guayaquil", 22.50, "Televisión", 2, true, 4.75, "Comida");
        ServicioExtra cliente5 = new ServicioExtra("Andrés", "1736105953", 29, "Machala", "2468", "19/06/2024", "20/06/2024", 7, "Machala", "Quito", 24.00, "Televisión,internet", 2, false, 5.50, "Comida");



// public Normal(String nombre, String cedula, int edad, String cuidad, String codigo, String fecha_salida, String fecha_llegada, int numero_bus, String lugar_salida, String lugar_llegada, Double precio, String seleccion_asiento, int espacio_maletas, Boolean maleta_extra, Double cargo_extra)
        Normal cliente6 = new Normal();
        Normal cliente7 = new Normal();
        Normal cliente8 = new Normal();
        Normal cliente9 = new Normal();
        Normal cliente10 = new Normal();


        cliente6.setNombre("Pablo");
        cliente6.setCedula("1726195207");
        cliente6.setEdad(19);
        cliente6.setCuidad("Quito");
        cliente6.setCodigo("1234");
        cliente6.setFecha_llegada("14/06/2024");
        cliente6.setFecha_salida("15/06/2024");
        cliente6.setNumero_bus(5);
        cliente6.setLugar_llegada("Cuenca");
        cliente6.setLugar_salida("Salinas");
        cliente6.setSeleccion_asiento("ventana");
        cliente6.setEspacio_maletas(1);
        cliente6.setMaleta_extra(true);
        cliente6.setPrecio(5.00);

        cliente7.setNombre("Lupe");
        cliente7.setCedula("1726195207");
        cliente7.setEdad(19);
        cliente7.setCuidad("Quito");
        cliente7.setCodigo("1234");
        cliente7.setFecha_llegada("14/06/2024");
        cliente7.setFecha_salida("15/06/2024");
        cliente7.setNumero_bus(5);
        cliente7.setLugar_llegada("Cuenca");
        cliente7.setLugar_salida("Quito");
        cliente7.setSeleccion_asiento("ventana");
        cliente7.setEspacio_maletas(1);
        cliente7.setMaleta_extra(true);
        cliente7.setPrecio(25.25);
        cliente7.setCargo_extra(5.00);

        cliente8.setNombre("Andres");
        cliente8.setCedula("1726195208");
        cliente8.setEdad(30);
        cliente8.setCuidad("Guayaquil");
        cliente8.setCodigo("1235");
        cliente8.setFecha_llegada("13/06/2024");
        cliente8.setFecha_salida("16/06/2024");
        cliente8.setNumero_bus(6);
        cliente8.setLugar_llegada("Guayaquil");
        cliente8.setLugar_salida("Quito");
        cliente8.setSeleccion_asiento("pasillo");
        cliente8.setEspacio_maletas(1);
        cliente8.setMaleta_extra(true);
        cliente8.setPrecio(25.25);
        cliente8.setCargo_extra(5.00);

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

        cliente10.setNombre("Pedro");
        cliente10.setCedula("1726195209");
        cliente10.setEdad(21);
        cliente10.setCuidad("Quito");
        cliente10.setCodigo("1324");
        cliente10.setFecha_llegada("11/06/2024");
        cliente10.setFecha_salida("16/06/2024");
        cliente10.setNumero_bus(5);
        cliente10.setLugar_llegada("Puyo");
        cliente10.setLugar_salida("Quito");
        cliente10.setSeleccion_asiento("ventana");
        cliente10.setEspacio_maletas(1);
        cliente10.setMaleta_extra(false);
        cliente10.setPrecio(28.25);
        cliente10.setCargo_extra(5.00);

        cliente1.mostrarDatos();
        cliente1.precio_total();
        System.out.println();
        cliente2.mostrarDatos();
        cliente2.precio_total();
        System.out.println();
        cliente3.mostrarDatos();
        cliente3.precio_total();
        System.out.println();
        cliente4.mostrarDatos();
        cliente4.precio_total();
        System.out.println();
        cliente5.mostrarDatos();
        cliente5.precio_total();
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
    System.out.println("h");

    }
}
