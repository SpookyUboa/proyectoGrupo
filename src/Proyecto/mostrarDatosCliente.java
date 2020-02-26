package Proyecto;

import java.util.Scanner;

public class mostrarDatosCliente {
    Scanner lector = new Scanner(System.in);
    public void mostrarCliente(String[][] datosCliente, int[][] codigo) {
        System.out.println("Introduce el ID de cliente a visualizar");
        int id = lector.nextInt()-1;  // Es -1 porqué el vector empieza desde 0
        int[] fila = codigo[id];
        String[] filaClient = datosCliente[id];
        String[] titulos = {"ID", "Estado Actual", "DNI", "Nombre", "Apelldio", "Teléfono", "Calle"};
        //boolean stop = false;
        if (codigo[id][1] == 1){
            System.out.println("Datos no disponibles. Usuario borrado");
            System.out.println();
            System.out.println("Introduzca la tecla 'M' para volver al menú");
            lector.next();
            GestionUsuarios usus = new GestionUsuarios();
            usus.menu();
        }else{
            for (int j = 0; j < fila.length; j++){
                System.out.print(titulos[j] +": ");
                System.out.println(fila[j]);
            }
            for (int i = 0; i < filaClient.length; i++){
                for (int j = 2; j < titulos.length; j++) {
                    System.out.print(titulos[j]+": ");
                    System.out.println(filaClient[i++]); // i++ porué así imprime todos los valores y no peta
                }
            }
            System.out.println();
            System.out.println("Introduzca la tecla 'M' para volver al menú");
            lector.next();
        }

    }
}

