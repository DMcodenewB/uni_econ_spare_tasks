import java.util.ArrayList;

public class MailServer implements ServerObservable{

    private ArrayList<MailObserver> observers;
    private ArrayList<Mail> mails;
    private ForbiddenWords forbiddenWords;
    private String notify_word;
    private String notify_sender;
    private String notify_recipient;

    MailServer(){
        this.observers = new ArrayList<>();
        this.mails = new ArrayList<>();
        this.forbiddenWords = new ForbiddenWords();
    }

    @Override
    public void addObserver(MailObserver o) {
        observers.add(o);
    }

    @Override
    public void deleteObserver(MailObserver o) {
        if(observers.contains(o)) observers.remove(o);
    }

    public void scanMails(){
        String mail;
        for(Mail m : mails){
            mail = m.getHeader()+" "+m.getContent()+" "+m.getSender()+" "+m.getRecipient();
            for(String forbidden : forbiddenWords.getWords()){
                if(mail.contains(forbidden)){
                    notify_word = forbidden;
                    notify_sender = m.getSender();
                    notify_recipient = m.getRecipient();
                    notifyObservers(notify_sender, notify_recipient, notify_word);
                }
            }
        }
    }

    public void addMail(Mail m){
        mails.add(m);
    }

    @Override
    public void notifyObservers(String mail_sender, String mail_recipient, String forbidden) {
        for(MailObserver o : observers){
            o.react(mail_sender, mail_recipient, forbidden);
        }
    }
}
