public class Theatre extends Evenement {
    private String auteur;

    public Theatre(String auteur, String titre, int duree, String[] acteurs, String realisateur) {
        super(titre, duree, acteurs, realisateur);
        this.auteur = auteur;
    }

    @Override
    public String toString() {
        return "Theatre [auteur=" + auteur + ", toString()=" + super.toString() + "]";
    }

    public String getAuteur() {
        return auteur;
    }

    
}
