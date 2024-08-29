package com.java.lambda;

class Threaddemo Implements Runnable
{
	@Override
	public void run()
	{
		System.out.println("run method calles");
}


}
public class Runnablelambda {

	public static void main(String[] args) {
		Thread thread=new Thread(new Threaddemo));
		thread.start();
		
		
		Runnable runnable=()
->{
	System.out.println("run");
	};
}

}
