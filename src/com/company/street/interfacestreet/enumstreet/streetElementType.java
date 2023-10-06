package com.company.street.interfacestreet.enumstreet;

public enum streetElementType {
    HOUSE("House"),
    STORE("Store"),
    HOSPITAL("Hospital"),
    SCHOOL("School");

    private String type;

    streetElementType(String type) {
        this.type = type;
    }

    public String getType(){
        return type;
    }
}
