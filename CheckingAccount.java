import 

public class CheckingAccount implements HasMenu, Serializable{

  double balance;

  public static void main(String

  public CheckingAccount(){
    this.balance = 0d;
  } // end constructor

  public CheckingAccount(doublebalance){
    this.balance = balance;
  } // end constructor

  public String menu(){
    Scanner input = new Scanner(System.in);
    System.out.println("0: Quit");
    System.out.println("1: Check Balance");
    System.out.println("2: Make a Deposit");
    System.out.println("3: Make a Withdrawal");


    return response;
  } // end menu

  public void start(){
    boolean keepGoing = true;
    String response;
    while(keepGoing){
      response = menu();
      if (response.equals("0")){
        keepGoing = false;
      else if (response.equals("1")){
	
  } // end start

  public String getBalanceString(){
    String result = String.format($%.02f", this.balance);
    return result;
  } // end getBalanceString

  private double getDouble(){
    Scanner input = new Scanner(System.in);
    String sResult = input.nextLine();
    double result = 0d;
    try {
      result = Double.parseDouble(sResult);
    } catch (Exception e){
      System.out.println("not a legal input. Changing to 0");
      result = 0d;
    } // end try
    return result;
  } // end getDouble

  public void makeDeposit(){
    System.out.print("How much to deposit? ");
    double deposit = this.getDouble();

  
