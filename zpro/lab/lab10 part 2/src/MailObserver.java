public interface MailObserver {

    void react(String mail_sender, String mail_recipient, String forbidden);

}
