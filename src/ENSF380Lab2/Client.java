package ENSF380Lab2;

public class Client {
    private int clientId;
    private String clientName;
    private String phoneNumber;
    private String address;

    // Constructor
    public Client(int clientId, String clientName, String phoneNumber, String address) {
        this.clientId = clientId;
        this.clientName = clientName;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Getter and Setter for clientId
    public int getClientId() {
        return clientId;
    }

    public void setClientId(int clientId) {
        this.clientId = clientId;
    }

    // Getter and Setter for clientName
    public String getClientName() {
        return clientName;
    }

    public void setClientName(String clientName) {
        this.clientName = clientName;
    }

    // Getter and Setter for phoneNumber
    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    // Getter and Setter for address
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
