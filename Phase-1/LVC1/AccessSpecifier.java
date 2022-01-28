package com.lvl.assistedProject;
class DefSpecifier{
	
	//1. Using Default access modifier
	void display() {
		System.out.println("This is defalut access specifier");
	}
	
	//2. using private access specifiers
    private	void test() {
    	System.out.println("This is private access specifier");
    }
    
    //3. using protected access specifiers
    protected void hello() {
    	System.out.println("This is protected access specifier");
    }
    
    //4. using public access specifiers
    public void world() {
    	System.out.println("This is Public Access Specifiers");
    }
}
public class AccessSpecifier {
	public static void main(String[] args) {
		System.out.println("Within package and other class :\n");
		DefSpecifier obj=new DefSpecifier();
		obj.display();
		//obj.test(); //can't access
		obj.hello();
		obj.world();
		
		System.out.println("\nWithin package and same class :\n");
		AccessSpecifier obj2=new AccessSpecifier();
		obj2.display1();
		obj2.test1();
		obj2.hello1();
		obj2.world1();
		
		
	}
	//1. Using Default access modifier
		 void display1() {
			System.out.println("This is defalut access specifier");
		}
		
		//2. using private access specifiers
	    private	void test1() {
	    	System.out.println("This is private access specifier");
	    }
	    
	    //3. using protected access specifiers
	    protected void hello1() {
	    	System.out.println("This is protected access specifier");
	    }
	    
	    //4. using public access specifiers
	    public void world1() {
	    	System.out.println("This is Public Access Specifiers");
	    }
}
