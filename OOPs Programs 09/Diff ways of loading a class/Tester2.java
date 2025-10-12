

class Parent 
{
    String name;
    int age;
   
    Parent(){
		 this("UnDefined",0);
    }

    Parent(String name, int age){
		 this.name = name;
          this.age = age;
    } 
 
}


class Child extends Parent
{
    int id;
    double sal; 
   
    Child(){
		  this(0,"NAN",18,0);
    }
 
    Child(int id,String name, int age, double sal){
         super(name, age);
		 this.id = id;  
         this.sal = sal;
    }

    public String toString(){
		  return id +"  " + name+ "  "+ age+ "  " +sal; 
    }
}



class  Tester2
{
	public static void main(String[] args) 
	{
		Child c1 = new Child();
   
        System.out.println(c1);

  
       Child c2 = new Child(1,"SK",23, 50000);
   
        System.out.println(c2);

        
        
	}
}
