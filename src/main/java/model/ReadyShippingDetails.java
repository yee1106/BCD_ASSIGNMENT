/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;

/**
 *
 * @author acer
 */
public class ReadyShippingDetails implements Serializable{

  private String examiner;
  private String productionDate;
  private String storingTemperature;
  private String address;
  private String from;    
  private String to;
  private String status;   
  private String date;    
  private String digital_signature;
  
  public ReadyShippingDetails() {
  }
  
  public ReadyShippingDetails(String examiner, String productionDate, String storingTemperature, String address, String from, String to, String status, String date) {
    this.examiner = examiner;
    this.productionDate = productionDate;
    this.storingTemperature = storingTemperature;
    this.address = address;
    this.from = from;
    this.to = to;
    this.status = status;
    this.date = date;
  }
  
  public String getExaminer() {
    return examiner;
  }

  public void setExaminer(String examiner) {
    this.examiner = examiner;
  }

  public String getProductionDate() {
    return productionDate;
  }

  public void setProductionDate(String productionDate) {
    this.productionDate = productionDate;
  }

  public String getStoringTemperature() {
    return storingTemperature;
  }

  public void setStoringTemperature(String storingTemperature) {
    this.storingTemperature = storingTemperature;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
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

  public String getDigital_signature() {
    return digital_signature;
  }

  public void setDigital_signature(String digital_signature) {
    this.digital_signature = digital_signature;
  }
  
    @Override
  public String toString() {
    return "ReadyShippingDetails{" + "examiner=" + examiner + ", productionDate=" + productionDate + ", storingTemperature=" + storingTemperature + ", address=" + address + ", from=" + from + ", to=" + to + ", status=" + status + ", date=" + date + '}';
  }
  
  public String readyShippingStepTrackToString(){
    return "Status = " + status +"\nExaminer = " + examiner + "\nProduction Date = " + productionDate + "\nStrong Temperature = " + storingTemperature + " degree" + "\nManufacturory Address = " + address + "\nManufacturer = " + from + "\nDistibution = " + to + "\nUpdate Date = " + date + "\nDigital Signature = " + digital_signature + "\n";
  }

  public String shippingOrderInfo(){

    return "" + "Examiner = " + examiner + "\n" +
            "Production Date = " + productionDate + "\n" +
            "Storing temperature = " + storingTemperature + "\n" +
            "Manufacturer Address = " + address + "\n" +
            "Status = " + status + "\n";
  }
  
}
