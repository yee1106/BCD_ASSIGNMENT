package model;

import java.io.Serializable;

public class ShippingDetail implements Serializable {
    private String actor;
    private String personInCharge;
    private String storingTemperature;
    private String inventoryCenter;
    private String from;
    private String to;
    private String status;
    private String date;
    private String isDelivered;
    private String digitalSignature;

    public ShippingDetail() {
    }

    public ShippingDetail(String actor, String personInCharge, String storingTemperature, String inventoryCenter, String from, String to, String status, String date, String isDelivered) {
        this.actor = actor;
        this.personInCharge = personInCharge;
        this.storingTemperature = storingTemperature;
        this.inventoryCenter = inventoryCenter;
        this.from = from;
        this.to = to;
        this.status = status;
        this.date = date;
        this.isDelivered = isDelivered;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStoringTemperature() {
        return storingTemperature;
    }

    public void setStoringTemperature(String storingTemperature) {
        this.storingTemperature = storingTemperature;
    }

    public String getInventoryCenter() {
        return inventoryCenter;
    }

    public void setInventoryCenter(String inventoryCenter) {
        this.inventoryCenter = inventoryCenter;
    }

    public String getIsDelivered() {
        return isDelivered;
    }

    public void setIsDelivered(String isDelivered) {
        this.isDelivered = isDelivered;
    }

    public String getDigitalSignature() {
        return digitalSignature;
    }

    public void setDigitalSignature(String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    @Override
    public String toString() {
        return "ShippingDetail{" +
                "actor='" + actor + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", storingTemperature='" + storingTemperature + '\'' +
                ", inventoryCenter='" + inventoryCenter + '\'' +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", status='" + status + '\'' +
                ", date='" + date + '\'' +
                ", isDelivered='" + isDelivered + '\'' +
                ", digitalSignature='" + digitalSignature + '\'' +
                '}';
    }

    public String statusTrackToString(){
        return "" + "Actor = " + actor + "\n" +
                "Person In Charge = " + personInCharge + "\n" +
                "Storing Temperature = " + storingTemperature + "\n" +
                "Inventory Center = " + inventoryCenter + "\n" +
                "From = " + from + "\n" +
                "To = " + to + "\n" +
                "Status = " + status + "\n" +
                "Date = " + date + "\n" +
                "Is Delivered = " + isDelivered + "\n" +
                "Digital Signature = " + digitalSignature + "\n";
    }



}
