package ENSF380Lab2;
import java.util.Date;

public class Invoice {
    private int invoiceId;
    private Date issueDate;
    private double amount;
    private Appointment appointment;

    // Constructor
    public Invoice(int invoiceId, Date issueDate, double amount, Appointment appointment) {
        this.invoiceId = invoiceId;
        this.issueDate = issueDate;
        this.amount = amount;
        this.appointment = appointment;
    }

    // Getter and Setter for invoiceId
    public int getInvoiceId() {
        return invoiceId;
    }

    public void setInvoiceId(int invoiceId) {
        this.invoiceId = invoiceId;
    }

    // Getter and Setter for issueDate
    public Date getIssueDate() {
        return issueDate;
    }

    public void setIssueDate(Date issueDate) {
        this.issueDate = issueDate;
    }

    // Getter and Setter for amount
    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    // Getter and Setter for boarding
    public Appointment getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment = appointment;
    }

    // Method to generate invoice
    public void generateInvoice(int invoiceId, Date issueDate, double amount) {
        System.out.println("Invoice Generated:");
        System.out.println("Invoice ID: " + invoiceId);
        System.out.println("Issue Date: " + issueDate);
        System.out.println("Amount: $" + amount);
    }
}
