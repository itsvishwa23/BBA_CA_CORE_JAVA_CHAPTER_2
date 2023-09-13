
package core_java_chapter_2;
// Java Program to implement
// Java this reference

public class This_Keyword_Demo {
	int num = 10;

	public This_Keyword_Demo()
	{
		System.out.println("Inside constructor");
	}

	public This_Keyword_Demo(int num)
	{
		// Invoking default constructor
		this();

		// Assigning the local variable num to the instance
		// variable num
		this.num = num;
	}

	void display()
	{
		// Invoking the method show() of the current class
		this.show();

		// Displaying the value of the instance variable num
		System.out.println("num: " + this.num);
	}

	void show()
	{
		System.out.println("Inside show method");
	}

	public static void main(String[] args)
	{
		This_Keyword_Demo obj = new This_Keyword_Demo(100);
		obj.display();
	}
}
