package mail;

import java.io.IOException;
import java.util.HashMap;

public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public void getMailText() throws IOException {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());

        for (String key: templates.keySet()){
            text = text.replace(key, templates.get(key));
        }
    }
}


