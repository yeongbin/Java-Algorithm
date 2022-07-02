import java.util.Scanner;
public class Q6 {
	Scanner scan = new Scanner(System.in);
	public void repeat(){
		System.out.println("nÀÇ °ª:");
		int n = scan.nextInt();
		int i=1;
		while(n>=i)
		{
			i++;
		}
		System.out.println("n = "+n);
		System.out.println("i = "+i);
	}
}
