package com.company.street.interfacestreet.enumstreet.buildings.house;

import com.company.street.interfacestreet.enumstreet.streetElementType;
import com.company.street.interfacestreet.streetElement;

import java.util.Random;
import java.util.Scanner;

public class House implements streetElement {
    private String address;
    private int numResidents;

    public House() {
        address = "";
        numResidents = 0;
    }

    public House(String address, int numResidents) {
        this.address = address;
        this.numResidents = numResidents;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Home data entry!");
        while (true) {
            System.out.print("Enter address: ");
            address = scanner.nextLine();
            if (address.length() >= 3) {
                break;
            } else {
                System.out.println("Error, address must contain at least 3 characters.\n");
            }
        }
        while(true) {
            try {
                System.out.print("Enter number of residents: ");
                numResidents = scanner.nextInt();
                break;
            } catch (java.util.InputMismatchException e) {
                System.out.println("Error, enter correct data!\n");
                scanner.nextLine();
            }
        }
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public void randomStreetElement(String street) {
        Random random = new Random();
        address = street + ", " + (random.nextInt(100) + 1);;
        numResidents = random.nextInt(300) + 1;
    }

    @Override
    public void showData() {
        System.out.println(streetElementType.HOUSE.getType());
        System.out.println(streetElementType.HOUSE.getType() + " by the address " + address);
        System.out.println("Number of residents: " + numResidents + "\n");
    }

    public void setNumResidents(int numResidents) {
        this.numResidents = numResidents;
    }
}