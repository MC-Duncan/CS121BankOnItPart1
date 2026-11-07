import java.util.*;
import java.io.*;

public class Customer extends User implements Serializable {
  static final long serialVersionUID= 1L;

  CheckingAccount checking = new CheckingAccount();
  SavingsAccount savings = new SavingsAccount();

  public static void main(String[] args){
    Customer c = new Customer();
    if (c.login()){
      c.start();
    } // end if
  } // end main

  public Customer(){
    this.userName = "Alice";
    this.PIN = "1111";
  } // end constructor

  public Customer(String userName, String PIN){
    this.userName = userName;
    this.PIN = PIN;
  } // end Customer

  public String getReport(){
    String report = "User: " + this.getUserName();
    report += ", Checking: " + this.checking.getBalanceString();
    report += ", Savings: " + this.savings.getBalanceString();
    return report;
  } // end getReport

  public void start(){
    boolean keepGoing = true;
    String result;
    while (keepGoing){
      result = menu();
      if (result.equals("0")){
        keepGoing = false;
      } else if (result.equals("1")){
        System.out.println("Checking account: ");
       	this.checking.start();
      } else if (result.equals("2")){
	System.out.println("Savings account: ");
	this.savings.start();
      } else if (result.equals("3")){
	System.out.println("Change PIN: ");
        // add direction
      } else {
	System.out.println("You should enter 0, 1, 2, or 3");
      } // end if
    } // end while
  } // end start

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println();
    System.out.println("Customer menu");
    System.out.println();
    System.out.println("0: Exit");
    System.out.println("1: Manage Checking");
    System.out.println("2: Manage Savings");
    System.out.println("3: Change PIN");
    System.out.println();
    System.out.print("Your action (0-3): ");
    String result = input.nextLine();
   
    return result;
  } // end menu

} // end class
