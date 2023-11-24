import java.util.*;

public class Hopital {
    public Map<Medecin, ListPatients> medecinPatiens;

    public Hopital() {
        medecinPatiens = new TreeMap<>(Comparator.comparing(Medecin::getNom));
    }

    public void ajouterMedecin(Medecin m) {
        medecinPatiens.put(m, new ListPatients());
    }

    public void ajouterPatient(Medecin m, Patient p) {
        if (medecinPatiens.containsKey(m)) {
            medecinPatiens.get(m).ajouterPatient(p);
        } else {
            System.out.println("Le médecin n'existe pas dans l'hôpital.");
        }
    }

    public void afficherMap() {
        medecinPatiens.forEach((medecin, patients) -> {
            System.out.println("Médecin: " + medecin);
            patients.afficherPatients();
            System.out.println();
        });
    }

    public void afficherMedcinPatients(Medecin m) {
        if (medecinPatiens.containsKey(m)) {
            System.out.println("Patients du médecin " + m.getNom() + " " + m.getPrenom() + ":");
            medecinPatiens.get(m).afficherPatients();
        } else {
            System.out.println("Le médecin n'existe pas dans l'hôpital.");
        }
    }
}
