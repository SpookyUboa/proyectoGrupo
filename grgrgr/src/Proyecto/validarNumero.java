package Proyecto;

import java.util.Scanner;

/*++++++++++ VALIDACION DE NUMEROS CUANDO TRATAMOS DATOS PARA CONSULTAR UN CLIENTE (CONSULTAR, BAJA, RECUPERAR) ++++++++++++++++*/

public class validarNumero {
    public int validarNum(){
        Scanner lector = new Scanner(System.in);
        while(!lector.hasNextInt()){
            System.out.println("Valor no válido");
            lector.next();
        }
        int num = lector.nextInt();
        if (num <= 0 || num >100){
            System.out.println("Valor no válido");
            num = validarNum();
        }
        return num;
    }
}
