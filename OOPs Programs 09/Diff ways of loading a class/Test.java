class Student 
{
	private int id;
    private String name;
    private int age;
    private String course;
  
//constructor chaining
    Student(){
		 // non-parameterized constructor
    }
  
    Student(int id, String name, int age, String course){
		this.id = id;
        this.age = age;
        this.name = name;
        this.course = course;
    }
 
    Student(int id){
		this.id = id;
    }

    Student(int id, String name){
		this.id = id;     
        this.name = name;    
    }

    Student(int id, String name, int age){
		this.id = id;
        this.age = age;
        this.name = name;
    }


    public void setId (int id) { this.id = id;}
    public void setName (String name) { this.name = name;}
    public void setAge (int age) { this.age = age;}
    public void setCourse (String course) { this.course = course;}
    
    public int getId(){return id;}
    public String getName(){return name;}
    public int getAge(){return age;}
    public String getCourse(){return course;}

    @Override
    public String toString(){
		 return  "StudentId\t: "+ id + "\n" + 
                 "StudentName\t: "+ name + "\n" +
                 "StudentAge\t: "+ age + "\n" + 
                 "StudentCourse\t: "+ course + "\n" ;   
    }
}

class Test
{
    public static void main (String [] args){
		 Student s1 = new Student(1, "Srikar Nulu", 23, "Core Java");
         System.out.println(s1.toString());
    }
}

  