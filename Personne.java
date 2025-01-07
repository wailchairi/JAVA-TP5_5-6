package EX1;

abstract class Individu {
    private String nom;
    private String prenom;
    private String adresse;
    private String ville;
    private static int totalIndividus = 0;

    public Individu(String nom, String prenom, String adresse, String ville) {
        this.nom = nom;
        this.prenom = prenom;
        this.adresse = adresse;
        this.ville = ville;
        totalIndividus++;
    }

    @Override
    public String toString() {
        return "Nom : " + nom + "\nPrénom : " + prenom + "\nAdresse : " + adresse + "\nVille : " + ville;
    }

    public abstract void afficherDetails();

    public static void afficherStatistiques() {
        System.out.println("Nombre total d'individus : " + totalIndividus);
        System.out.println("Total Secrétaires : " + Secretaire.getTotalSecretaire());
        System.out.println("Total Professeurs : " + Professeur.getTotalProfesseurs());
        System.out.println("Total Apprenants : " + Apprenant.getTotalApprenants());
    }

    public void mettreAJourAdresse(String adresse, String ville) {
        this.adresse = adresse;
        this.ville = ville;
        afficherDetails();
    }
}
