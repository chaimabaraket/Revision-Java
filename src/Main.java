

public class Main {
    public static void main(String[] args) {

        Patient patient1 = new Patient(1, "chaima", "baraket", 12345);
        Patient patient2 = new Patient(2, "arij", "hakouna", 67890);
        Patient patient3 = new Patient(3, "fedia", "baraket", 54321);

        Medecin medecin1 = new Medecin(101, "Dr. wala", "cheli", 1001);
        Medecin medecin2 = new Medecin(102, "Dr. ahmed", "brahem", 1002);
        Medecin medecin3 = new Medecin(101, "Dr. wala", "cheli", 1001);

        Hopital hopital = new Hopital();

        hopital.ajouterMedecin(medecin1);
        hopital.ajouterMedecin(medecin2);
        hopital.ajouterMedecin(medecin3);

        hopital.ajouterPatient(medecin1, patient1);
        hopital.ajouterPatient(medecin1, patient2);
        hopital.ajouterPatient(medecin2, patient3);

        System.out.println("List of Medecins and their Patients:");
        hopital.afficherMap();

        
        hopital.afficherMedcinPatients(medecin1);

        SetMedecins setMedecins = new SetMedecins();
        setMedecins.ajouterMedecin(medecin1);
        setMedecins.ajouterMedecin(medecin2);

        System.out.println("\n Medecins:");
        setMedecins.afficherMedecins();
        System.out.println("Number of Medecins: " + setMedecins.nombreMedecins());

        System.out.println("\nSorted Set of Medecins:");
        setMedecins.trierMedecins().forEach(System.out::println);
    }
}