package Proyecto;

import java.util.Arrays;
import java.util.Scanner;

/*++++++++++ Introduccion de datos de un usuario nuevo ++++++++++++++++*/

public class IntroduccionDatos {
    int[][] codigo = new int[100][2];
    String[][] datosCliente = new String[100][5];
    ordenarClients oc = new ordenarClients();
    int[] vectorcantidad = new int[1];
    Scanner lector = new Scanner(System.in);
    String[] vector = {"DNI", "Nombre", "Apellido", "Telefono", "Dirección"};

    public String altaCliente() {
        String[] vector = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        IntroduccionDatos documentacion = new IntroduccionDatos();
        System.out.println("Introduce el DNI sin la letra");
        int nif = documentacion.validarDNI();
        int modulo = nif % 23;
        String dni = nif + vector[modulo];
        System.out.println("El dni es " + dni);
        return dni;
    }

    public int validarDNI() {

        int nif, goodNif, nif2;
        int contador = 0;
        while (!lector.hasNextInt()) {
            System.out.println("Ha de tener 8 dígitos");
            lector.next();
        }
        nif = lector.nextInt();
        nif2 = nif;
        while (nif != 0) {
            nif = nif / 10;
            contador++;
        }
        if (contador == 8) {
            goodNif = nif2;
        } else {
            System.out.println("Ha de tener 8 dígitos");
            goodNif = validarDNI();
        }
        return goodNif;
    }

    public int validarTelefono() {
        int Phone, goodPhone, Phone2;
        int contador = 0;
        while (!lector.hasNextInt()) {
            System.out.println("Ha de tener 9 dígitos");
            lector.next();
        }
        Phone = lector.nextInt();
        Phone2 = Phone;
        while (Phone != 0) {
            Phone = Phone / 10;
            contador++;
        }
        if (contador == 9) {
            goodPhone = Phone2;
        } else {
            System.out.println("Ha de tener 9 dígitos");
            goodPhone = validarTelefono();
        }
        return goodPhone;
    }

    public String pasarNumero() {
        int telefono = validarTelefono();
        String goodtelefono;
        goodtelefono = Integer.toString(telefono);
        return goodtelefono;
    }

    public void altaUsuari() {
        GestionUsuarios usus = new GestionUsuarios();

        int cantidad;
        System.out.println("¿Cuantos usuarios quieres dar de alta?");
        cantidad = lector.nextInt();
        if (vectorcantidad[0] + cantidad > 100) {
            System.out.println("No puede pasarte");
            usus.inici();
        }
        vectorcantidad[0] = cantidad + vectorcantidad[0];
        for (int i = (vectorcantidad[0] - cantidad); i < vectorcantidad[0]; i++) {
            System.out.println("****************************");
            System.out.println("Datos del "+(i+1)+"º usuario");
            System.out.println("****************************"); // esto queda bonito aqui
            System.out.println();
            for (int j = 0; j < datosCliente[i].length; j++) {
                System.out.println("Introduce " + vector[j]);
                if (j == 0) {
                    datosCliente[i][j] = altaCliente();
                    codigo[i][j] = (i + 1);
                } else if (j == 3) {
                    datosCliente[i][j] = pasarNumero();
                }else if (j == 4) {
                    //lector.next();
                    datosCliente[i][j] = lector.next();
                } else {
                    datosCliente[i][j] = lector.next();
                }
                if (j == 1) {
                    codigo[i][j] = 0;
                }
            }
            System.out.println();
        }

        String[] titulos = {"DNI", "Nombre", "Apellido", "Teléfono", "Calle" ,"ID", "Estado Actual"};

        System.out.println("****** BASE DE DATOS DE CLIENTES ******");
        for (int j = 0; j < titulos.length; j++) {
            System.out.print(titulos[j] + " ");
        }
        System.out.println();
        for (int i = 0; i < datosCliente.length; i++) { // solo printeara los no nulls

            if( datosCliente[i][0] != null) {
                for (int j = 0; j < datosCliente[i].length; j++) {
                    System.out.print(datosCliente[i][j] + " ");
                }
                for (int k = 0; k < codigo[i].length; k++) {
                    System.out.print(codigo[i][k] + " ");
                }
                System.out.println();
            }
        }
    }
    public void visualizarCliente(){
        mostrarDatosCliente mdc = new mostrarDatosCliente();
        mdc.mostrarCliente(datosCliente, codigo);
    }
    public void bajaDeCliente(){
        bajaCliente bc = new bajaCliente();
        bc.darBaja(datosCliente, codigo);
    }
    public void recuCliente(){
        recuperarCliente rc = new recuperarCliente();
        rc.recuperarDatosUsuario(datosCliente, codigo);
    }
    public void ordenaC(int f){
        ordenarClients oc = new ordenarClients();
        oc.ordenar(codigo, datosCliente, f);
    }
    public void busca(int f){
        buscaCliente bc = new buscaCliente();
        bc.search(codigo, datosCliente,f);
    }
}

