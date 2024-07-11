package ENSF380Lab2;
import java.util.Date;

public class Appointment {
    private String appointmentId;
    private Date appointmentDate;
    private String reason;
    private Pet bookedPet;
    private Employee employee;
    
    // Constructor
    public Appointment(String employeeId, Date appointmentDate, String reason, Pet bookedPet, Employee employee) {
        this.appointmentId = employeeId;
        this.appointmentDate = appointmentDate;
        this.reason = reason;
        this.bookedPet = bookedPet;
        this.employee = employee;
    }

    // Getter and Setter for appointmentId
    public String getAppointmentId() {
        return appointmentId;
    }

    public void setAppointmentId(String appointmentId) {
        this.appointmentId = appointmentId;
    }

    // Getter and Setter for appointmentDate
    public Date getAppointmentDate() {
        return appointmentDate;
    }

    public void setAppointmentDate(Date appointmentDate) {
        this.appointmentDate = appointmentDate;
    }

    // Getter and Setter for reason
    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    // Getter and Setter for bookedPet
    public Pet getBookedPet() {
        return bookedPet;
    }

    public void setBookedPet(Pet bookedPet) {
        this.bookedPet = bookedPet;
    }

    // Getter and Setter for employee
    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

}
