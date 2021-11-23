public class DocumentFile extends File{

    double size;

    DocumentFile(String nazwaPliku, String extension, double size){
        super(nazwaPliku, extension);
        this.size = size;
    }

    public double getSize() {
        return size;
    }

    public void setSize(double size) {
        this.size = size;
    }
}
