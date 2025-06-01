package person;

import com.sun.deploy.security.SandboxSecurity;

public class Receiver {

    public static void receive(Message message ){

        message.receive();

    }

}
