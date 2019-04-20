import java.util.Scanner;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int second_digit = (n%100)/10;
      System.out.println(second_digit);// Type your code here
	}
}