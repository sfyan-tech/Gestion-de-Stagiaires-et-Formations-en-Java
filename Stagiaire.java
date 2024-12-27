class Stagiaire{

    private String nom;
    private float[] notes;
    //---------------------------------------------------
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public float[] getNotes() {
        return notes;
    }
    public void setNotes(float[] notes) {
        this.notes = notes;
    }
    //---------------------------------------------------
    Stagiaire(String nom, float[] notes){
        this.nom=nom;
        this.notes=notes;
    }
    //-----------------------------------------------------
    public float calculerMoyenne(){
        float somme=0;
        for (float note : notes) {
            somme+=note;
        }
        return somme/notes.length ;
    }
    //------------------------------------------------------
    public float trouverMax(){
        float max=notes[0];

        for(int i = 0; i < notes.length; i++){
            if(notes[i] > max)
                max = notes[i];
            }
        return max;    
    }
    public float trouverMin(){
        float min=notes[0];

        for(int i = 0; i < notes.length; i++){
            if(notes[i] < min)
                min = notes[i];
            }
        return min;    
    }
    //-----------------------------------------------------
    
}