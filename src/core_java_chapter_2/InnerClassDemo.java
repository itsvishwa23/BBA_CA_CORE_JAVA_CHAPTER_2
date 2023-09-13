/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_2;
// Java program to demonstrate accessing
// a inner class

// outer class
class OuterClass {
	// static member
	static int outer_x = 10;

	// instance(non-static) member
	int outer_y = 20;

	// private member
	private int outer_private = 30;

	// inner class
	class InnerClass {
		void display()
		{
			// can access static member of outer class
			System.out.println("outer_x = " + outer_x);

			// can also access non-static member of outer
			// class
			System.out.println("outer_y = " + outer_y);

			// can also access a private member of the outer
			// class
			System.out.println("outer_private = "
							+ outer_private);
		}
	}
}

// Driver class
public class InnerClassDemo {
	public static void main(String[] args)
	{
		// accessing an inner class
		OuterClass outerObject = new OuterClass();
	
		OuterClass.InnerClass innerObject
			= outerObject.new InnerClass();

		innerObject.display();
	}
}
