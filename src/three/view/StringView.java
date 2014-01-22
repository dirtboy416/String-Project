package three.view;

import javax.swing.JOptionPane;

public class StringView
{
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;

		JOptionPane.showMessageDialog(null, "Let's crash the program!!!");
		tempString = JOptionPane
				.showInputDialog("Type in your favorite number");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "yout favorite number is "
				+ tempNumber);

	}

	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed in this ealier: "
				+ currentValue);
	}

	public String sendParameterMethod()
	{
		// when using a variable in a method you must first assign it a value.
		String temp = null;
		JOptionPane.showMessageDialog(null, "Let's pass values!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
		return temp;
	}

	public void moreInteractive(String UserName, String FunnyPhrase)
	{
		JOptionPane.showMessageDialog(null,
				"Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, UserName + " thinks that " + "\n"
				+ FunnyPhrase + " is funny");
		// it is calling the username from the controller and the funny phrase
		// from there too.
	}
	public void testStringMethods()
	{
		testSubstring();
		 testToString();
		testCompareTo();
		testLengthString();
	}
//	Cody's example
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null, "Let's look at a substring" + "\n"
				+ "or the part of a string");
		JOptionPane.showMessageDialog(null,
				"The string I am using is stored in testString");
		String testString = "supercallifragilisiticexpialidocius";
		JOptionPane
				.showMessageDialog(null, "Its value is " + "\n" + testString);
		String temp = testString.substring(7, 12);
		JOptionPane.showMessageDialog(null,
				"Here it is from the 7th letter on:" + temp);
	}
//	ToString returns the same string
	private void testToString()
	{
			String myToString;

			String myString = "lk;jsadf";
			myToString = myString.toString();
			JOptionPane.showMessageDialog(null, "this string is stupid watch this " + myString);
		}
//	compares words in alphabetical order and give you a number of what is has compared
	private void testCompareTo()
	{
		String tools;
		String fred;
		tools = "fred";
		fred = "young";
		int order = tools.compareTo(fred);
		JOptionPane.showMessageDialog(null,  "The value of order is." + order);	
	}
//  this tells you the length of the variable
	private void testLengthString()
	{
		
		      String Str1 = new String("Welcome to how to use length method");
		      String Str2 = new String("this is whats up man" );
		      JOptionPane.showMessageDialog(null,"Welcome to how to use length method");
		      JOptionPane.showMessageDialog(null,"String Length :" + Str1.length() );
		      JOptionPane.showMessageDialog(null,"this is whats up man" );
		      JOptionPane.showMessageDialog(null,"String Length :" + Str2.length());
		      
	}

	}



