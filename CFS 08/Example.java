class Example {
    static Example e1 = new Example();
    static{
        System.out.println("SB start");
        Example e2 = new Example();
        System.out.println("SB end");
    }
    Example(){
        System.out.println("NPC start");
        Example e3 = new Example(5);
        System.out.println("NPC end");
    }
    Example(int x){
        System.out.println("IPC executed");
    }


   static int a = m1();
    static int m1(){
		System.out.println("SV a is initialized");
		return 10;
	}
	int x = m2();
	int m2(){
		System.out.println("NSV x is initialized");
		return 30;
	}
	static{
		System.out.println("SB2 is executed");
	}
	{
		System.out.println("NSB is executed");
	}


   public static void main(String[] args){
    System.out.println("main start");
    Example e3 = new Example();
    m3();
    e3.m4();
    System.out.println("main end");
	}
	static void m3(){
		System.out.println("m3 start");
		Example e5 = new Example();
		System.out.println("m3 end");
	}
	void m4(){
		System.out.println("m4 start");
		Example e6 = new Example();
		System.out.println("m4 end");
	}

	  static void m5(){
		System.out.println("m5 start");
		Example e7 = new Example();
		System.out.println("m5 end");
	}

	static int b = 20;
	int y = 30;
	static {
		System.out.println("SB3 executed");
	}
	{
		System.out.println("NSB2 executed");
	}
	static Example e8 = new Example(5);

}
