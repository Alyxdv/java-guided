package main;

import model.AbstractBike;
import model.Accessories;

import java.util.ArrayList;

public class SampleReceipt {
    private double total = 0.0;

    ArrayList<AbstractBike> bikeCart;
    ArrayList<Accessories> accessoryCart;

    public SampleReceipt(ArrayList<AbstractBike> bikeList, ArrayList<Accessories> accessoryList) {
        this.bikeCart = bikeList;
        this.accessoryCart = accessoryList;
        showTitle();
        showColumnHeader();
        showBikeCart();
        showAccessoryCart();
        showShipping();
        // prep for sale (promo)
    }

    private void showTitle() {
        String company = String.format("%30s", "ACME Bicycle Company");
        String address = String.format("%33s", "123 Main St, City, St, zip");
        String phone = String.format("%27s", "(000) 000-0000");
        System.out.println(company.toUpperCase());
        System.out.println(address);
        System.out.println(phone);
        showStars();
        String cash = String.format("%25s", "MONEY RECEIPT");
        System.out.println(cash);
        showStars();
    }

    private void showColumnHeader() {
        String price = String.format("%23s |", "Price");
        System.out.print("| Description |");
        System.out.println(price);
    }

    private void showAccessoryCart() {
        if (accessoryCart.size() > 0) {
            for (Accessories item : accessoryCart) {
                System.out.print("  "+item.getItemName());
                String price = String.format("%27s", "$" + item.getPrice());
                System.out.println(price);
                System.out.println();
                total += item.getPrice();
            }
        }
    }

    private void showBikeCart() {
        if (bikeCart.size() > 0) {
        for (AbstractBike bike : bikeCart) {
            System.out.println(bike);
            System.out.println("  Frame Color: "+bike.getColor());
            System.out.println("  Serial #: "+bike.getSerial());
            total += bike.getPrice();
            if (bike.getOptionName() != null) {
                String customPrice = String.format("%15s", "$" + bike.getOptionAmount());
                System.out.print("  " + bike.getOptionName());
                System.out.println(customPrice);
                total += bike.getOptionAmount();
            }
            System.out.println();
        }
    }
    }

    private void showShipping() {
        double ship = 49.99;
        showStars();
        System.out.print("Sub Total:");
        System.out.printf("%27s %.2f%n", "$", total);
        System.out.print("Shipping cost:");
        System.out.printf("%23s %.2f%n", "$", ship);
        System.out.print("Total");
        double totalShip = total + ship;
        System.out.printf("%30s %.2f%n", "$", totalShip);

    }

    private void showStars(){
        for (int i = 0; i < 40; i++) {
            System.out.print("*");
        }
        System.out.println();
    }
}