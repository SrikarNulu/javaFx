



class  College
{
	public static void main(String[] args) 
	{
		Student s1= new Student();
        
        s1.id      = 101;
        s1.name    = "HK";
        s1.course  = "Core Java";
        s1.fee     = 3500;

        System.out.println("\nStudent Details\n");
        System.out.println("sno\t: "+s1.id);
        System.out.println("sname\t: "+s1.name);
        System.out.println("scourse\t: "+s1.course);
        System.out.println("sfee\t: "+s1.fee);
       
	}
}
