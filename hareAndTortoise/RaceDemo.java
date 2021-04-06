public class RaceDemo {
    public static void main(String[] args) {
        Racer racer = new Racer();

        Thread tortoiseThread = new Thread(racer, "Tortoise");
        Thread hareThread = new Thread(racer, "Hare");

        tortoiseThread.start();
        hareThread.start();
    }
}
