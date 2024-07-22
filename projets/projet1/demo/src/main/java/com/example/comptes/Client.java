import java.util.ArrayList;
import java.util.List;

public class Client {
    private int id;
    private String nom;
    private String prenom;
    private List<Compte> comptes;

    public Client(int id, String nom, String prenom) {
        this.id = id;
        this.nom = nom;
        this.prenom = prenom;
        this.comptes = new ArrayList<>();
    }

    public int getId() {
        return id;
    }

    public String getNom() {
        return nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public List<Compte> getComptes() {
        return comptes;
    }

    public void ajouterCompte(Compte compte) {
        comptes.add(compte);
    }

    @Override
    public String toString() {
        String result = "Client [id=" + id + ", nom=" + nom + ", prenom=" + prenom + "]\n";
        for (Compte compte : comptes) {
            result += compte.toString() + "\n";
        }
        return result;
    }
}
