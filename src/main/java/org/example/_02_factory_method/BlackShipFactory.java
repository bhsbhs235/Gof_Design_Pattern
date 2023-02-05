package org.example._02_factory_method;

public class BlackShipFactory implements ShipFactory{

    @Override
    public Ship createShip() {
        return new BlackShip();
    }
}
