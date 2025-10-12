class Example 
{
	int a;
    int b;

    void set(int x,int y){
		a=x;
        b=y;
    }

    void display(){
		System.out.println(a);
		System.out.println(b);
    }
}

class Test
{
  public static void main (String[] args){
	  Example e1 = new Example();
	  Example e2 = new Example();
      
      e1.set(10,30);
      e1.display();
      e1.set(12,24);
      e1.display();
  }
}


