package com.example.wheredoyoulive;

public class Property {

    String sName;
    String sAddress;
    String sDescription;
    String sBeds;
    String sBathrooms;
    String sSqrFoot;
    String sPropertyType;

    public Property(String sName, String sAddress, String sDescription, String sBeds, String sBathrooms, String sSqrFoot, String sPropertyType) {
        this.sName = sName;
        this.sAddress = sAddress;
        this.sDescription = sDescription;
        this.sBeds = sBeds;
        this.sBathrooms = sBathrooms;
        this.sSqrFoot = sSqrFoot;
        this.sPropertyType = sPropertyType;
    }

    public String getsName() {
        return sName;
    }

    public String getsAddress() {
        return sAddress;
    }

    public String getsDescription() {
        return sDescription;
    }

    public String getsBeds() {
        return sBeds;
    }

    public String getsBathrooms() {
        return sBathrooms;
    }

    public String getsSqrFoot() {
        return sSqrFoot;
    }

    public String getsPropertyType() {
        return sPropertyType;
    }

    public void setsName(String sName) {
        this.sName = sName;
    }

    public void setsAddress(String sAddress) {
        this.sAddress = sAddress;
    }

    public void setsDescription(String sDescription) {
        this.sDescription = sDescription;
    }

    public void setsBeds(String sBeds) {
        this.sBeds = sBeds;
    }

    public void setsBathrooms(String sBathrooms) {
        this.sBathrooms = sBathrooms;
    }

    public void setsSqrFoot(String sSqrFoot) {
        this.sSqrFoot = sSqrFoot;
    }

    public void setsPropertyType(String sPropertyType) {
        this.sPropertyType = sPropertyType;
    }
}
