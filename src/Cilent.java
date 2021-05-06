public class Cilent {
    public void share(String message){
        SocialMediaFacade socialMediaFacade=new SocialMediaFacade(new Twiter(),new FaceBook(),new Zalo());
        socialMediaFacade.share(message);
    }
}
