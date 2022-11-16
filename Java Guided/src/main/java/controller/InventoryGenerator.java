package controller;

import model.CrossCountry;
import model.Downhill;
import model.Touring;
import model.Vintage;

import java.util.ArrayList;

public class InventoryGenerator {
    private ArrayList<Touring> touringList;
    private ArrayList<Vintage> vintageList;
    private ArrayList<CrossCountry> crossCountryList;
    private ArrayList<Downhill> downhillList;
    private SerialNumberGenerator generator;

    public InventoryGenerator() {
        generator = SerialNumberGenerator.getInstance();
        touringList = buildTouringInventory(new ArrayList<>());
        vintageList = buildVintageInventory(new ArrayList<>());
        crossCountryList = buildCrossCountryInventory(new ArrayList<>());
        downhillList = buildDownhillInventory(new ArrayList<>());

    }


    public ArrayList<Touring> getTouringList() {
        return touringList;
    }

    public ArrayList<Vintage> getVintageList() {
        return vintageList;
    }

    public ArrayList<CrossCountry> getCrossCountryList() {
        return crossCountryList;
    }

    public ArrayList<Downhill> getDownhillList() {
        return downhillList;
    }

    private ArrayList<Touring> buildTouringInventory(ArrayList<Touring> bikeList) {
        Touring bike = new Touring();
        generator.startGeneration(bike.getPrefix(), bike.getStart());

        for(int i = 0; i < 10; i++) {
            bike = new Touring();
            bike.setSerial(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }

    private ArrayList<Vintage> buildVintageInventory(ArrayList<Vintage> bikeList) {
        Vintage bike = new Vintage();
        generator.startGeneration(bike.getPrefix(), bike.getStart());

        for (int i = 0; i < 10; i++) {
            bike = new Vintage();
            bike.setSerial(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }

    private ArrayList<Downhill> buildDownhillInventory(ArrayList<Downhill> bikeList) {
        Downhill bike = new Downhill();
        generator.startGeneration(bike.getPrefix(), bike.getStart());

        for (int i = 0; i < 10; i++) {
            bike = new Downhill();
            bike.setSerial(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }

    private ArrayList<CrossCountry> buildCrossCountryInventory(ArrayList<CrossCountry> bikeList) {
        CrossCountry bike = new CrossCountry();
        generator.startGeneration(bike.getPrefix(), bike.getStart());

        for (int i = 0; i < 10; i++) {
            bike = new CrossCountry();
            bike.setSerial(generator.getNextSerial());
            bikeList.add(i, bike);
        }
        return bikeList;
    }
}
