package org.example.mediatorDesignPattern.mediator;

import org.example.mediatorDesignPattern.colleague.Flight;
import org.example.mediatorDesignPattern.colleague.Passenger;

public class ReservationSystem implements ReservationMediator{

    @Override
    public void bookFlight(Passenger passenger, Flight flight) {
        flight.bookSeat(passenger);
    }

    @Override
    public void cancelFlight(Passenger passenger, Flight flight) {
        flight.cancelSeat(passenger);
    }

    @Override
    public void makePayment(Passenger passenger, int amount) {
        System.out.println("Payment is successful for amount " + amount);
    }
}
