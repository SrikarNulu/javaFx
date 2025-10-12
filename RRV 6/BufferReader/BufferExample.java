import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

class Student
{
	int id;
	String name;
    int age;
}

class  BufferExample
{
	public static void main(String[] args) throws IOException
	{
		 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         Student s1= new Student();
         System.out.print("Enter id\t: ");
         s1.id = Integer.parseInt(br.readLine());   
         System.out.print("Enter name\t: ");
         s1.name = br.readLine();
         System.out.print("Enter age\t: ");
         s1.age = Integer.parseInt(br.readLine());
       
        System.out.println("id: "+s1.id + " name: " + s1.name +  " age: "+s1.age);
         

	}
}
