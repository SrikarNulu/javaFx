class Student 
{
	 static int id;
     String name;
      int age;
    String course;
    double fee;

    Student(){
		// no-param constructor
    }

    Student(int id){
		this(id, null, 0,null,0.0);
    }

    Student(String name){
		this(0, name, 0,null,0.0);
    } 

    Student(int id, String name, int age){
		this(id, name, age,null,0.0);
    }

    Student(int id, String name, int age, String course){
		this(id, name, age,course,0.0);
    }
 
   Student(int id, String name, int age, String course, double fee){
		this.id= id;
        this.name = name;
        this.age = age;
        this.course = course;
        this.fee = fee;
    }

   
    public String toString(){
		 return "Student Details"+"ID: "+ id+ "\n"+"Name: " + name+ "\n"+ "Age: "+age+ "\n"+" Course: "+course +"\n" + "Fee: "+ fee;  
    }
   
}

class Tester
{
    public static void main (String args[]){
		 Student s1 = new Student();
         System.out.println(s1);

         Student s2 = new Student(1,"Srikar Nulu",23);
         System.out.println(s2);
    }
}