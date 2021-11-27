package model;

import java.io.Serializable;

public class ConfirmShipping implements Serializable {

    private String actor;
    private String personInCharge;
    private String orderDate;
    private long orderBatchID;
    private String storingTemperature;
    private String shipmentDate;
    private String shipmentMethod;
    private String estimatedReceivedDate;
    private String status;
    private String message;
    private String date;
    private String digitalSignature;

    public ConfirmShipping(){}

    public ConfirmShipping(String actor,String personInCharge, String orderDate, long orderBatchID, String storingTemperature, String shipmentDate, String shipmentMethod, String estimatedReceivedDate, String status, String message, String date) {
        this.actor = actor;
        this.personInCharge = personInCharge;
        this.orderDate = orderDate;
        this.orderBatchID = orderBatchID;
        this.storingTemperature = storingTemperature;
        this.shipmentDate = shipmentDate;
        this.shipmentMethod = shipmentMethod;
        this.estimatedReceivedDate = estimatedReceivedDate;
        this.status = status;
        this.message = message;
        this.date = date;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public long getOrderBatchID() {
        return orderBatchID;
    }

    public void setOrderBatchID(long  orderBatchID) {
        this.orderBatchID = orderBatchID;
    }

    public String getShipmentDate() {
        return shipmentDate;
    }

    public void setShipmentDate(String shipmentDate) {
        this.shipmentDate = shipmentDate;
    }

    public String getShipmentMethod() {
        return shipmentMethod;
    }

    public void setShipmentMethod(String shipmentMethod) {
        this.shipmentMethod = shipmentMethod;
    }

    public String getEstimatedReceivedDate() {
        return estimatedReceivedDate;
    }

    public void setEstimatedReceivedDate(String estimatedReceivedDate) {
        this.estimatedReceivedDate = estimatedReceivedDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDigitalSignature() {
        return digitalSignature;
    }

    public void setDigitalSignature(String digitalSignature) {
        this.digitalSignature = digitalSignature;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
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

    public String getPersonInCharge() {
        return personInCharge;
    }

    public void setPersonInCharge(String personInCharge) {
        this.personInCharge = personInCharge;
    }

    public String statusTrackToString(){
        String status = "Status = " + this.status + "\n" +
                "Message = " + message + "\n" +
                "Date = " + date + "\n" +
                "Actor = " + actor + "\n" +
                "Person In Charge = " + personInCharge + "\n" +
                "Storing Temperature = " + storingTemperature + "\n" +
                "Shipment Date = " + shipmentDate + "\n" +
                "Shipment Method = " + shipmentMethod + "\n" +
                "Estimated Received Date = " + estimatedReceivedDate + "\n" +
                "Digital Signature = " + digitalSignature + "\n";

        return status;
    }

    @Override
    public String toString() {
        return "ConfirmShipping{" +
                "actor='" + actor + '\'' +
                ", personInCharge='" + personInCharge + '\'' +
                ", orderDate='" + orderDate + '\'' +
                ", orderBatchID=" + orderBatchID +
                ", storingTemperature='" + storingTemperature + '\'' +
                ", shipmentDate='" + shipmentDate + '\'' +
                ", shipmentMethod='" + shipmentMethod + '\'' +
                ", estimatedReceivedDate='" + estimatedReceivedDate + '\'' +
                ", status='" + status + '\'' +
                ", message='" + message + '\'' +
                ", date='" + date + '\'' +
                ", digitalSignature='" + digitalSignature + '\'' +
                '}';
    }
}
