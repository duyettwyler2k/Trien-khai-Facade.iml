public class Twiter implements SocialShare{
    private String message;
    @Override
    public void setMessage(String message) {
        this.message=message;
    }

    @Override
    public void share() {
        System.out.println("Sharing to Twite:"+this.message);
    }
}
