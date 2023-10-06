package com.company.street.interfacestreet.enumstreet.buildings.hospital;

import com.company.street.interfacestreet.enumstreet.streetElementType;
import com.company.street.interfacestreet.streetElement;

import java.util.Random;
import java.util.Scanner;

public class Hospital implements streetElement {
    private String address;
    private String hospitalType;

    public Hospital(){
        address = "";
        hospitalType = "";
    }

    public Hospital(String address, String hospitalType) {
        this.address = address;
        this.hospitalType = hospitalType;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hospital data entry!");
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
            System.out.print("Enter hospital type: ");
            hospitalType = scanner.nextLine();
            if (hospitalType.length() >= 5) {
                break;
            } else {
                System.out.println("Error, hospital type must contain at least 5 characters.\n");
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
        String[] hospitalTypes = {"children's hospital", "adult hospital"};
        hospitalType = hospitalTypes[random.nextInt(hospitalTypes.length)];
    }

    @Override
    public void showData() {
        System.out.println(streetElementType.HOSPITAL.getType());
        System.out.println(streetElementType.HOSPITAL.getType() + " by the address " + address);
        System.out.println("Hospital type: " + hospitalType + "\n");
    }

    public void setHospitalType(String hospitalType) {
        this.hospitalType = hospitalType;
    }
}
