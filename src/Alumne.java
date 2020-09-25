public class Alumne {
    public String nom;
    private String cicle;
    private int curs;

    public Alumne(String nom, String cicle, int curs) {
        this.nom = nom;
        this.cicle = cicle;
        this.curs = curs;
    }

    public Alumne() {
        this.nom = "sense nom";
        this.cicle = "sense cicle";
        this.curs = 0;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setCicle(String cicle) {
        this.cicle = cicle;
    }

    public void setCurs(int curs) {
        this.curs = curs;
    }

    public String getNom() {
        return nom;
    }

    public String getCicle() {
        return cicle;
    }

    public int getCurs() {
        return curs;
    }

    @Override
    public String toString() {
        return nom + "," + cicle + "," + curs;
    }
}
