package leituraArquivos;

public class Pessoa implements IPessoa{
    private int id;
    private String nome;
    private String shortDescription;
    private String gender;
    private String country;
    private String occupation;
    private int birthYear;

    public Pessoa(int id, String nome, String shortDescription, String gender, String country, String occupation, int birthYear) {
        this.id = id;
        this.nome = nome;
        this.shortDescription = shortDescription;
        this.gender = gender;
        this.country = country;
        this.occupation = occupation;
        this.birthYear = birthYear;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getShortDescription() {
        return shortDescription;
    }

    public void setShortDescription(String shortDescription) {
        this.shortDescription = shortDescription;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }

    public int getBirthYear() {
        return birthYear;
    }

    public void setBirthYear(int birthYear) {
        this.birthYear = birthYear;
    }
    
}
