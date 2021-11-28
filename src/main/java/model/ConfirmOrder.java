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
public class ConfirmOrder implements Serializable{
  
  private String actor;    // who accept / reject order
  private String status;   // Approved order || Rejected order
  private String messages; // Order accepted. Preparing the vaccine. || (writing some messages for reject the order). 
  private String date;
  private String digital_signature;
  
  public ConfirmOrder() {
  }

  public ConfirmOrder(String actor, String status, String messages, String date) {
    this.actor = actor;
    this.status = status;
    this.messages = messages;
    this.date = date;
  }
  
  public String getActor() {
    return actor;
  }

  public void setActor(String actor) {
    this.actor = actor;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getMessages() {
    return messages;
  }

  public void setMessages(String messages) {
    this.messages = messages;
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
    return "ComfirmOrder{" + "actor=" + actor + ", status=" + status + ", messages=" + messages + ", date=" + date + '}';
  }
  
  public String statusTrackToString(){
    return "Status = " + status +"\nFrom Actor = " + actor + "\nDate = " + date + "\nMessage = " + messages + "\nDigital Signature = " + digital_signature + "\n";
  }
  
}
