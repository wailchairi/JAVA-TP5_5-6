package EX1;

public class Professeur extends Personne {
    private String domaine;
    private static int totalProfesseurs = 0;

    public Professeur(String nom, String prenom, String adresse, String ville, String domaine) {
        super(nom, prenom, adresse, ville);
        this.domaine = domaine;
        totalProfesseurs++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nDomaine : " + domaine;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Professeur :");
        System.out.println(this);
    }

    public static int getTotalProfesseurs() {
        return totalProfesseurs;
    }
}
