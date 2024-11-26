public class App {
    public static void main(String[] args) {
        ThemeArtiste ta=new ThemeArtiste("Mohamed");
        String tArtistes1[]= {"Ahmed","Salah","Mohamed"};
        String tArtistes2[]= {"Sana","Imene","Mouna"};
        OrgniseEvtMois MJuillet=new OrgniseEvtMois(7,ta);
        Evenement e1= new Film("Film1",2 , tArtistes1, "Sami", "Youssef", "action");
        Evenement e2= new Film("Film2",1 , tArtistes2, "Dalel", "Asma", "Drame");
        }
    }
