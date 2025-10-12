            /* a class is loaded into jvm only when we access a member and the member would be
               'static main-method, static method, static variable, constructor(object creation)
				1)we can load a class by using (java .classFileName) which calls the main-method. 
				in the process of loading the .class file into the JVM memory a java.lang.class Object is 
				created and the byte code in stored in that object.
				during  in that static variables are first 



             
				A class is **loaded into the JVM** the first time it’s actively used. 
				Active use means:
				   - Accessing a static method (including the main method),
				   - Accessing a static variable,
				   - Creating an object (which invokes the constructor).

				1) We can load a class by running `java ClassName` (without .class). 
				   This calls the `main` method if it exists. 

				2) When the .class file is loaded into JVM memory, the JVM creates a 
				   `java.lang.Class` object representing that class. 
				   The class’s bytecode and metadata are stored in that `Class` object.

				3) During class loading:
				   - Static variables are initialized first (default values),
				   - Then static blocks are executed in order,
				   - After that, instance members are prepared but initialized only 
					 when an object is created.
              */



class  
{
	public static void main(String[] args) 
	{
	   
	}
}
