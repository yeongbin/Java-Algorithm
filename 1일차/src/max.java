import java.util.Scanner;

public class max {
	public void max()
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("���� �� ����");
		System.out.print("a: ");
		int a = scan.nextInt();
		System.out.print("b: ");
		int b = scan.nextInt();
		System.out.print("c: ");
		int c = scan.nextInt();
		int max = a;
		if (max<b)
		{
			max=b;
		}
		if(max<c)
		{
			max=c;
		}
		System.out.println("�ִ밪�� :"+max);
	}
}
