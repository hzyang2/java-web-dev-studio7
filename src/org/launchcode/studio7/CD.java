package org.launchcode.studio7;

import java.util.ArrayList;

public class CD extends BaseDisc implements OpticalDisc {

    // TODO: Implement your custom interface.
    public CD(String name, Double capacity, ArrayList<String> contents, String discType){
        super(name, capacity, contents, discType);
    }

    public void spinDisc() {
    }

    public void writeDisc(String data) {
    }

    public String readData() {
        return null;
    }

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
