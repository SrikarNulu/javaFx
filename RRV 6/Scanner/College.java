import java.util.Scanner;
class College
{  
    public static void main(String[] args) 
	{	
  /* int sno;
  String sname;
  double fee;
  String email;
  Long mobile;
  String gender;
  boolean studyCompleted; */
        Scanner sc = new Scanner(System.in);
       	Student s1 = new Student();
        System.out.print("Enter sno\t:");
        s1.sno = sc.nextInt(); 
        sc.nextLine();
        System.out.print("Enter sname\t:");
        s1.sname = sc.nextLine(); 
        System.out.print("Enter fee\t:");
        s1.fee = sc.nextDouble(); 
         sc.nextLine();
        System.out.print("Enter email\t:");
        s1.email = sc.next(); 
          sc.nextLine();
        System.out.print("Enter mobile\t:");
        s1.mobile = sc.nextLong(); 
         sc.nextLine();
        System.out.print("Enter gender\t:");
        s1.gender = sc.next(); 
         sc.nextLine();
        System.out.print("Enter studyCompleted\t:");
        s1.studyCompleted = sc.nextBoolean();
         sc.nextLine();
 
   System.out.println(s1.sno); 
   System.out.println(s1.sname); 
   System.out.println(s1.fee); 
   System.out.println(s1.email); 
   System.out.println(s1.mobile); 
   System.out.println(s1.gender); 
   System.out.println(s1.studyCompleted); 

	}
}
