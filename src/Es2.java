import java.util.Scanner;
public class Es2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Inserisci la prima stringa: ");
        String s1 = scanner.nextLine();

        System.out.println("Inserisci la seconda stringa: ");
        String s2 = scanner.nextLine();

        System.out.println("Inserisci la terza stringa: ");
        String s3 = scanner.nextLine();

        System.out.println("Concatenazione in ordine: " + s1  + s2 + s3);

        System.out.println("Concatenazione in ordine inverso: " + s3 +s2 + s1);
    }
}
