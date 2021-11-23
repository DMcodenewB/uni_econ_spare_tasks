public class MovieFile extends File {

    short year;

    MovieFile(String nazwaPliku, String extension, short year){
        super(nazwaPliku, extension);
        this.year = year;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
