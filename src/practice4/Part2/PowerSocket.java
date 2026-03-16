package practice4.Part2;

import practice4.Part2.Interfaces.Pluggable;

public class PowerSocket {
    public boolean charge(Pluggable p) {
        p.plugIn();
        System.out.println("The device is plugged in to power socket!");
        return true;
    }
}
