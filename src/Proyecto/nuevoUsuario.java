package Proyecto;

import java.util.Scanner;

public class nuevoUsuario{
    Scanner lector = new Scanner(System.in);
    static final int CLIENTES = 100;
    public void altaCliente(){


        String[] vector = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        dni documentacion = new dni();
        System.out.println("Introduce el DNI sin la letra");
        int nif = documentacion.validarDNI();
        int modulo = nif % 23;
        String dni = nif+vector[modulo];
        System.out.println("El dni es "+dni);
    }
}
