package com.company.street.interfacestreet.enumstreet.buildings.school;

import com.company.street.interfacestreet.enumstreet.streetElementType;
import com.company.street.interfacestreet.streetElement;

import java.util.Random;
import java.util.Scanner;

public class School implements streetElement {
    private String address;
    private String levelAccreditation;
    private int numStudents;

    public School(){
        address = "";
        levelAccreditation = "";
        numStudents = 0;
    }

    public School(String address, String levelAccreditation, int numStudents) {
        this.address = address;
        this.levelAccreditation = levelAccreditation;
        this.numStudents = numStudents;
    }

    @Override
    public void setData() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("School data entry!");
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
            System.out.print("Enter level of accreditation: ");
            levelAccreditation = scanner.nextLine();
            if (levelAccreditation.length() >= 5) {
                break;
            } else {
                System.out.println("Error, level of accreditation must contain at least 5 characters.\n");
            }
        }
        while(true) {
            try {
                System.out.print("Enter number of students: ");
                numStudents = scanner.nextInt();
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
        String[] levelAccreditations = {"general education", "gymnasium", "lyceum"};
        levelAccreditation = levelAccreditations[random.nextInt(levelAccreditations.length)];
        numStudents = random.nextInt(2000) + 250;
    }

    @Override
    public void showData() {
        System.out.println(streetElementType.SCHOOL.getType());
        System.out.println(streetElementType.SCHOOL.getType() + " by the address " + address);
        System.out.println("Level of accreditation: " + levelAccreditation);
        System.out.println("Number of students: " + numStudents + "\n");
    }

    public void setLevelAccreditation(String levelAccreditation) {
        this.levelAccreditation = levelAccreditation;
    }

    public void setNumStudents(int numStudents) {
        this.numStudents = numStudents;
    }
}
