import java.util.*;
import java.util.stream.Collectors;

public class ListPatients implements InterfacePatient {
    private List<Patient> listP;

    public ListPatients() {
        listP = new ArrayList<>();
    }

    public void ajouterPatient(Patient p) {
        listP.add(p);
    }

    public void supprimerPatient(Patient p) {
        listP.remove(p);
    }

    public boolean rechercherPatient(Patient p) {
        return listP.contains(p);
    }

    public boolean rechercherPatient(int cin) {
        return listP.stream().anyMatch(patient -> patient.getCin() == cin);
    }

    public void afficherPatients() {
        listP.forEach(System.out::println);
    }

    public void trierPatientsParNom() {
        listP = listP.stream()
                .sorted(Comparator.comparing(Patient::getNom))
                .collect(Collectors.toList());
    }

    public void patientSansRedondance() {
        // Remove duplicates based on the equals method overridden in Patient class
        listP = listP.stream().distinct().collect(Collectors.toList());
    }
}
