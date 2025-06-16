import java.util.Arrays;

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

    public static String[] inserisciInArray(String[] arr1, String str) {
        String [] arr2 = new String[6];
        arr2 [0] = arr1[0];
        arr2 [1] = arr1[1];
        arr2 [2] = str;
        arr2 [3] = arr1[2];
        arr2 [4] = arr1[3];
        arr2 [5] = arr1[4];

        return arr2;
    }

    public static void main(String[] args) {

        int prodotto = moltiplica(3, 4);
        System.out.println("Risultato prodotto: " + prodotto);

        String RisultatoConcatena = concatena("Numero: ", 4);
        System.out.println("Risultato prodotto: " + RisultatoConcatena);

        String[] arr = {"Uno", "Due", "Tre", "Quattro", "Cinque"};
        String [] arrayResult = inserisciInArray(arr, "Pippo");
        System.out.println(Arrays.toString(arrayResult));

    }
}
