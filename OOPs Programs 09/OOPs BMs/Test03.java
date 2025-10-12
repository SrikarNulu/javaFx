class Employee
{
	private int eno;
    private String ename;
    private double salary;
    private String department;
    
   void setEno(int eno){
	   this.eno  =  eno;
   }

   int getEno(){
	   return eno;
   }
   
   void setEname(String ename){
	   this.ename  =  ename;
   } 
  
   String getEname(){
	   return ename;
   }
    
    
   void setsalary(double salary){
	   this.salary =  salary;
   }

   double getsalary(){
	   return salary;
   }
   
   void setdepartment(String department){
	   this.department  =  department;
   }

   String getdepartment(){
	   return department;
   }

   void display(){
	  System.out.println(eno + "\n" +  ename  + "\n" + salary + "\n" + department);
   }
  
   void increaseSalary(){
	   salary = (20 * salary)/100 + salary;
      System.out.println("Your salary after promotion: \t" + salary);
   }
}


class Test03
{
  public static void main (String [] args){
   Employee e1 = new Employee(); 
// Before updating values of emplyee e1
   e1.display();
   e1.setEno(226);
   e1.setEname("Srikar Nulu");
   
   e1.setsalary(25000);
   e1.setdepartment("Java");

   System.out.println("===========");
   e1.display();


   e1.increaseSalary();
  }
}


