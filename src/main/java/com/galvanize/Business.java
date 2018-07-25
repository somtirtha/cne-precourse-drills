package com.galvanize;

import java.util.ArrayList;
import java.util.List;

public class Business implements Addressable{
    private final String name;
    private final ArrayList<Address> addresses;

    public Business(String name) {
        this.name = name;
        this.addresses = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void addAddress(Address address) {
        this.addresses.add(address);
    }

    public ArrayList<Address> getAddresses() {
        return addresses;
    }


}
