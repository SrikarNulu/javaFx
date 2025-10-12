class Student 
{
	int id;
    String name;
    int age;
	String course;
    double fee;
}

class College
{
    void studentHK(){
		Student s1 = new Student();
        s1.id =1;
        s1.name = "HK";
        s1.age = 23;
        s1.course = "java";
        s1.fee = 3500;

      System.out.println(s1.id);
      System.out.println(s1.name);
      System.out.println(s1.age);
      System.out.println(s1.course);
      System.out.println(s1.fee);
      
    } 

     int studentBK(){
		Student s2 = new Student();
        s2.id =2;
        s2.name = "BK";
        s2.age = 23;
        s2.course = "python";
        s2.fee = 2500;

       return 0;
     }
    
}

class Test001
{
   public static void main(String [] args){
	 College c1 = new College();
     c1.studentBK();
   }
}
