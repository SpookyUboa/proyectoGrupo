package Proyecto;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner read = new Scanner(System.in);
        String s = read.nextLine();
        String s2 = read.nextLine();
        System.out.println(s.compareToIgnoreCase(s2));
    }
}
