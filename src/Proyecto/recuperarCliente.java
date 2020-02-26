package Proyecto;

import java.util.Scanner;

public class recuperarCliente {
    public void recuperarDatosUsuario(String[][] datosCliente, int[][] codigo) {
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduce el ID de cliente a recuperar sus datos");
        int id = lector.nextInt() - 1;  // Es -1 porqué el vector empieza desde 0
        int[] fila = codigo[id];
        String[] filaClient = datosCliente[id];
        String[] titulos = {"ID", "Estado Actual", "DNI", "Nombre", "Apelldio", "Teléfono", "Calle"};
        //boolean stop = false;
        if (codigo[id][1] == 0) {
            System.out.println("Este cliente ya existe");
            System.out.println();
            System.out.println("Introduzca la tecla 'M' para volver al menú");
            lector.next();
            GestionUsuarios usus = new GestionUsuarios();
            usus.menu();
        } else {
            for (int j = 0; j < fila.length; j++) {
                System.out.print(titulos[j] + ": ");
                System.out.println(fila[j]);
            }
            for (int i = 0; i < filaClient.length; i++) {
                for (int j = 2; j < titulos.length; j++) {
                    System.out.print(titulos[j] + ": ");
                    System.out.println(filaClient[i++]); // i++ porué así imprime todos los valores y no peta
                }
            }
            System.out.println("¿Quiere recuperar datos de este cliente? SI | NO");
            String choice = lector.next().toLowerCase();
            boolean baja = false;
            while (!baja) {
                if (choice.equals("si")) {
                    if (codigo[id][1] == 0) {
                        System.out.println("Este usuario ya estaba dado de alta");
                    } else {
                        System.out.println("Datos recuperados satisfactoriamente");
                        codigo[id][1] = 0;
                    }
                    baja = true;
                } else if (choice.equals("no")) {
                    GestionUsuarios usus = new GestionUsuarios();
                    usus.inici();
                    baja = true;
                } else {
                    System.out.println("Opción no reconocida");
                }
                System.out.println();
                System.out.println("Introduzca la tecla 'M' para volver al menú");
                lector.next();
            }
        }
    }
}


