package Main;
import Main.Models.Booking;
import Main.Models.Services.Impl.MaxHeap;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        MaxHeap bookingHeap = new MaxHeap(10);

        System.out.println("Booking flight system: ");
        Booking firstBooking = new Booking(101, 200, 4);
        Booking secondBooking = new Booking(102, 450, 5);
        Booking thirdBooking = new Booking(103, 650, 2 );
        Booking fourthBooking = new Booking(104, 850, 1);
        Booking fifthBooking = new Booking(105, 120, 2);

        System.out.println("Inserting the bookings: ");
        bookingHeap.insert(firstBooking);
        bookingHeap.insert(secondBooking);
        bookingHeap.insert(thirdBooking);
        bookingHeap.insert(fourthBooking);
        bookingHeap.insert(fifthBooking);


        System.out.println("Deleting Booking according to priority: ");
        bookingHeap.deleteMax();
        bookingHeap.deleteMax();
        bookingHeap.deleteMax();

        System.out.println("Final state of the Heap: ");
        bookingHeap.display();
    }
        }
