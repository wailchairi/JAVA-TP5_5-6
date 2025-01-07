package EX1;

public class Secretaire extends Personne{
	 private String bureau;
    private static int totalAssistants = 0;

    public Assistant(String nom, String prenom, String adresse, String ville, String bureau) {
        super(nom, prenom, adresse, ville);
        this.bureau = bureau;
        totalAssistants++;
    }

    @Override
    public String toString() {
        return super.toString() + "\nBureau : " + bureau;
    }

    @Override
    public void afficherDetails() {
        System.out.println("Assistant :");
        System.out.println(this);
    }

    public static int getTotalAssistants() {
        return totalAssistants;
    }
}