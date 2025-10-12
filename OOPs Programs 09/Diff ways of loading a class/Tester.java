class Person 

{   
     String name;
     int age;
   
    Person(){
		
         this("Und", 18);
         System.out.println("Super Class NPC\t:"+this);
     } 

    Person(String name, int age) {
      this.name = name;
      this.age = age;	
      System.out.println("Super Class 2PC\t:"+this); 

      System.out.println(); 
      System.out.println("Super Class \t: "+name); 
      System.out.println("Super Class \t: "+age); 
    }
}


class Student extends Person
{
    int id;
    String course;
     
    Student(){
        
		this("Undefined",11,0,"Not Disclosed");
        System.out.println("Sub Class NPC\t:"+this);
        
    }

    Student(String name, int age,int id, String course){
        super(name,age);
		 this.id = id;
         this.course = course;
         System.out.println("Sub Class 2PC\t:"+this);
          System.out.println();
          System.out.println("SS name\t: " +name);
		  System.out.println("SS age\t: " + age);
        
    }


     public void display(){
		  System.out.println("id\t: " +id);
		  System.out.println("name\t: " +name);
		  System.out.println("age\t: " + age);
		  System.out.println("course\t: " +course);
     }
}


class Tester
{
    public static void main(String [] args){
		 Student s1 = new Student();
         s1.display();
     
      
        System.out.println();
        Student s2 = new Student("Srikar",23, 101, "CJ");
         s2.display();
    }
}