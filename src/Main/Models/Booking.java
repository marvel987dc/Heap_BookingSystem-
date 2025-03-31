package Main.Models;

public class Booking {
     private int bookingId;
     private double bookingAmount;
     private int priorityCode;

    //constructor to initialize the variables

    public Booking(int bookingId, double bookingAmount, int priorityCode) {
        this.bookingId = bookingId;
        this.bookingAmount = bookingAmount;
        this.priorityCode = priorityCode;
    }

    //getters and setters to access and modify the values attributes.


    public int getBookingId() {
        return bookingId;
    }

    public double getBookingAmount() {
        return bookingAmount;
    }

    public int getPriorityCode() {
        return priorityCode;
    }

    public void setBookingId(int bookingId) {
        this.bookingId = bookingId;
    }

    public void setBookingAmount(double bookingAmount) {
        this.bookingAmount = bookingAmount;
    }

    public void setPriorityCode(int priorityCode) {
        this.priorityCode = priorityCode;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookingId=" + bookingId +
                ", bookingAmount=" + bookingAmount +
                ", priorityCode=" + priorityCode +
                '}';
    }
}



