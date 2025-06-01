package person;

public class Test {

    public static void main(String[] args){
        Receiver receiver=new Receiver();

        Receiver.receive(new Wechat());
        Receiver.receive(new Qq());
        Receiver.receive(new Email());
    }
}
