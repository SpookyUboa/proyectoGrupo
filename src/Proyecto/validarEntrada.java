package Proyecto;

import java.util.Scanner;

/*++++++++++ VALIDACION DE NUMEROS CUANDO TRATAMOS DATOS PARA CONSULTAR UN CLIENTE (CONSULTAR, BAJA, RECUPERAR) ++++++++++++++++*/

public class validarEntrada {

    // validacion de integer
    public static int validarInt(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextInt()){
            System.out.println("Valor no válido");
            lector.next();
        }
        int num = lector.nextInt();
        /*if (num <= 0 || num >100){ // este if lo he comentado ya que estamos validando campos con valores muy distintos como telefono que sera claramente mayor que 100
            System.out.println("Valor no válido");
            num = validarInt();
        }*/
        return num;
    }

    // validación de numero double
    public static double validarDouble(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextDouble()){
            System.out.println("Valor no válido");
            lector.next();
        }
        double num = lector.nextDouble();
        /*if (num <= 0 || num >100){
            System.out.println("Valor no válido");
            num = validarDouble();
        }*/
        return num;
    }


    // validación de numero float
    public static float validarFloat(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextFloat()){
            System.out.println("Valor no válido");
            lector.next();
        }
        float num = lector.nextFloat();
        /*if (num <= 0 || num >100){
            System.out.println("Valor no válido");
            num = validarFloat();
        }*/
        return num;
    }



    // validación de String
    public static String validarString(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNext()){
            System.out.println("Valor no válido");
            lector.next();
        }
        String string = lector.next(); // Queda pendiente el recoger una string por lineas ya que al pedirla por lineas se salta un par de campos despues
        /*if (num <= 0 || num >100){ // esto no se aplica al ser String
            System.out.println("Valor no válido");
            num = validarDouble();
        }*/
        return string;
    }

    // validación de char (caracter)
    public static char validarChar(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNext()){
            System.out.println("Valor no válido");
            lector.next();
        }
        char caracter = lector.next().charAt(0);
        /*if (num <= 0 || num >100){ // esto no se aplica al ser char
            System.out.println("Valor no válido");
            num = validarDouble();
        }*/
        return caracter;
    }


}
