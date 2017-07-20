package player;
import java.util.Scanner;
public class PrinttheNumberinWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.out.println("Enter the Number:");
Scanner s=new Scanner(System.in);
int a=s.nextInt();
switch(a){
case 1:
	System.out.println("One");
	break;
case 2:
	System.out.println("Two");
	break;
case 3:
	System.out.println("Three");
	break;
case 4:
	System.out.println("Four");
	break;
case 5:
	System.out.println("Five");
	break;
case 6:
	System.out.println("Six");
	break;
	default:
		System.out.println("Null");
}
	}

}
