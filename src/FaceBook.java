public class FaceBook implements SocialShare{
    private String message;

    @Override
    public void setMessage(String message) {
    this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to FaceBook:"+this.message);
    }
}
