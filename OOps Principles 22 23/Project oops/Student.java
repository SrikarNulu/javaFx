import java.util.Scanner;
class Student extends Person
{
    private static String college;
    private static int studentCounter;
    
    private int sno;
    private String course;
    private double fee; 
    
    static {
          System.out.println("Enter your college name: ");
		  college = new Scanner(System.in).nextLine();
    }

    {
		  studentCounter++;
    }

    Student (int sno, String course, double fee, String name, int age , int height, int weight){
		super(name, age, height, weight);
        this.sno = sno;
        this.course = course; 
        this.fee  = fee;
    } 
  
   
  public static void setCollege(String college){
	   Student.college = college;
  }
  
  public static String getCollege(){
	  return college;
  }
  

   public void setSno (int sno){
	    this.sno = sno;
   }  
   
   public int getSno (){
	   return sno;
   }
   
   public void setCourse (String course){
	    this.course = course;
   }  
   
   public String getCourse (){
	   return course;
   }

   public void setFee (int fee){
	    this.fee = fee;
   }  
   
   public double getFee (){
	   return fee;
   }
 
   
  void listen(){
	  System.out.println(getName() + " is listening" + course);
  }

  void go(){
	  System.out.println(getName() + " is going" + college );
  }

  void pay(){
	  System.out.println(getName() + " is paying" + fee);
  }
 
   
  @Override
  public String toString(){
	   return 
        super.toString() + "\n\n"+
        " Student Details \n"+
        " Name\t:" + getName() + "\n"+
        " Age\t:" + getAge() + "\n"+
        " sno\t:" + sno + "\n"+
        " course\t:" + course + "\n" +
        " fee\t" + fee +"\n";
  }
  
   public static void main(String [] ages){
	   Student s1 = new Student(1,"CJ",3500, "Srikar Nulu", 23,163,57);

     System.out.println(s1);
   }
}
