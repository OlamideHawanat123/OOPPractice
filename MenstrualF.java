import java.util.Scanner;
public class MenstrualF{
public static void main(String...args){

MenstrualApp input = new MenstrualApp();
Scanner scanner = new Scanner(System.in);

System.out.print("When is your period");
String date = scanner.nextLine();
input.setStartDate(date);

System.out.print("Your cycle:");
int cycle = scanner.nextInt();
input.setCycle(cycle);

System.out.print(input.nextFlowDate());

}
}

