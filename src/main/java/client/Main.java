package client;

import client.view.Add_Order;
import client.view.Clinic_Healthcare_UI;
import model.User;
import client.view.Login;
import client.view.Manufacturer_HomePage;
import client.view.Patient_Appointment_Info;
import client.view.Patient_Track;
import client.view.Patient_View;
import client.view.Register;
import client.view.Track_View;
import client.view.Update_Production_Status;
import java.util.ArrayList;
import java.util.HashMap;
import model.Patient;
import util.Blockchain;

public class Main {
    
    public static HashMap<String, String> userList = new HashMap();
    public static ArrayList<Patient> patient_info = new ArrayList();
    public static Login login;
    public static Register register;
    public static User current_user;
    public static Track_View track_view = new Track_View();
    public static Clinic_Healthcare_UI clinic_healthcare;
    public static Add_Order addOrderPage = new Add_Order();
    public static Manufacturer_HomePage manufacturerHomePage;
    public static Update_Production_Status update_production_status;
    public static Patient_View patient_view;
    public static Patient_Appointment_Info patient_appointment_info;
    public static Patient_Track patient_track;
    public static String PATIENT = "Patient";
    public static String MANUFACTURER = "Manufacturer";
    public static String DISTRIBUTION = "Distribution";
    public static String CLINIC_HEALTHCARE = "Clinic / Healthcare";
//    public static HashMap<String, String> userList = new HashMap();
    
    public static void main(String[] args) {

      Blockchain.get();
      register = new Register();
      login = new Login();
      login.setVisible(true);
      
//      if(CLINIC_HEALTHCARE.equals(current_user.getRole())){
//        clinic_healthcare = new Clinic_Healthcare_UI();
//        clinic_healthcare.setVisible(true);
//      }   
    }
}
