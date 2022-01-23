public interface ServerObservable {

    void addObserver(MailObserver o);
    void deleteObserver(MailObserver o);
    void notifyObservers(String mail_sender, String mail_recipient, String forbidden);

}
