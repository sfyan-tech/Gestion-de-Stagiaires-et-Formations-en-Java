class Formation {

    private String intitule;
    private int  nbrJours;
    Stagiaire[] stagiaires;
    
    public String getIntitule() {
        return intitule;
    }
    public void setIntitule(String intitule) {
        this.intitule = intitule;
    }
    public int getNbrJours() {
        return nbrJours;
    }
    public void setNbrJours(int nbrJours) {
        this.nbrJours = nbrJours;
    }
    public Stagiaire[] getStagiaires() {
        return stagiaires;
    }
    public void setStagiaires(Stagiaire[] stagiaires) {
        this.stagiaires=stagiaires;
    }
   
    //-------------------------------------
    public Formation(String intitule,int nbrJours,Stagiaire[] stagiaires) {
        this.intitule = intitule;
        this.nbrJours = nbrJours;
        this.stagiaires = stagiaires;
    }
    //-----------------------------------------
    public float calculerMoyenneFormation(){
        float somme = 0;
        for (Stagiaire stagiaire:stagiaires) {
            somme+=stagiaire.calculerMoyenne();
        }
        return somme/stagiaires.length;
    }
    //----------------------------------------------
    public int trouverIndiceMax() {
        int indiceMax = 0;
        float max = stagiaires[0].calculerMoyenne();
        for (int i = 1; i < stagiaires.length; i++) {
            if (stagiaires[i].calculerMoyenne() > max) {
                max = stagiaires[i].calculerMoyenne();
                indiceMax = i;
            }
        }
        return indiceMax;
    }
    //------------------------------------------------
    public String trouverNomMax() {
        return stagiaires[trouverIndiceMax()].getNom();
    }
    //-------------------------------------------------
    public float trouverMinMax() {
        return stagiaires[trouverIndiceMax()].trouverMin();
    }
    //--------------------------------------------------
    public float trouverMoyenneParNom(String nom) {
        for (Stagiaire stagiaire : stagiaires) {
            if (stagiaire.getNom().equals(nom)) {
                return stagiaire.calculerMoyenne();
            }
        }
        return -1;
    }
}
