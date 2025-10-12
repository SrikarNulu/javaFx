class Company 
{
	public static void main(String[] args) 
	{
		//System.out.println("Hello World!");
        Employee emp1 = new Employee();
        Employee emp2 = new Employee();
        
        emp1.id =101;
        emp1.name ="Srikar Nulu";
        emp1.role ="Java Developer";
        emp1.salary =25000;

        emp2.id =102;
        emp2.name ="Bala Sai";
        emp2.role =".Net Developer";
        emp2.salary =24000;
        
        System.out.println("\nemp1 object values");
        System.out.println("emp1.id\t\t: "+emp1.id);
        System.out.println("emp1.name\t: "+emp1.name);
        System.out.println("emp1.role\t: "+emp1.role);
        System.out.println("emp1.salary\t: "+emp1.salary);
        System.out.println("\nemp2 object values");
        System.out.println("emp2.id\t\t: "+emp2.id);
        System.out.println("emp2.name\t: "+emp2.name);
        System.out.println("emp2.role\t: "+emp2.role);
        System.out.println("emp2.salary\t: "+emp2.salary);
        
	}
}
