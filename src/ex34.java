import java.util.Scanner;

public class ex34 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in); // scanner statement

		String s1, s2, s3; // variables statement
		int x;
		
		// sc.nextLine() to read until the next line break
		x = sc.nextInt();
		sc.nextLine(); // consumes the pending line break
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();

		// testing
		System.out.println("DADOS DIGITADOS:");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);

		sc.close();
	}

}
