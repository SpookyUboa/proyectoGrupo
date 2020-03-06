package Proyecto;
import java.util.Scanner;

public class GestionUsuarios {

    IntroduccionDatos nu = new IntroduccionDatos();
    int x = 0;
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
            System.out.println("Gracias por usar el gestor de usuarios de Gyºmtb");
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
        nu.visualizarCliente();
    }
    public void downUser(){
        nu.bajaDeCliente();
    }
    public void resurrectUser(){
        nu.recuCliente();
    }
    public void sortUser(){
        System.out.println("Cómo deseas ordenar la lista?\n 1 - Por DNI\n 2 - Por nombre\n 3 - Por apellido");
        try{
            x = lector.nextInt();
            if(x > 0 && x <= 3) nu.ordenaC(x, true);
            else System.out.println("Opción incorrecta");
        }
        catch(Exception e){
            System.out.println("Opción incorrecta");
            lector.next();
        }
    }
    public void searchUser(){

        /*

        PROCEDIMIENTO

        searchUser recibe un int x. Luego llama a nu.ordenaC(x) (NO DEBE SACAR LA LISTA). Después recibe ese mismo int
        como parámetro para buscar por el mismo campo. Hay que crear una opción nueva en el menú que muestre toda la lista
        ya que ordenaClients ya no lo hará.

         */

        System.out.println("Por qué campo quieres buscar?\n 1 - Por DNI\n 2 - Por nombre\n 3 - Por apellido");
        try{
            x = lector.nextInt();
            if(x > 0 && x <= 3) {
                nu.ordenaC(x, false);

            }
            else System.out.println("Opción incorrecta");
        }
        catch(Exception e){
            System.out.println("Opción incorrecta");
            lector.next();
        }

       nu.busca(x);
    }
}
