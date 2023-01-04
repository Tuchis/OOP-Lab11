package Task2;

import java.time.temporal.Temporal;

public class Gift implements MailCode{
    private static String TEXT = "Tuition for free for NAMEX";
    @Override
    public String generate(Client client){
        return TEXT.replaceAll("NAMER", client.getName());
    }
}
