package Ikkinchi_Oy.dars_39;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;

enum VideoStatus{
    NORMAL,
    POPULAR,
    VERY_POPULAR,
    NEGATIV_POPULAR
}
class Video {
    private AtomicInteger views = new AtomicInteger(0);
    private AtomicInteger likes = new AtomicInteger(0);
    private AtomicInteger dislikes = new AtomicInteger(0);
    private AtomicInteger comments = new AtomicInteger(0);
    private AtomicReference<VideoStatus> status = new AtomicReference<>(VideoStatus.NORMAL);

    public void viewDone(){
        views.updateAndGet(v->{
            int x = views.get()+1;
            if (x > 20 && dislikes.get() < 10){
                status.set(VideoStatus.POPULAR);
            }
            return x;
        });
    }
    public void doComment(){
        comments.updateAndGet(v->{
            int x = comments.get()+1;
            if (x > 10 && dislikes.get() < 10){
                status.set(VideoStatus.VERY_POPULAR);
            }
            return x;
        });
    }
    public void doLike(){
        likes.incrementAndGet();
    }
    public void doDislike(){
        dislikes.updateAndGet(v->{
            int x = dislikes.get()+1;
            if (x > 10){
                status.set(VideoStatus.NEGATIV_POPULAR);
            }
            return x;
        });
    }

    public AtomicInteger getViews() {
        return views;
    }
    public AtomicInteger getLikes() { return likes; }
    public AtomicInteger getDislikes() {
        return dislikes;
    }
    public AtomicInteger getComments() { return comments; }
    public AtomicReference<VideoStatus> getStatus() {
        return status;
    }
}

public class Vazifa2 {
    public static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newCachedThreadPool();
        Video obj = new Video();

        for (int i=0; i<25; i++){
            service.submit(obj::viewDone);
        }
        for (int i=0; i<25; i++){
            service.submit(obj::doLike);
        }
        for (int i=0; i<10; i++){
            service.submit(obj::doComment);
        }
        for (int i=0; i<5; i++){
            service.submit(obj::doDislike);
        }

        Thread.sleep(1000);
        System.out.println("Views: "+obj.getViews().get());
        System.out.println("Likes: "+obj.getLikes().get());
        System.out.println("DisLikes: "+obj.getDislikes().get());
        System.out.println("Comments: "+obj.getComments().get());
        System.out.println("Status: "+obj.getStatus().get());

        service.shutdown();
    }
}
