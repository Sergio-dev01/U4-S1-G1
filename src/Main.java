//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    //Es1
    public static int moltiplica(int a, int b) {
        return a * b;
    }
    public static String concatena (String s, int n) {
        return s + n;
    }

    public static void main(String[] args) {

        int prodotto = moltiplica(3, 4);
        System.out.println("Risultato prodotto: " + prodotto);

        String RisultatoConcatena = concatena("Numero: ", 4);
        System.out.println("Risultato prodotto: " + RisultatoConcatena);


    }
}
