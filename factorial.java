import java.math.BigInteger;
import java.util.Scanner;

public class factorial {

    public static BigInteger fact(BigInteger num) {
        if (num.compareTo(BigInteger.ONE) <= 0) {
            return BigInteger.ONE;
        } else {
            return num.multiply(fact(num.subtract(BigInteger.ONE)));
        }
    }

    // Resolver conflictos en getNumber()
    public static BigInteger getNumber() {
        Scanner scanInput = new Scanner(System.in);
        System.out.print("Introduzca un numero: ");
        BigInteger num = BigInteger.valueOf(scanInput.nextLong());
        scanInput.close();
        return num;
    }

    // Resolver conflictos en showFac()
    public static void showFac(BigInteger num) {
        if (num.compareTo(BigInteger.ZERO) < 0) {
            System.out.println("El factorial no está definido para números negativos");
        } else {
            BigInteger fac = fact(num);
            System.out.println("El factorial de " + num + " es " + fac);
        }
    }

    // Resolver conflictos en main()
    public static void main(String[] args) {
        BigInteger num = getNumber();
        showFac(num);
    }
}


