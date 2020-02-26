package Proyecto;


import java.util.Scanner;

public class dni {
    Scanner lector = new Scanner(System.in);
    public int validarDNI(){

        String[] vector = {"T", "R", "W", "A", "G", "H", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int nif , goodNif, nif2;
        int contador = 0;
        while (!lector.hasNextInt()){
            System.out.println("Ha de tener 8 dígitos");
            lector.next();
        }
        nif = lector.nextInt();
        nif2 = nif;
        while (nif != 0){
            nif = nif/10;
            contador++;
        }
        if (contador == 8){
            goodNif = nif2;
        }else {
            System.out.println("Ha de tener 8 dígitos");
            goodNif = validarDNI();
        }
        return goodNif;
    }
}
