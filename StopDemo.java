class StopDemo
{
	public static void main(String args[])
	{
	A thread1=new A();
	B thread2=new B();
	C thread3=new C();
	System.out.print("Thread A Start");
	thread1.start();
	System.out.print("Thrad b Start");
	thread2.start();
	System.out.print("Thread c start");
	thread3.start();
	}
}
class A extends Thread
{
	public void run()
	{
	for (int i=1;i<=5;i++)
	{
		if (i==1)
		yield();
		System.out.println("\n From Thread"+i);
	}
		System.out.println("End of Thread");
	}

class B extends Thread
{
	public void run()
	{
	for (int j=1;j<=5;j++)
	{
	System.out.println("\n form Thread c=j"+j++);

	if (j==3)
	stop();
	}
	System.out.println("End of Thread");
	}

class C extends Thread
{
	public void run()
	{
		for(int k=1;k<=5;k++)
		{
			System.out.println("\n Form Thrad c:K"+k);
	
		if (k==1)
			try
			{
			sleep(1000);
			}
 			catch(Exception e){}
			
		}
	
	System.out.println("End of Thread C");
}
}
}
}


