package client;

import classes.User;
import model.Login;
import model.Register;

public class Main {
    public static Register register;
    public static Login login;
    public static User current_user;
    public static void main(String[] args) {

      
      register = new Register();
      login = new Login();
      login.setVisible(true);

    }
}
