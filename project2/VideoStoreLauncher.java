public class VideoStoreLauncher {
    public static void main(String[] args) {
        VideoStore test = new VideoStore();

        test.addVideo("The Matrix");
        test.recieveRating("The Matrix", 10);
        test.recieveRating("The Matrix", 8);
        test.recieveRating("The Matrix", 9);

        // EXTRA TEST CASES
        // test.recieveRating("Avengers Endgame", 10);
        // test.checkOut("The Matrix");
        // test.checkOut("The Matrix");
        // test.returnVideo("The Matrix");

        test.addVideo("Godfather II");
        test.recieveRating("Godfather II", 7);
        test.recieveRating("Godfather II", 7);
        test.recieveRating("Godfather II", 6);

        test.addVideo("Star Wars Episode IV:A New Hope");
        test.recieveRating("Star Wars Episode IV:A New Hope", 7);
        test.recieveRating("Star Wars Episode IV:A New Hope", 8);
        test.recieveRating("Star Wars Episode IV:A New Hope", 7);

        test.listInventory();

        test.checkOut("Godfather II");
        test.listInventory();
    }
}
