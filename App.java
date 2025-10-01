import java.awt.SystemTray;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;


public class App {
    public static void main(String[] args){

        Account tesAccount = new Account("");
        Account kevin_mutenga = new Account("");
         Account Tinashe_tigere = new Account("");
        test_account dope = new test_account("null");


      
        tesAccount.getbalance();
        tesAccount.deposit(300.0);
        tesAccount.withdraw(15.0);

        kevin_mutenga.deposit(30000);
        kevin_mutenga.withdraw(20);
        kevin_mutenga.getbalance();

         Tinashe_tigere.deposit(30000);
        Tinashe_tigere.withdraw(50);
        Tinashe_tigere.getbalance();

         dope.deposit(10);
        dope.withdraw(2);
        dope.getbalance();


        System.out.println(" initial "+tesAccount.getbalance());
         System.out.println(" initial "+kevin_mutenga.getbalance());
          System.out.println(" initial "+Tinashe_tigere.getbalance());
          System.out.println(" initial "+dope.getbalance());
    




    



    }

}
