package Task2;

import java.nio.charset.MalformedInputException;

public class MailInfo {
    private Client client;
    private MailCode mailCode;
    public String generate(){
        return mailCode.generate(client);
    }
}
