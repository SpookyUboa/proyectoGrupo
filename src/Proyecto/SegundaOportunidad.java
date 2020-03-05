package Proyecto;

import java.util.Scanner;

public class SegundaOportunidad {
    Scanner lector = new Scanner(System.in);
    public boolean tractarOpcio(boolean stop) {
        boolean condicio=false;
        while (!condicio) {
            System.out.println("Quieres consultar otro cliente? [SI] [NO]");
            String opcion = lector.next().toLowerCase();
            if (opcion.equals("si")) {
                stop=false;
                condicio=true;
            } else if (opcion.equals("no")){
                stop=true;
                condicio=true;
            } else {
                System.out.println("La opcion no es valida");
            }
        }
        return stop;
    }
}
