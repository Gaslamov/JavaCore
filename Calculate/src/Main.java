import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Введи имя операции");
        Scanner console = new Scanner(System.in);
        String operation = console.nextLine();
        System.out.println("Введи 2 числа");
        double a = console.nextDouble();
        double b = console.nextDouble();
        if (operation.equals("сложение")) {
            Main.sum(a,b);
        }
        if (operation.equals("деление")) Main.division(a,b);
        if (operation.equals("вычитание")) Main.subtraction(a,b);
        if (operation.equals("умножение")) Main.multiplication(a,b);
    }
    public static void sum (double a,double b) {
        System.out.println(a+b);
    }
    public static void subtraction (double a,double b) {
        System.out.println(a-b);
    }
    public static void multiplication (double a, double b){
        System.out.println(a*b);
    }

    public static void division(double a,double b) {
        System.out.println(a/b);
    }
}
