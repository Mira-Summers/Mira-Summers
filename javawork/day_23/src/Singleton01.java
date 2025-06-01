public class Singleton01 {

        //饿汉式
        public static final Singleton01 singleton01;

        static {
            singleton01=new Singleton01();
        }
        private Singleton01(){

        }
        public static Singleton01 getInstance(){
            return singleton01;}


}
