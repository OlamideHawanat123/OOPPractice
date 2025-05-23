public class BankAccount{
private String name;
private double balance;
private double deposit;

public BankAccount(String name, double balance){
this.name = name;

if(balance < 0.0){
this.balance = balance;
}

public void setName(String name){
this.name = name;
}

public String getName(){
return name;
}

public void setBalance(double balance){
this.balance = balance;
}

public double getBalance(){
return balance;
}

public void setDeposit(double deposit){
if(deposit > 0.0){

balance += deposit;
}

public double getDeposit(){
return deposit + balance;
}

}



