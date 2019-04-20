import java.util.Scanner;
class Main{
	public static void main (String[] args){
	   Scanner in = new Scanner(System.in);
      int n1 = in.nextInt();
      int n2 = in.nextInt();
      int n3 = in.nextInt();
      int result = greatest_of_2_numbers(n1,n2);
      System.out.println(greatest_of_2_numbers(result,n3));
    }
  public static int greatest_of_2_numbers(int n1,int n2)
  {
    int max_no = 0;
    if(n1 > n2)
    {
      max_no = n1;
    }
    else 
    {
      max_no = n2;
    }
    return max_no;// Type your code here
	}
}