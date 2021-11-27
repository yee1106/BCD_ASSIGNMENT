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
        StringBuilder builder = new StringBuilder("");
        builder.append("Actor = ").append(actor).append("\n");
        builder.append("Person In Charge = ").append(personInCharge).append("\n");
        builder.append("Storing Temperature = ").append(storingTemperature).append("\n");
        builder.append("Inventory Center = ").append(inventoryCenter).append("\n");
        builder.append("From = ").append(from).append("\n");
        builder.append("To = ").append(to).append("\n");
        builder.append("Status = ").append(status).append("\n");
        builder.append("Date = ").append(date).append("\n");
        builder.append("Is Delivered = ").append(isDelivered).append("\n");
        builder.append("Digital Signature = ").append(digitalSignature).append("\n");
        return builder.toString();
    }



}
