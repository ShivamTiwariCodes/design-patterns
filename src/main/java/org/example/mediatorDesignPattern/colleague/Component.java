package org.example.mediatorDesignPattern.colleague;

import org.example.mediatorDesignPattern.mediator.ReservationMediator;

public abstract class Component {

    protected ReservationMediator reservationMediator;

    public Component(ReservationMediator reservationMediator) {
        this.reservationMediator = reservationMediator;
    }
}
