public class Film extends Evenement {
    private String producteur ;
    private String genre;
    
    public Film(String titre, int duree, String[] acteurs, String realisateur, String producteur, String genre) {
        super(titre, duree, acteurs, realisateur);
        this.producteur = producteur;
        this.genre = genre;
    }

    @Override
    public String toString() {
        return "Film [producteur=" + producteur + ", genre=" + genre + ", toString()=" + super.toString() + "]";
    }

    public String getProducteur() {
        return producteur;
    }

    public String getGenre() {
        return genre;
    }

    
}
