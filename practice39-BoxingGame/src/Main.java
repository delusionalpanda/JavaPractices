public class Main {

    public static void main(String[] args) {
        Fighter f1 = new Fighter("Manny", 10, 30, 100, 25.0);
        Fighter f2 = new Fighter("Luke", 10, 30, 85, 25.0);

        Match game1 = new Match(f1, f2, 85, 100);
        game1.run();
    }
}
