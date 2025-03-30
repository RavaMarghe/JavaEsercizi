public class TabellinaAritmetica {
    public static void main(String[] args) {
        int numero = 3;

        calcoloTabellinaAritmetica(numero);
    }

    // Metodo per calcolare la tabellina aritmetica del valore inserito
    public static void calcoloTabellinaAritmetica(int numero) {
        for (int i = 0; i <= 10; i++) {
            System.out.println(numero + " * " + i + " = " + (numero * i));
        }
    }
}