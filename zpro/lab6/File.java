public class File {

    String nazwaPliku;
    String extension;

    File(){}
    File(String nazwaPliku, String extension){
        this.nazwaPliku = nazwaPliku;
        this.extension = extension;
    }

    public String getNazwaPliku() {
        return nazwaPliku;
    }

    public void setNazwaPliku(String nazwaPliku) {
        this.nazwaPliku = nazwaPliku;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }
}
