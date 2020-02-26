package Proyecto;
import java.util.Scanner;

public class GestionUsuarios {
    dni nu = new dni();
    Scanner lector = new Scanner(System.in);
    private boolean fin = false;
    public static void main(String[] args) {
        GestionUsuarios programa = new GestionUsuarios();
        programa.inici();

    }
    public void inici() {
        System.out.println("Bienvenido al gestor de usuarios de Gymtb");
        while (!fin){
            menu();
            tratarOpcion();
        }
    }
    public void menu(){
        System.out.println("MENÚ\n" +
                "-----\n" +
                "1. Dar de alta nuevo usuario\n" +
                "2. Visualizar usuario\n" +
                "3. Dar de baja usuario\n" +
                "4. Recuperar datos de usuario dado de baja\n" +
                "5. Ordenar usuarios\n" +
                "6. Buscar usuario\n" +
                "7. Salir");
    }
    public void tratarOpcion() {
        int num = validarNum();
        System.out.println();
        if (num == 1){
            newUser();
        }else if (num == 2){
            viewUser();
        }else if (num == 3){
            downUser();
        }else if (num == 4){
            resurrectUser();
        }else if (num == 5){
            sortUser();
        }else if (num == 6){
            searchUser();
        }else{
            System.out.println("Gracias por usar el gestor de usuarios de Gymtb");
            fin = true;
        }
    }
    public int validarNum(){
        int numVal;
        while (!lector.hasNextInt()){
            System.out.println("Valor no válido");
            lector.next();
        }
        numVal = lector.nextInt();

        if (numVal <= 0 || numVal > 7){
            System.out.println("Opción válida");
            numVal = validarNum();
        }
        return numVal;
    }
    public void newUser(){
        nu.altaUsuari();
    }
    public void  viewUser(){

    }
    public void downUser(){

    }
    public void resurrectUser(){

    }
    public void sortUser(){

    }
    public void searchUser(){

    }
}
