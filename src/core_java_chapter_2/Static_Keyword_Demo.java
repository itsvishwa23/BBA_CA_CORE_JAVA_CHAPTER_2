/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_2;
// Java program to demonstrate that a static member
// can be accessed before instantiating a class

class Static_Keyword_Demo
{
	// static method
	static void m1()
	{
		System.out.println("from m1");
	}

	public static void main(String[] args)
	{
		// calling m1 without creating
		// any object of class Test
		m1();
	}
}
