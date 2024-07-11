package ENSF380Lab2;

public class Printout {
    private String content;
    private CareProfile careProfile;

    // Constructor
    public Printout(CareProfile careProfile) {
        this.careProfile = careProfile;
        setContent();
    }

    // Getter and Setter for content
    public String getContent()    {
        return content;
    }

    public void setContent() {
        String feedingInstructions = "Feeding Instructions: " + careProfile.getFeedingInstructions() + "\n";

        StringBuilder medicationListBuilder = new StringBuilder("Medication List: ");
        String[] medicationList = careProfile.getMedicationList();
        for (int i = 0; i < medicationList.length; i++) {
            if (i > 0) {
                medicationListBuilder.append(", ");
            }
            medicationListBuilder.append(medicationList[i]);
        }
        medicationListBuilder.append("\n");
    
        String medicationInstructions = "Medication Instructions: " + careProfile.getMedicationInstructions();
    
        this.content = feedingInstructions + medicationListBuilder.toString() + medicationInstructions;
    }    

    public void print() {
        System.out.println(content);
    }
}
