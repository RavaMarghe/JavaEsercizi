package classi_astratte;

public class Main {
    public static void main(String[] args) {
        Rettangolo rettangolo = new Rettangolo(5, 7.3);
        Triangolo triangolo = new Triangolo(6.2, 8);

        rettangolo.calcoloArea();
        triangolo.calcoloArea();
    }
}
