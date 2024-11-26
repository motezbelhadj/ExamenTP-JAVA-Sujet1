public class OrgniseEvtMois {
    private int mois;
    private ThemeEvt theme;
    private Evenement tab[];
    
    public int nbMax(){
        if(mois==4||mois==6||mois==9||mois==11){
            return 30;
        }
        if(mois==2){
            return 28;
        }
        else{
            return 31;
        }
    }

    public OrgniseEvtMois(int mois, ThemeEvt theme) {
        this.mois = mois;
        this.theme = theme;
        this.tab=new Evenement[nbMax()];
    }

    public void ajouter (Evenement Evt, int jour)throws EvtException{
        if(jour<1||jour>nbMax()){
            throw new EvtException ("Jour Incorrecte");
        }
        if(tab[jour]==null){
            tab[jour]=Evt;
        }
        else{
            for(int i=0;i<tab.length;i++){
                if(tab[i]==null){
                    tab[i]=Evt;
                    break;
                }
                if(i==tab.length){
                    throw new EvtException ("Complet");
                }
            }
            
        }

    }

    public void afficherCalendrierEvts(){
        for(int i=0;i<tab.length;i++){
            if(tab[i]!=null){
                System.out.println("jour = "+i+tab[i].toString());
            }
        }
    }
}
