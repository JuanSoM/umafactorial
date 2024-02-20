import java.util.Scanner;

public class factorial {

    public static long getNumber() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        long num = scanInput.nextLong();
        scanInput.close();
        return num;
    }

    public static long fact(long num) {
        if (num <= 1) {
            return 1;
        } else {
            return num * fact(num - 1);
        }
    }

    public static void main(String[] args) {
        long num = getNumber();

        if (num < 0) {
            System.out.println("El factorial no está definido para números negativos");
        } else {
            long fac = fact(num);
            System.out.println("El factorial de " + num + " es " + fac);
        }
    }
}

