package mail;

public class MailSender {
    public MailBox box;

    public boolean sendMail(MailInfo inf){
        box.addMailInfo(inf);
        box.sendAll();
        return true;
    }
}
