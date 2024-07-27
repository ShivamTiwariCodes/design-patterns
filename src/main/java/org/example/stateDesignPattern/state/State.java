package org.example.stateDesignPattern.state;

import org.example.stateDesignPattern.Context;

public interface State {

    public void goToStartState(Context context);
    public void goToMidState(Context context);
    public void goToEndState(Context context);
}
