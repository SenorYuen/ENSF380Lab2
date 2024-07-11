package ENSF380Lab2;

public class Pet {
    private int petId;
    private String petName;
    private String species;
    private String colour;
    private String breed;
    private CareProfile careProfile;


    public Pet(int petId, String petName, String species, String colour, String breed, CareProfile careProfile) {
        this.petId = petId;
        this.petName = petName;
        this.species = species;
        this.colour = colour;
        this.breed = breed;
        this.careProfile = careProfile;
    }

    // Getter and Setter for petId
    public int getPetId() {
        return petId;
    }

    public void setPetId(int petId) {
        this.petId = petId;
    }

    // Getter and Setter for name
    public String getPetName() {
        return petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    // Getter and Setter for species
    public String getSpecies() {
        return species;
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    // Getter and Setter for colour
    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    // Getter and Setter for breed
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    // setter and getter for careProfile
    public CareProfile getCareProfile() {
        System.out.println(careProfile);
        return careProfile;
    }

    public void setCareProfile(CareProfile careProfile) {
        this.careProfile = careProfile;
    }

}