public class SocialMediaFacade {
    private Twiter twiter;
    private FaceBook faceBook;
    private Zalo zalo;

    public SocialMediaFacade(Twiter twiter, FaceBook faceBook, Zalo zalo) {
        this.twiter = twiter;
        this.faceBook = faceBook;
        this.zalo = zalo;
    }

    public void share(String message){
       this.faceBook.setMessage(message);
       this.twiter.setMessage(message);
       this.zalo.setMessage(message);
       this.faceBook.share();
       this.zalo.share();
       this.twiter.share();
    }
}
