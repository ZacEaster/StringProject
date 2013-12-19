package three.View;

import javax.swing.JOptionPane;

public class StringView
{
	
	public void displayRuntimeError()
	{
		int tempNumber;
		String tempString;
		
		JOptionPane.showMessageDialog(null, "let's crash the program!");
		tempString = JOptionPane.showInputDialog("Type in your favorite number!");
		tempNumber = Integer.parseInt(tempString);
		JOptionPane.showMessageDialog(null, "Your favorite number is " + tempNumber);
	}
	
	public void usePassedValue(String currentValue)
	{
		JOptionPane.showMessageDialog(null, "You typed in this earlier: " + currentValue);
	}
	
	
	public String sendParameterMethod()
	{
		//If you are using a variable in a method, you must assign it a value first!!!!
		String temp = null;
		
		JOptionPane.showMessageDialog(null, "Let's pass values!!!");
		temp = JOptionPane.showInputDialog("Type in your favorite words");
		
		return temp;
	}
	
	public void moreInteractive(String username, String funnyPrase)
	{
		JOptionPane.showMessageDialog(null, "Hi there, we are going to use two parameters");
		JOptionPane.showMessageDialog(null, username + " thinks that" + "\n" + funnyPrase + " is funny");
		
	}
	
	public void testStringMethods()
	{
		//You will need to call your methods in here
		testSubstring();
		testMatches();
	}
	//Framework.
	private void testSubstring()
	{
		JOptionPane.showMessageDialog(null, "Lets look at a substring" + "\n" + "or the part of a string");
		JOptionPane.showMessageDialog(null, "The string I am using is stored in testString");
		String testString = "supercallifragilisitiexpialidocius";
		JOptionPane.showMessageDialog(null, "Its value is: " + "\n" + testString);
		String temp = testString.substring(7);
		JOptionPane.showMessageDialog(null, "Here it is from the 7th letter on: " + temp);
	}
	private void testMatches()
	{
		JOptionPane.showMessageDialog(null, "Lets take a look at matches" + "\n" + "to see whether they are equal");
		JOptionPane.showMessageDialog(null, "The first string is stored in ");
		String firstString = "Brody is 17";
		String secondString = "Brody is seventeen";
		boolean patternMatches =  firstString.matches(secondString);
		
	}
	
//	This is how you call a method on a string and shove that value into a variable
	private void testGetBytes()
	{
		byte[] myBytes;
		String myString = " sadfsdg";
		myBytes = myString.getBytes();
	}
	
}
