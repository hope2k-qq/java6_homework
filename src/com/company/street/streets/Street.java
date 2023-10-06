package com.company.street.streets;

import com.company.street.interfacestreet.streetElement;

import java.util.ArrayList;
import java.util.List;

public class Street {
    private String name;
    private List<streetElement> streetElements;

    public Street(){
        name = "";
        streetElements = new ArrayList<streetElement>();
    }

    public Street(String name) {
        this.name = name;
        this.streetElements = new ArrayList<streetElement>();
    }

    public void addElement(streetElement streetElement) {
        streetElements.add(streetElement);
    }

    public void showData(){
        System.out.println("Street " + name + " contains the following elements:\n");
        for (streetElement streetelement : streetElements) {
            streetelement.showData();
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<streetElement> getStreetElements() {
        return streetElements;
    }

    public void setStreetElements(List<streetElement> streetElements) {
        this.streetElements = streetElements;
    }
}
