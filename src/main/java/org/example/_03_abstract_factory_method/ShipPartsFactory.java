package org.example._03_abstract_factory_method;

public interface ShipPartsFactory {

    Anchor createAnchor();

    Wheel createWheel();

}
