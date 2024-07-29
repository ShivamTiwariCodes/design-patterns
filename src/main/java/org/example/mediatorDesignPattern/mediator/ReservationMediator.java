package org.example.mediatorDesignPattern.mediator;

import org.example.mediatorDesignPattern.colleague.Flight;
import org.example.mediatorDesignPattern.colleague.Passenger;

public interface ReservationMediator {
    void bookFlight(Passenger passenger, Flight flight);
    void cancelFlight(Passenger passenger, Flight flight);
    void makePayment(Passenger passenger, int amount);
}
