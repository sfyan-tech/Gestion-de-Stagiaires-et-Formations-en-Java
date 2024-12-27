public class Main {
    public static void main(String[] args) {
        // Création des stagiaires
        Stagiaire s1 = new Stagiaire("Soufiane", new float[]{15f, 12f, 14.5f});
        Stagiaire s2 = new Stagiaire("Aymane", new float[]{10f, 11.5f, 9f});
        Stagiaire s3 = new Stagiaire("Samya", new float[]{17f, 18.5f, 15f});

        // Création de la formation
        Stagiaire[] stagiaires = {s1, s2, s3};
        Formation formation = new Formation("Java Formation", 10, stagiaires);

        // Affichage des résultats
        System.out.println("Moyenne de la formation : " + formation.calculerMoyenneFormation());
        System.out.println("Nom du meilleur stagiaire : " + formation.trouverNomMax());
        System.out.println("Note minimale du meilleur stagiaire : " + formation.trouverMinMax());
        System.out.println("Moyenne de Soufiane : " + formation.trouverMoyenneParNom("Soufiane"));
    }
}
