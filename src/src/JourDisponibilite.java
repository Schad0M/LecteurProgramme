package src;

public class JourDisponibilite {
    boolean estDisponible;
    String heureDebut;
    String heureFin;

    public JourDisponibilite(boolean estDisponible, String heureDebut, String heureFin) {
        this.estDisponible = estDisponible;
        this.heureDebut = heureDebut;
        this.heureFin = heureFin;
    }

    @Override
    public String toString() {
        return estDisponible ? (heureDebut + " - " + heureFin) : "Non disponible";
    }
}
