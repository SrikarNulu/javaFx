class PartyOrganizer 
{
	public static void main(String[] args) 
	{
		  Student s1 = new Student(1,"CJ",3500, "Srikar Nulu", 23,163,62);
          System.out.println(s1);

         Party p1 = new Party();
          p1.eat(s1);

       s1.learn();
       s1.eat();

       s1.sleep();
        s1.listen();
        s1.go();
        s1.pay();
     
	}
}
