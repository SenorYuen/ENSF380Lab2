package ENSF380Lab2;

public class CareProfile {
    private String feedingInstructions;
    private String[] medicationList;
    private String medicationInstructions;

    // Constructor
    public CareProfile(String feedingInstructions, String[] medicationList, String medicationInstructions) {
        this.feedingInstructions = feedingInstructions;
        this.medicationList = medicationList;
        this.medicationInstructions = medicationInstructions;
    }

    // Getter and Setter for feedingInstructions
    public String getFeedingInstructions() {
        return feedingInstructions;
    }

    public void setFeedingInstructions(String feedingInstructions) {
        this.feedingInstructions = feedingInstructions;
    }

    // Getter and Setter for medicationList
    public String[] getMedicationList() {
        return medicationList;
    }

    public void setMedicationList(String[] medicationList) {
        this.medicationList = medicationList;
    }

    // Getter and Setter for medicationInstructions
    public String getMedicationInstructions() {
        return medicationInstructions;
    }

    public void setMedicationInstructions(String medicationInstructions) {
        this.medicationInstructions = medicationInstructions;
    }
}
