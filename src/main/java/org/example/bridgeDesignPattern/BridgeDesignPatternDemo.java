package org.example.bridgeDesignPattern;

import org.example.bridgeDesignPattern.device.Device;
import org.example.bridgeDesignPattern.device.Radio;
import org.example.bridgeDesignPattern.device.TV;
import org.example.bridgeDesignPattern.remote.AdvanceRemote;
import org.example.bridgeDesignPattern.remote.BasicRemote;
import org.example.bridgeDesignPattern.remote.Remote;

public class BridgeDesignPatternDemo {

    public void run() {

        Device tv = new TV();
        Device radio = new Radio();

        Remote tvBasicRemote = new BasicRemote(tv);
        Remote tvAdvanceRemote = new AdvanceRemote(tv);

        Remote radioBasicRemote = new BasicRemote(radio);
        Remote radioAdvanceRemote = new AdvanceRemote(radio);

        tvBasicRemote.toogleOnOff();
        tvBasicRemote.increaseVolume();
        ((AdvanceRemote)tvAdvanceRemote).mute();
        tvAdvanceRemote.increaseVolume();

        radioBasicRemote.toogleOnOff();
        radioBasicRemote.increaseVolume();
        ((AdvanceRemote)radioAdvanceRemote).mute();
        radioAdvanceRemote.increaseVolume();
    }
}
