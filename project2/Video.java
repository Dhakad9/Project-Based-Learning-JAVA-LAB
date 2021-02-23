import java.util.*;

public class Video {
    String title;
    Boolean checked;
    ArrayList<Integer> rating;

    public Video(String title) {
        this.title = title;
        this.checked = false;
        this.rating = new ArrayList<>();
    }

    public void beingChecked() {
        if (checked)
            System.out.println("Video not returned");
        else
            checked = true;
    }

    public void beingReturned() {
        if (checked)
            checked = false;
        else
            System.out.println("Video already checked out");
    }

    public void addRating(int rating) {
        this.rating.add(rating);
    }

    public void displayVideo() {
        System.out.println("Title :- " + title);
        System.out.println("Checked :- " + checked);
        System.out.print("Rating :- ");
        for (int i : rating)
            System.out.print(i + "\t");
        System.out.println();
    }
}