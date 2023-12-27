package Ikkinchi_Oy.dars_31;

public class ClassCounter {
    public int likes = 0;
    public int dislikes = 0;
    public void incrementLikes(){
        likes++;
        System.out.println("like incremeted to "+likes);
    }
    public void incrementDislikes(){
        dislikes++;
        System.out.println("Dislike incremeted to "+dislikes);
    }
}
