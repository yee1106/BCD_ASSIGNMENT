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
public class Patient extends User implements Serializable{

  private String fullName;
  private String age;
  private String ic;
  private String contactNumber;
  private String gender;
  private String address;
  private String status;
  
  private String dateVaccination;
  private String typeOfVaccine;
  private long batch_id;
  private String facility;
  private String witnessName;
  private String digital_signature;
  
  public Patient() {
  }
  
  public Patient(String userName, String fullName, String age, String ic, String contactNumber, String gender, String address, String status, long batch_id) {
    super.setUserName(userName);
    this.fullName = fullName;
    this.age = age;
    this.ic = ic;
    this.contactNumber = contactNumber;
    this.gender = gender;
    this.address = address;
    this.status = status;
    this.batch_id = batch_id;
  }

  public Patient(String fullName, String age, String ic, String contactNumber, String gender, String address, String status, String dateVaccination, String typeOfVaccine, long batch_id, String facility, String witnessName) {
    this.fullName = fullName;
    this.age = age;
    this.ic = ic;
    this.contactNumber = contactNumber;
    this.gender = gender;
    this.address = address;
    this.status = status;
    this.dateVaccination = dateVaccination;
    this.typeOfVaccine = typeOfVaccine;
    this.batch_id = batch_id;
    this.facility = facility;
    this.witnessName = witnessName;
  }
  
  public String getFullName() {
    return fullName;
  }

  public void setFullName(String fullName) {
    this.fullName = fullName;
  }

  public String getAge() {
    return age;
  }

  public void setAge(String age) {
    this.age = age;
  }

  public String getIc() {
    return ic;
  }

  public void setIc(String ic) {
    this.ic = ic;
  }

  public String getContactNumber() {
    return contactNumber;
  }

  public void setContactNumber(String contactNumber) {
    this.contactNumber = contactNumber;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getAddress() {
    return address;
  }

  public void setAddress(String address) {
    this.address = address;
  }

  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public String getDateVaccination() {
    return dateVaccination;
  }

  public void setDateVaccination(String dateVaccination) {
    this.dateVaccination = dateVaccination;
  }

  public String getTypeOfVaccine() {
    return typeOfVaccine;
  }

  public void setTypeOfVaccine(String typeOfVaccine) {
    this.typeOfVaccine = typeOfVaccine;
  }

  public long getBatch_id() {
    return batch_id;
  }

  public void setBatch_id(long batch_id) {
    this.batch_id = batch_id;
  }

  public String getVaccinationFacility() {
    return facility;
  }

  public void setVaccinationFacility(String facility) {
    this.facility = facility;
  }

  public String getWitnessesName() {
    return witnessName;
  }

  public void setWitnessesName(String witnessName) {
    this.witnessName = witnessName;
  }

  public String getDigital_signature() {
    return digital_signature;
  }

  public void setDigital_signature(String digital_signature) {
    this.digital_signature = digital_signature;
  }
  
    @Override
  public String toString() {
    return "Patient{" + "fullName=" + fullName + ", age=" + age + ", ic=" + ic + ", contactNumber=" + contactNumber + ", gender=" + gender + ", address=" + address + ", status=" + status + ", batch_id=" + batch_id + '}';
  }
  
  public String infoTextAreaSetText(){
    return "Full Name = " + fullName +"\nAge = " + age + "\nGender = " + gender + "\nStatus = " + status + "\nIc/Passport = " + ic + "\nContactNumber = " + contactNumber + "\nAddress = " + address + "\n"; 
  }
  
  public String addTrackTextAreaSetText(){
    return "****Personal information****\nBatch ID = " + batch_id +"\nType of Vaccine = " + typeOfVaccine + "\nDate Vaccination = " + dateVaccination + "\nWitness Name = " + witnessName + "\nFacility = " + facility + "\nDigital Signature = " + digital_signature; 
  }

}