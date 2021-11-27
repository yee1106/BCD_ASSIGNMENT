/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.io.Serializable;
import java.util.HashMap;

/**
 *
 * @author acer
 */
public class PatientVaccinated implements Serializable{
  
  HashMap<String, String> patient_vaccinated_list = new HashMap<>();

  public PatientVaccinated() {
  }
  
  public void setPatient_vaccinated_list(HashMap<String, String> patient_vaccinated_list) {
    this.patient_vaccinated_list = patient_vaccinated_list;
  }

  public HashMap<String, String> getPatient_vaccinated_list() {
    return patient_vaccinated_list;
  }
}
