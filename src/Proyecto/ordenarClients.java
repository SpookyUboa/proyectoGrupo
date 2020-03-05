package Proyecto;
import java.util.Scanner;

public class ordenarClients {
    public void ordenar(int[][] codigos, String[][] clientes, int f) {
        validarNumero lp = new validarNumero();
        int[] aux1 = new int[2];
        String[] aux2 = new String[5];
        Scanner read = new Scanner(System.in);
        int opcion = 0;
        System.out.println("Cómo deseas ordenar la lista?\n 1 - Por DNI\n 2 - Por nombre\n 3 - Por apellido");
        opcion = lp.validarNum(); //le he metido validación de numero gente

        switch(opcion){
            case 1:
                for (int i = 0; i < clientes.length; i++) {
                    for (int j = i + 1; j < clientes.length; j++) {
                        if(clientes[i][0] != null && clientes[j][0] != null){
                            if(clientes[i][0].compareToIgnoreCase(clientes[j][0]) > 0) {
                                aux1 = codigos[i];
                                aux2 = clientes[i];

                                codigos[i] = codigos[j];
                                clientes[i] = clientes[j];

                                codigos[j] = aux1;
                                clientes[j] = aux2;
                            }
                        }
                    }
                }
                System.out.println("Pulsa cualquier tecla para finalizar..."); // se queda sino en blanco y confunde un poco

                break;
            case 2:
                for (int i = 0; i < clientes.length; i++) {
                    for (int j = i + 1; j < clientes.length; j++) {
                        if(clientes[i][1] != null && clientes[j][1] != null){
                            if(clientes[i][1].compareToIgnoreCase(clientes[j][1]) > 0) {
                                aux1 = codigos[i];
                                aux2 = clientes[i];

                                codigos[i] = codigos[j];
                                clientes[i] = clientes[j];

                                codigos[j] = aux1;
                                clientes[j] = aux2;
                            }
                        }
                    }
                }

                System.out.println("Pulsa cualquier tecla para finalizar..."); // se queda sino en blanco y confunde un poco

                break;
            case 3:
                for (int i = 0; i < clientes.length; i++) {
                    for (int j = i + 1; j < clientes.length; j++) {
                        if(clientes[i][2] != null && clientes[j][2] != null){
                            if(clientes[i][2].compareToIgnoreCase(clientes[j][2]) > 0) {
                                aux1 = codigos[i];
                                aux2 = clientes[i];

                                codigos[i] = codigos[j];
                                clientes[i] = clientes[j];

                                codigos[j] = aux1;
                                clientes[j] = aux2;
                            }
                        }
                    }
                }

                System.out.println("Pulsa cualquier tecla para finalizar..."); // se queda sino en blanco y confunde un poco

                break;
            default:
                System.out.println("Opción incorrecta");
                break; // intentar hacerla recursiva para volver a ordenar
        }

        for (int i = 0; i < clientes.length; i++) {

            if(clientes[i][0] != null){
                System.out.println(clientes[i][0] + "  " + clientes[i][1] + "  " + clientes[i][2] + "  " + clientes[i][3] + "  " + clientes[i][4] + "  " + codigos[i][0] + "  " + codigos[i][1]);
            }
        }
        read.nextLine();
    }
}

