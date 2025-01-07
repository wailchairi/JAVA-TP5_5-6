package EX1;

public class TestPersonne {
	public static void main(String[] args) {
	Secretaire S=new Secretaire("Said", "Abidi","Rue Elamal", "Casablanca", "A123");
	S.EcrirePersonne();
	Enseignant E=new Enseignant("Ahmed", "Sbihi", "Rue Bel Air", "Fès", "Informatique");
	E.EcrirePersonne();
	Etudiant E1=new Etudiant("Samir", "Merras", "rue saules ", "Oujda", "licence informatique");
	Etudiant E2=new Etudiant("Hamid", "Nissani", "rue d’olivier", "Taza", "DUT informatique");
	E2.EcrirePersonne();
	E.modifierPersonne("rue du grenadier", "Rabat");
	S.modifierPersonne("rue Taounat", "Safi");
	Personne.nbPersonnes();
	}
}