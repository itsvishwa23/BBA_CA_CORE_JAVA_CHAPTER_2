/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core_java_chapter_2;
// Java Program for Parameterized Constructor
class Parameterized_Constructor_Demo {
	// data members of the class.
	String name;
	int id;
	Parameterized_Constructor_Demo(String name, int id)
	{
		this.name = name;
		this.id = id;
	}
}
class Demo {
	public static void main(String[] args)
	{
		// This would invoke the parameterized constructor.
		Parameterized_Constructor_Demo geek1 = new Parameterized_Constructor_Demo("avinash", 68);
		System.out.println("Name :" + geek1.name
						+ " and Id :" + geek1.id);
	}
}
