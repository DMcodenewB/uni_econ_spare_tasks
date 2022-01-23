public class SecurityOffice implements MailObserver{

    @Override
    public void react(String mail_sender, String mail_recipient, String forbidden) {
        System.out.println(
                "Biuro ochrony zauważyło podejrzany mail, wykryto słowo: " +
                        forbidden +
                        ", nadawca maila: " +
                        mail_sender +
                        ", adresat: " +
                        mail_recipient
        );
    }

}
