import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
      int n = in.nextInt();
      int first = n/10;
      int third = n%10;
      int sum = first + third;
      System.out.println(sum);// Type your code here
	}
}