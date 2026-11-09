# CS121BankOnItPart1

## HasMenu (interface)

```
public String menu()

public void start()
```

## CheckingAccount (implements HasMenu)

```
double balance

public static void main(String[] args):
  create new CheckingAccount class
  run start

public CheckingAccount():
  set this.balance to 0d

public CheckingAccount(double balance):
  set this.balance to balance

public String menu():
  add new scanner
  print all menu options
  set response to an input
  return response

public void start():
  set keepGoing to true
  create a string called response
  while keepGoing is true:
    if reponse is 0:
      set keepGoing to false
    if response is 1:
      run checkBalance
    if response is 2:
      run makeDeposit
    if response is 3:
      run makeWithdrawal
    else:
      print "Select a valid number"

public double getBalance():
  return this.balance

public String getBalanceString():
  set result to a formatted string
  return result

public void setBalance():
  set this.balance to balance

private double getDouble():
  create new scanner
  set resultString to an input
  set double result to 0d
  try:
    set result to Double.parseDouble(resultString)
  catch:
    print "Not a legal input"
    set result to 0d
  return result

public void checkBalance():
  print Current balance
  print run getBalanceString
public void makeDeposit():
  print how much to deposit
  set double deposit to run getDouble
  if deposit < 0:
    print select a positive number
  else:
    set balance += deposit
  print new balance + run getBalanceString

public void makeWithdrawal:
  print how much to withdrawal?
  set double withdrawal to run getDouble
  if withdrawal < 0:
    print select a positive number
  if withdrawal > this.balance:
    print insufficient funds
  else:
    set this.balance -= withdrawal
  print new balance + run getBalanceString
```

## SavingsAccount (extends CheckingAccount)

```
double interestRate = 05d

public static void main(String[] args):
  create new SavingsAccount class
  run start

public void setInterestRate(double interestRate):
  set this.interestRate to interestRate

public double getInterestRate():
  return this.interestRate

public void calcInterest():
  set double interestAmount to this.balance * this.interestRate
  set this.balance += interestAmount
  print new balance + this.getBalanceString
```

## User (abstract, implements HasMenu)

```
set String userName = ""
set String PIN = ""

public void setUserName(String userName):
  set this.userName to userName

public String getUserName():
  return this.userName

public void setPIN(String PIN):
  if PIN is 4 numeric digits:
    set this.PIN to PIN
  else:
    print PIN must be 4 numeric digits
    print setting PIN to 0000
    set this.PIN to 0000

public void changePIN():
  create new scanner
  print "Please enter a new 4 digit PIN: "
  set response to user input
  run this.setPIN(response)

public String getPIN():
  return this.PIN

public boolean login(String userNameIn, String pinIn):
  set result to false
  if usernames match:
    if pins match:
      set result to true
  return result

public boolean login():
  create new scanner
  set result to false
  print username
  set userNameIn to user input
  if input = username:
    print pin
    set pinIn to user input
    if input = pin:
      print login successful
      result = true
    else:
      print incorrect pin
  else:
    print incorrect username
  return result

public abstract String getReport()
```

## Customer (extends User)

```
static final long serialVersionUID = 1L

CheckingAccount checking = new CheckingAccount()
SavingsAccount savings = new SavingsAccount()

public static void main(String[] args):
  create new customer
  if login is successful:
    run start

public Customer():
  set userName to Alice
  set PIN to 1111

public Customer(String userName, String PIN):
  set this.userName to userName
  set this.PIN to PIN

public String getReport():
  set report to "User: " + this.getUserName
  report += ", Checking: " + this.checking.getBalanceString
  report += ", Savings: " + this.savings.getBalanceString
  return report

public void start():
  set keepGoing to true
  create string named result
  while keepGoing is true:
    set result to menu()
    if result is 0:
      set keepGoing to false
    if result is 1:
      start checking account
    if result is 2:
      start savings account
    if result is 3:
      run changePIN
    else:
      print enter a 0-3

public String menu():
  new scanner
  print customer menu
  set result to user input
  return result
```
