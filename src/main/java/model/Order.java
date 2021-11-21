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
public class Order implements Serializable{

  private long order_batch_id;
  private String vaccineType;
  private int quantity;
  private String from;
  private String to;
  private String status;
  private String date;
  private String digital_signature;
  
  public Order() {
  }
  
  public Order(long order_batch_id, String vaccineType, int quantity, String from, String to, String status, String date) {
    this.order_batch_id = order_batch_id;
    this.vaccineType = vaccineType;
    this.quantity = quantity;
    this.from = from;
    this.to = to;
    this.status = status;
    this.date = date;
  }
  
  public long getOrder_batch_id() {
    return order_batch_id;
  }

  public void setOrder_batch_id(long order_batch_id) {
    this.order_batch_id = order_batch_id;
  }

  public String getVaccineType() {
    return vaccineType;
  }

  public void setVaccineType(String vaccineType) {
    this.vaccineType = vaccineType;
  }

  public int getQuantity() {
    return quantity;
  }

  public void setQuantity(int quantity) {
    this.quantity = quantity;
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
    return "Order{" + "order_batch_id=" + order_batch_id + ", vaccineType=" + vaccineType + ", quantity=" + quantity + ", from=" + from + ", to=" + to + ", status=" + status + ", date=" + date + '}';
    }
  
  public String statusTrackToString() {
    return "Status = " + status +"\nFrom Actor = " + from + "\nTo = " + to + "\nDate = " + date+ "\nDigital Signature = " + digital_signature + "\n";
  }
  
  public String infoTrackToString() {
    return "order_batch_id = " + order_batch_id +"\nVaccineType = " + vaccineType + "\nQuantity = " + quantity + "\nManufacturer = " + to + "\n";
  }
  
  public String manufacturerInfoTrackToString() {
    return "order_batch_id = " + order_batch_id +"\nVaccineType = " + vaccineType + "\nQuantity = " + quantity + "\nClinic / Healthcare = " + from + "\n";
  }
  
}
