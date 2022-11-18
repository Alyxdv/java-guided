package main;

import controller.InventoryGenerator;
import model.*;

import java.util.ArrayList;
import java.util.Scanner;

public class SampleOrder {
    private ArrayList<AbstractBike> bikeOrder;
    private ArrayList<Accessories> accessoryOrder;
    private Scanner userIn;
    private InventoryGenerator inventory;
    private AbstractBike bikeChoice;
    private Accessories bikeExtra;

    public SampleOrder() {
        bikeOrder = new ArrayList<>();
        accessoryOrder = new ArrayList<>();
        userIn = new Scanner(System.in);
        inventory = new InventoryGenerator();
    }

    public void welcomeMessage() {
        System.out.println("Welcome to ACME Bicycle Company.");
        System.out.println("Your one stop shop for Bicycles and Accessories.");
        buySomething();
    }

    private void buySomething() {
        System.out.println("Are you here to buy accessories or a bike, or both?");
        System.out.println("Your options are: \n1 for Accessories\n2 for a Bike.");
        String type = userIn.next();
        validateSomething(type);
    }

    private void buyBike() {
        System.out.println("What kind of bike would you like?");
        System.out.println("Your options are:\nC - Cross Country\nD - Downhill\nT - Touring\nV - Vintage");
        String type = userIn.next();
        validateBikeType(type.toUpperCase());
        frameColorOffer(bikeChoice);
        offerUpgrades();
        bikeOrder.add(bikeChoice);
        anotherBike();
        orderDone();
        // Send order to receipt
    }

    private void orderDone() {
        // Create sample receipt
        new SampleReceipt(bikeOrder, accessoryOrder);
    }

    private void anotherBike() {
        System.out.println("Did you want to add another bike? Yes or no.");
        String answer = userIn.next();
        validateAnotherBike(answer);
    }

    private void offerAccessories() {
        System.out.println("Do you want to buy any accessories? yes or no.");
        String answer = userIn.next();
        validateOffer(answer);
    }

    private void buyAccessories() {
        System.out.println("What accessories are you interested in?");
        System.out.println("Your options are:\nH - Helmet\nG - Gloves\nB - Bell\nBK - Basket\nT - Tire pump\nBH - Bottle and holder\nL - Lights");
        String item = userIn.next();
        validateAccessories(item.toUpperCase());
        accessoryOrder.add(bikeExtra);
        moreAccessories();
    }

    private void offerUpgrades() {
        System.out.println("We offer upgrades for your bicycle besides the gold frame color");
        System.out.println("We offer the following:\nLS - Leather Seat\nLG - Leather Grips\n" +
                "WT - White tires\nNone - No upgrades");
        String upgrade = userIn.next();
        validateUpgrade(upgrade);
    }

    private void frameColorOffer(AbstractBike bike) {
        System.out.println("Our bikes come with a default paint color.");
        System.out.println("Your current frame color is "+bike.getColor().toString().toLowerCase());
        System.out.println("Would you like this bike with a different frame color? Yes or no.");
        String choice = userIn.next();
        switch (choice.toLowerCase()) {
            case "yes":
                frameColorChange(bike);
            case "no":
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                frameColorOffer(bike);
        }
    }

    private void frameColorChange(AbstractBike bike) {
        System.out.println("What color frame would you like?");
        System.out.println("Your choices are:\nBK - Black\nBL - Blue\nCH - Chrome\n" +
                "GR - Green\nRD - Red\nGD - Gold (extra charge)");
        String color = userIn.next();
        validateColorChoice(color.toUpperCase());
    }

    private void moreAccessories() {
        System.out.println("Do you want to add more accessories? yes or no");
        String val = userIn.next();

        switch (val) {
            case "yes":
                bikeExtra = null;
                buyAccessories();
                break;
            case "no":
                orderDone();
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                moreAccessories();
        }
    }

    private void validateOffer(String answer) {
        switch (answer) {
            case "yes":
                buyAccessories();
                break;
            case "no":
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                validateOffer(answer);
        }
    }

    private void validateAnotherBike(String answer) {
        switch (answer.toLowerCase()){
            case "yes":
                bikeChoice = null;
                buyBike();
                break;
            case "no":
                offerAccessories();
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                anotherBike();
        }
    }

    private void validateUpgrade(String upgrade) {
        switch (upgrade.toUpperCase()){
            case "LS":
                bikeChoice = new LeatherSeatOption(bikeChoice);
                break;
            case "LG":
                bikeChoice = new LeatherGripsOption(bikeChoice);
                break;
            case "WT":
                bikeChoice = new WhiteTireOption(bikeChoice);
                break;
            case "NONE":
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                offerUpgrades();
        }
    }

    private void validateColorChoice(String color) {
        switch (color) {
            case "BK":
                bikeChoice.paintFrame(FrameColors.BLACK);
                break;
            case "BL":
                bikeChoice.paintFrame(FrameColors.BLUE);
                break;
            case "CH":
                bikeChoice.paintFrame(FrameColors.CHROME);
                break;
            case "GR":
                bikeChoice.paintFrame(FrameColors.GREEN);
                break;
            case "RD":
                bikeChoice.paintFrame(FrameColors.RED);
                break;
            case "GD":
                bikeChoice = new GoldFrameOption(bikeChoice);
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                frameColorChange(bikeChoice);
        }
    }

    private void validateBikeType(String type) {
        switch (type) {
            case "C":
                bikeChoice = inventory.getCrossCountryList().get(0);
                inventory.getCrossCountryList().remove(0);
                break;
            case "D":
                bikeChoice = inventory.getDownhillList().get(0);
                inventory.getDownhillList().remove(0);
                break;
            case "T":
                bikeChoice = inventory.getTouringList().get(0);
                inventory.getTouringList().remove(0);
                break;
            case "V":
                bikeChoice = inventory.getVintageList().get(0);
                inventory.getVintageList().remove(0);
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                buyBike();
        }
    }

    private void validateAccessories(String choice) {
        switch (choice) {
            case "H":
                bikeExtra = new Accessories("Helmet", 29.99);
                break;
            case "G":
                bikeExtra = new Accessories("Gloves", 19.99);
                break;
            case "B":
                bikeExtra = new Accessories("Bell", 9.99);
                break;
            case "BK":
                bikeExtra = new Accessories("Basket", 29.99);
                break;
            case "T":
                bikeExtra = new Accessories("Tire pump", 39.99);
            case "BH":
                bikeExtra = new Accessories("Bottle and Holder", 34.99);
                break;
            case "L":
                bikeExtra= new Accessories("Lights", 36.99);
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                buyAccessories();
        }
    }

    private void validateSomething(String type) {
        switch (type) {
            case "1":
                buyAccessories();
                break;
            case "2":
                buyBike();
                break;
            default:
                System.out.println("You have entered an invalid choice.");
                buySomething();


        }
    }

}
