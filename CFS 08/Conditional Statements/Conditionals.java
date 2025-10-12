import java.util.Scanner;
class Conditionals
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a day (mon/tue/wed/fri/thu/sat/sun):  ");
        String day = sc.next();
         
        switch(day){
			case "sun":
				System.out.println(1);
                break;
            case "mon":
				System.out.println(2);
                break;
           case "tue":
				System.out.println(3);
                break;
            case "wed":
				System.out.println(4);
                break;

            case "thu":
				System.out.println(5);
                break;
             case "fri":
				System.out.println(6);
                break;
            case "sat":
				System.out.println(7);
                break;
            default:
                System.out.println("You have entered wrong day/ not a day please check...");
        }
	}
}
