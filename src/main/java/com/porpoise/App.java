package com.porpoise;

/**
 * Hello world!
 */
public class App
{
	private String	greeting	= "hello world!";

	/**
	 * main entry point
	 * 
	 * @param args
	 */
	public static void main(final String[] args)
	{
		System.out.println(new App().getGreeting());
	}

	/**
	 * @param value
	 */
	public void setGreeting(final String value)
	{
		this.greeting = value;
	}

	/**
	 * @return the greeting
	 */
	public String getGreeting()
	{
		return this.greeting;
	}
}
