public class Simulation {

    public static void main(String[] args) {

        MailServer ms = new MailServer();

        ms.addMail(new Mail("Słuchaj ten","morderstwo jutro, pozdrawiam","zabujca33@com","ofiara11@student.com"));
        ms.addMail(new Mail("Witam","Spotkanie aktualne? Czekam na kwiatki","miłyczłowiek1@mailcom","innymiłyczłowiek@com"));
        ms.addMail(new Mail("Cześć","Mam nadzieję że łapówka będzie taka jak uzgodniliśmy","łapówkarz13@ciom","gangster2@net"));

        Police p = new Police();
        SecurityOffice s = new SecurityOffice();

        ms.addObserver(p);
        ms.addObserver(s);

        ms.scanMails();


    }

}
