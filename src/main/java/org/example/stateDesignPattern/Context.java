package org.example.stateDesignPattern;

import org.example.stateDesignPattern.state.StartState;
import org.example.stateDesignPattern.state.State;

public class Context {

    private State state;

    public Context() {this.state = new StartState();
    }

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }
}
