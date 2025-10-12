interface bike
{
    void drive();
    void breaks();
    void stop();
}

interface car
{
   void drive();
   void breaks();
   void stop();
}


class Honda implements bike, car
{
  public void drive(){System.out.println("driving");}
  public void breaks(){System.out.println("breaking");}
  public void stop(){System.out.println("stopping");}
  
}



class  Tester003
{
	public static void main(String[] args) 
	{
		car h1 = new Honda();
        h1.drive();
	}
}
