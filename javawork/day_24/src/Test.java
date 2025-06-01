public class Test {
    public static void main(String[] args) {
        CglibImpl cglib=new CglibImpl();

        CglibImpl proxy=(CglibImpl) new CreateCglib(cglib).getProxy();

        proxy.method();
    }
}
