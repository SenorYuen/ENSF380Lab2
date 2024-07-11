package ENSF380Lab2;
import java.util.Date;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Boarding {
    private int boardingId;
    private Date checkIn;
    private Date checkOut;
    private Pet pet;
    private Client client;
    private CareProfile careProfile;
    static final double BOARDING_FEE = 100.0;

    // Constructor
    public Boarding(int boardingId, Date checkIn, Date checkOut, Pet pet, Client client, CareProfile careProfile) {
        if (checkIn.after(checkOut)) {
            throw new IllegalArgumentException("Check-in date cannot be after check-out date");
        }
        this.boardingId = boardingId;
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.pet = pet;
        this.client = client;
        this.careProfile = careProfile;
    }

    // Getter and Setter for boardingId
    public int getBoardingId() {
        return boardingId;
    }

    public void setBoardingId(int boardingId) {
        this.boardingId = boardingId;
    }

    // Getter and Setter for checkInDate
    public Date getCheckIn() {
        return checkIn;
    }

    public void setCheckInDate(Date checkIn) {
        this.checkIn = checkIn;
    }

    // Getter and Setter for checkOutDate
    public Date getCheckOut() {
        return checkOut;
    }

    public void setCheckOut(Date checkOut) {
        this.checkOut = checkOut;
    }

    // Getter and Setter for pet
    public Pet getPet() {
        return pet;
    }

    public void setPet(Pet pet) {
        this.pet = pet;
    }

    // Getter and Setter for client
    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }

    // Getter and Setter for careProfile
    public CareProfile getCareProfile() {
        return careProfile;
    }

    public void setCareProfile(CareProfile careProfile) {
        this.careProfile = careProfile;
    }

    // Method to calculate boarding cost
    public double calculateBoardingCost(Date checkIn, Date checkOut) {

        if (checkIn.after(checkOut)) {
            throw new IllegalArgumentException("Check-in date cannot be after check-out date");
        }

        // Convert java.util.Date to java.time.LocalDate
        LocalDate localCheckIn = checkIn.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();
        LocalDate localCheckOut = checkOut.toInstant().atZone(java.time.ZoneId.systemDefault()).toLocalDate();

        //Calculate number of days
        long days = ChronoUnit.DAYS.between(localCheckIn, localCheckOut);

        // return cost
        return BOARDING_FEE * days;
    }

}
