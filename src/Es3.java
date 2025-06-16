import java.util.Scanner;

public class Es3 {
    public static double perimetroRettangolo(double l1, double l2) {
        return 2 * (l1 + l2);
    }

    public static int pariDispari(int n) {
        return n % 2 == 0 ? 0 : 1;
    }

    public static double perimetroTriangolo(double a, double b, double c) {
        double semiPerimetro = (a + b + c) / 2;
        return Math.sqrt(semiPerimetro * (semiPerimetro - a) * (semiPerimetro - b) * (semiPerimetro - c));

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci primo lato del rettangolo: ");
        double l1 = scanner.nextDouble();
        System.out.println("Inserisci secondo lato del rettangolo: ");
        double l2 = scanner.nextDouble();
        System.out.println("Perimetro rettangolo: " + perimetroRettangolo(l1, l2));


        System.out.println("Inserisci un numero intero: ");
        int n = scanner.nextInt();
        System.out.println("Risultato Pari o Dispari: " + pariDispari(n));

        System.out.println("Inserisci i tre lati del triangolo: ");
        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double c = scanner.nextDouble();
        System.out.println("Area del triangolo: " +perimetroTriangolo(a, b, c));

    }
}
