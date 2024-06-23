public class Main {
    public static void main(String[] args) {
        Forma rettangolo = new Rettangolo(10, 5);
        Forma triangolo = new Triangolo(8, 4);

        rettangolo.calcolaArea();
        triangolo.calcolaArea();
    }
}