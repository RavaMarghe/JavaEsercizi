public class OperatoriAlgebrici {
    public static void main(String[] args) {
        char operatore = '*';

        // Chiamo il metodo
        String nomeOperatore = identificaOperatoreAlgebrico(operatore);
        System.out.println("L'operatore inserito è un operatore di: " + nomeOperatore);
    }

    // metodo per identificare il tipo di operazone algebrica
    public static String identificaOperatoreAlgebrico(char operatore) {
        return switch (operatore) {
            case '+' -> "addizione";
            case '-' -> "sottrazione";
            case '*' -> "moltiplicazione";
            case '/' -> "divisione";
            default -> "[Input non valido, inserisci uno di questi operatori: '+', '-', '*', '/']";
        };
    }
}