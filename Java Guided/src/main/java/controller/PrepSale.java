package controller;

import model.BikeInterface;

public class PrepSale {
    public void prepareForSale(BikeInterface bike) {
        Registration.allocatingBikeSerialNumber();
        Documentation.printBrochure();
        bike.airTires();
        bike.testRide();
        bike.washFrame();
    }
}
