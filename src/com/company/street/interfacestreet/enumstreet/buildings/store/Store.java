package com.company.street.interfacestreet.enumstreet.buildings.store;

import com.company.street.interfacestreet.enumstreet.streetElementType;
import com.company.street.interfacestreet.streetElement;

import java.util.Random;
import java.util.Scanner;

public class Store implements streetElement {
    private String address;
    private String storeType;
    private int numWorkers;

    public Store(){
        address = "";
        storeType = "";
        numWorkers = 0;
    }

    public Store(String address, String storeType, int numWorkers) {
        this.address = address;
        this.storeType = storeType;
        this.numWorkers = numWorkers;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Store data entry!");
        while (true) {
            System.out.print("Enter address: ");
            address = scanner.nextLine();
            if (address.length() >= 3) {
                break;
            } else {
                System.out.println("Error, address must contain at least 3 characters.\n");
            }
        }
        while (true) {
            System.out.print("Enter store type: ");
            storeType = scanner.nextLine();
            if (storeType.length() >= 2) {
                break;
            } else {
                System.out.println("Error, store type must contain at least 2 characters.\n");
            }
        }
        while(true) {
            try {
                System.out.print("Enter number of workers: ");
                numWorkers = scanner.nextInt();
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
        String[] storeTypes = {"Grocery store", "Pharmacy", "Cafe"};
        storeType = storeTypes[random.nextInt(storeTypes.length)];
        numWorkers = random.nextInt(15) + 1;
    }

    @Override
    public void showData() {
        System.out.println(streetElementType.STORE.getType());
        System.out.println(streetElementType.STORE.getType() + " by the address " + address);
        System.out.println("Store type: " + storeType);
        System.out.println("Number of workers: " + numWorkers + "\n");
    }

    public void setStoreType(String storeType) {
        this.storeType = storeType;
    }

    public void setNumWorkers(int numWorkers) {
        this.numWorkers = numWorkers;
    }
}
