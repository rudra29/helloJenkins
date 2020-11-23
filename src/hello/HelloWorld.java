package hello;

import java.text.SimpleDateFormat;
import java.util.Date; 

public class HelloWorld {
	
	public static void main(String args[])
	{
		System.out.println("Started edat "+ new SimpleDateFormat("hh:mm:ss a").format(new Date()));
		for(int i=1;i<=5;i++)
		{
			System.out.println(i);
		}
	}

}
