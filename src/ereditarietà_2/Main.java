package ereditarietà_2;

public class Main {
    public static void main(String[] args) {
        Forma forma = new Forma();
        Rettangolo rettangolo = new Rettangolo(3.5, 7);

        forma.calcoloArea();
        rettangolo.calcoloArea();
    }
}
