/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_2;

// Java program to demonstrate accessing
// a static nested class

// outer class
class OuterClass {
	// static member
	static int outer_x = 10;

	// instance(non-static) member
	int outer_y = 20;

	// private member
	private static int outer_private = 30;

	// static nested class
	static class StaticNestedClass {
		void display()
		{
			// can access static member of outer class
			System.out.println("outer_x = " + outer_x);

			// can access private static member of
			// outer class
			System.out.println("outer_private = "
							+ outer_private);

			// The following statement will give compilation
			// error as static nested class cannot directly
			// access non-static members
			// System.out.println("outer_y = " + outer_y);
		
			// Therefore create object of the outer class
			// to access the non-static member
			OuterClass out = new OuterClass();
			System.out.println("outer_y = " + out.outer_y);
		
		
		}
	}
}

// Driver class
public class StaticNestedClassDemo {
	public static void main(String[] args)
	{
		// accessing a static nested class
		OuterClass.StaticNestedClass nestedObject
			= new OuterClass.StaticNestedClass();

		nestedObject.display();
	}
}
