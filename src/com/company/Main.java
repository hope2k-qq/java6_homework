package com.company;

import com.company.street.interfacestreet.enumstreet.buildings.hospital.Hospital;
import com.company.street.interfacestreet.enumstreet.buildings.house.House;
import com.company.street.interfacestreet.enumstreet.buildings.school.School;
import com.company.street.interfacestreet.enumstreet.buildings.store.Store;
import com.company.street.interfacestreet.enumstreet.streetElementType;
import com.company.street.interfacestreet.streetElement;
import com.company.street.streets.Street;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Street street = new Street("Main street");

        Random random = new Random();
        int count = random.nextInt(7) + 3;

        for (int i = 0; i < count; i++) {
            streetElement randomElement = generateRandomStreetElement(street.getName());
            street.addElement(randomElement);
        }

        street.showData();
    }

    private static streetElement generateRandomStreetElement(String streetName) {
        Random random = new Random();
        streetElementType[] streetElementTypes = streetElementType.values();
        streetElementType randomType = streetElementTypes[random.nextInt(streetElementTypes.length)];

        switch (randomType) {
            case HOUSE:
                House house = new House();
                house.randomStreetElement(streetName);
                return house;
            case STORE:
                Store store = new Store();
                store.randomStreetElement(streetName);
                return store;
            case HOSPITAL:
                Hospital hospital = new Hospital();
                hospital.randomStreetElement(streetName);
                return hospital;
            case SCHOOL:
                School school = new School();
                school.randomStreetElement(streetName);
                return school;
            default:
                throw new IllegalArgumentException("Error!");
        }
    }
}
