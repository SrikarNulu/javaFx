// student class

class StudentData  
{ 
  private int rollNo;
  private String name;
  
  private double tm,hm,em,mm,sim,som;
 /* private double hm;
  private double em;
  private double mm;
  private double sim;
  private double som; */

  
  void studentNameRoll(String name, int rollNo){
	this.rollNo = rollNo;
	this.name = name;
  }
 
  void studentMarks(double tm, double hm,double em,double mm,double sim,double som){
	 this.tm=tm;
	 this.hm=hm;
	 this.em=em;
	 this.mm=mm;
	 this.sim=sim;
	 this.som=som;
  }

  
  void displayStudentData(){
	System.out.println("Student rollNo: "+ rollNo + " and studentName: " + name);
  }

  void displayStudentMarks(){
	System.out.println(rollNo);
	System.out.println(name);
	System.out.println(tm);
	System.out.println(hm);
	System.out.println(em);
	System.out.println(mm);
	System.out.println(sim);
	System.out.println(som);
  }

  void displayTotalMarks(){
	double totalMarks = tm + em +hm + mm + sim + som ;
    System.out.println(totalMarks);
  }
  
	
}

// Univaersity class

class University
{
   private String name;
   private String city;
 
   int index = 0;
   
   StudentData[] students = new StudentData[5];
   
   void setNameCity(String name, String city){
        this.name = name;
        this.city = city;
		System.out.println(this.name + " " + this.city);
   }

   void applyForExam(StudentData s){
	   students[index++] = s;

     System.out.println(s.name + " Application Accepted.");
   }

   void display(){
	  System.out.println(name);
	  System.out.println(city);
	  System.out.println(java.util.Arrays.toString(students));
   }
}

   

//test class

class Test02
{ 
   public static void main(String [] args){
 /* StudentData sd1 = new StudentData();
  sd1.studentNameRoll(22351206,"Srikar Nulu");
  sd1.studentMarks(98,92,94,99,88,95);
  
 // sd1.displayStudentData();
  sd1.displayStudentMarks();
  sd1.displayTotalMarks(); */

  University u = new University();
  
    StudentData s1 = new StudentData();
    s1.studentNameRoll("Srikar",1);
    s1.studentMarks(95,95,95,96,93,99);
  
  
    s1.displayStudentData();
    s1.displayStudentMarks();

   u.applyForExam(s1);
    u.display();

  }
}
