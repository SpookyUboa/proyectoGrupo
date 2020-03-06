package Proyecto;
import java.util.Scanner;

public class buscaCliente {
    public void search(int[][] codigos, String[][] clientes, int f) {
        Scanner read = new Scanner(System.in);
        int count = 0;
        while(clientes[count][f - 1] != null){
            count++;
        }

                System.out.println("Introduce el dato que deseas buscar");
                String dni = read.nextLine();
                int mid = count / 2;
                if(dni.compareToIgnoreCase(clientes[mid][f - 1]) < 0){
                    for(int i = mid; i >= 0; i--){
                        if(clientes[i][0].equalsIgnoreCase(dni)){
                            System.out.println(clientes[i][0] + "   " + clientes[i][1] + "   " + clientes[i][2]);
                            break;
                        }
                    }
                }
                else if(dni.compareToIgnoreCase(clientes[mid][f - 1]) > 0){
                    for(int i = mid; i < count; i++){
                        if(clientes[i][f - 1].equalsIgnoreCase(dni)){
                            System.out.println(clientes[i][0] + "   " + clientes[i][1] + "   " + clientes[i][2]);
                            break;
                        }
                    }
                }
                else System.out.println(clientes[mid][0] + "   " + clientes[mid][1] + "   " + clientes[mid][2]);;
    }
}
