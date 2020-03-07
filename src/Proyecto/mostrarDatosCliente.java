package Proyecto;

import java.sql.SQLOutput;
import java.util.Scanner;

/*++++++++++ ESTE FICHERO PERMITE VISUALIZAR A UN USUARIO EN CONCRETO HECHO!!!!!++++++++++++++++*/

public class mostrarDatosCliente {
    Scanner lector = new Scanner(System.in);

    public void mostrarCliente(String[][] datosCliente, int[][] codigo) {
        validarEntrada vn = new validarEntrada();


        String[] titulos = {"ID", "Estado Actual", "DNI", "Nombre", "Apellidos", "Teléfono", "Calle"};
        boolean stop = false;
        while (!stop) {

            System.out.println("Introduce el ID de cliente a visualizar");
            int id = validarEntrada.validarInt() - 1;  // Es -1 porqué el vector empieza desde 0
            int[] fila = codigo[id];
            String[] filaClient = datosCliente[id];

            if (codigo[id][1] == 1) {
                System.out.println("Datos no disponibles. Usuario borrado");
                System.out.println();

            } else if (codigo[id][0] == 0) {
                System.out.println("No existe ningún usuario con ese ID");

            } else {  // si no hay ningun problema con estos dos bucles mostrara todos los datos del usuario

                System.out.println("****** DATOS DEL USUARIO *******");
                System.out.println();

                for (int j = 0; j < fila.length; j++) {
                    System.out.print(titulos[j] + ": ");
                    System.out.println(fila[j]);
                }
                for (int i = 0; i < filaClient.length; i++) {
                    for (int j = 2; j < titulos.length; j++) {
                        System.out.print(titulos[j] + ": ");
                        System.out.println(filaClient[i++]); // i++ porqué así imprime todos los valores y no peta
                    }
                }
                System.out.println();
            }

            /*Este trozo de codigo se encarga de validar si quieres seguir o no en esta opcion del programa*/
            SegundaOportunidad so = new SegundaOportunidad();
            stop=so.tractarOpcio(stop);
        }
    }
}

