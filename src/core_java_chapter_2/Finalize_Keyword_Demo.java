/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_2;
// Java code to show the
// overriding of finalize() method

import java.lang.*;

// Defining a class demo since every java class
// is a subclass of predefined Object class
// Therefore demo is a subclass of Object class
public class Finalize_Keyword_Demo {

	protected void finalize() throws Throwable
	{
		try {

			System.out.println("inside demo's finalize()");
		}
		catch (Throwable e) {

			throw e;
		}
		finally {

			System.out.println("Calling finalize method"
							+ " of the Object class");

			// Calling finalize() of Object class
			super.finalize();
		}
	}

	// Driver code
	public static void main(String[] args) throws Throwable
	{

		// Creating demo's object
		Finalize_Keyword_Demo d = new Finalize_Keyword_Demo();

		// Calling finalize of demo
		d.finalize();
	}
}
