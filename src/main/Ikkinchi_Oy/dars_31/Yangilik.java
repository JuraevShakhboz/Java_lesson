package Ikkinchi_Oy.dars_31;

public class Yangilik {
    private int numberOfLikes;

    public Yangilik() {
        this.numberOfLikes = 0;
    }

    public synchronized void increaseLikeSync() {
        // Sinxron ishlovchi metod
        numberOfLikes++;
        System.out.println("Sinxron ishlovchi: " + numberOfLikes);
    }

    public void increaseLikeAsync() {
        // Asinxron ishlovchi metod
        synchronized (this) {
            numberOfLikes++;
        }
        System.out.println("Asinxron ishlovchi: " + numberOfLikes);
    }
}
