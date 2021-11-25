package mail;

import java.util.ArrayList;

public class MailBox {
    public ArrayList<MailInfo> infos = new ArrayList<MailInfo>();

    public void addMailInfo(MailInfo inf){
        infos.add(inf);
    }
    public void sendAll(){
        while (infos.size() > 0){
            infos.remove(0);
        }
    }
}
