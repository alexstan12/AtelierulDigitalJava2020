package lab2.ch2;

public class Studio {
    private String nume;
    private Film[] filme;

    public Studio(String nume, Film[] filme){
        this.nume = nume;
        this.filme = filme;
    }

    public String getNume() {
        return this.nume;
    }

    public Film[] getFilme() {
        return this.filme;
    }
}
