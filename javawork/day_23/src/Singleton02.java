public class Singleton02 {
    public volatile static Singleton02 singleton02;

    private Singleton02(){

    }

    public static Singleton02 getInstance(){
        if(singleton02==null){
            synchronized (Singleton02.class){
                if(singleton02==null){
                    singleton02=new Singleton02();
                }
            }
        }
        return singleton02;
    }
}
