package EX1;

public class Apprenant extends Personne {
    private String formationActuelle;
    private static int totalApprenants = 0;

    public Apprenant(String nom, String prenom, String adresse, String ville, String formationActuelle) {
        super(nom, prenom, adresse, ville);
        this.formationActuelle = formationActuelle;
        totalApprenants++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nFormation : " + formationActuelle;
    }

    @Override
    public void afficherInfos() {
        System.out.println("Apprenant :");
        System.out.println(this);
    }

    public static int getTotalApprenants() {
        return totalApprenants;
    }
}
