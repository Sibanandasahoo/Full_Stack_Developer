package com.simplilearn.thread;

public class ThrowsKey {
	void Division() throws ArithmeticException
    {
        int a=30,b=0,rs;
        rs = a / b;
        System.out.print("\n\tThe result is : " + rs);
    }
    public static void main(String[] args)
   {
    	ThrowsKey T = new ThrowsKey();
        try
       {
           T.Division();
       }
       catch(ArithmeticException Ex)
       {
           System.out.print("\n\tError : " + Ex.getMessage());
       }
       System.out.print("\n\tEnd of program.");
   }


}
