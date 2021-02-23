import java.util.*;

public class VideoStore {
    ArrayList<Video> inventory;

    public VideoStore() {
        inventory = new ArrayList<>();
    }

    public void addVideo(String title) {
        inventory.add(new Video(title));
    }

    public void checkOut(String title) {
        boolean found = false;
        for (Video i : inventory) {
            if (i.title.equalsIgnoreCase(title)) {
                i.beingChecked();
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Video not found\n");
    }

    public void returnVideo(String title) {
        boolean found = false;
        for (Video i : inventory) {
            if (i.title.equalsIgnoreCase(title)) {
                i.beingReturned();
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Video not found\n");

    }

    public void recieveRating(String title, int rating) {
        boolean found = false;
        for (Video i : inventory) {
            if (i.title.equalsIgnoreCase(title)) {
                i.addRating(rating);
                found = true;
                break;
            }
        }
        if (!found)
            System.out.println("Video not found\n");
    }

    public void listInventory() {
        for (Video i : inventory) {
            i.displayVideo();
            System.out.println();
        }
    }

}