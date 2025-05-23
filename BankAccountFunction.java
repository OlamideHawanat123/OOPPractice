public class BankAccountFunction{

public static void main(String...args){
BankAccount input = new BankAccount();

java.util.Scanner scanner = new java.util.Scanner(System.in);

System.out.println("Initial name is: " + input.getName());

System.out.println("What is your name: ");
String name = scanner.nextLine();
input.setName(name);

System.out.println("Final name is: " + input.getName());

System.out.println("Initial balance is: " + input.getBalance());

System.out.println("How much is your balance: ");
double balance = scanner.nextInt();
input.setBalance(balance);

System.out.println("Your balance is: " + input.getDeposit());

System.out.println("How much is your deposit: ");
double deposit = scanner.nextInt();
input.setDeposit(deposit);
System.out.print("Your new balance is: " + input.getDeposit());
}
}










