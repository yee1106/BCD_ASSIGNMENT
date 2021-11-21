package client;

import client.view.Add_Order;
import client.view.Clinic_Healthcare_UI;
import model.User;
import client.view.Login;
import client.view.Register;
import client.view.Track_View;
import java.util.HashMap;
import util.Blockchain;

public class Main {
    
    public static HashMap<String, String> userList = new HashMap();
    public static Login login;
    public static Register register;
    public static User current_user;
    public static Track_View track_view = new Track_View();
    public static Clinic_Healthcare_UI clinic_healthcare;
    public static Add_Order addOrderPage = new Add_Order();
    public static String VACINATOR = "Vacinator";
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
