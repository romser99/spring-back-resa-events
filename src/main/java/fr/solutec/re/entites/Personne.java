package fr.solutec.re.entites;

public class Personne {

    private String prenom ;
    private String nom ;
    private String email ;
    private String telephone ;
    private String password;

    public Personne( String prenom, String nom, String email, String telephone, String password) {
        this.prenom = prenom;
        this.nom = nom;
        this.email = email;
        this.telephone = telephone;
        this.password = password;

    }

    public Personne() {

    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}