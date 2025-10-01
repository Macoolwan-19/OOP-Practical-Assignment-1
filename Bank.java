import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

abstract class Bank{
    String account_name;
    Double Balance;

    abstract public void deposit();
     abstract public void withdraw();
      abstract public double getbalance();

      public Bank(String account_name){
        this.account_name = account_name;
        this.Balance = 0.0;
      }

       protected void record_to_file(String transaction_id){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter("bankdetails.txt",true))){
            writer.write(account_name +  ":" + transaction_id + "new balance" + Balance);
            writer.newLine();
        }catch(IOException e){
            System.out.println("an error occured during writing"+e.getMessage());
        }
    }

}