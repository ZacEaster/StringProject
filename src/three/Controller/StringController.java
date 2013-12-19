package three.Controller;

import three.View.StringView;

public class StringController
{
	private StringView myView;
	
	//Creates a StringController object, initializing all values as needed.
	public StringController()
	{
		myView = new StringView();
	}
	
	// Starts the code starting with the displayRuntimeError
	public void start()
	{
//		myView.displayRuntimeError();
		String temp = myView.sendParameterMethod();
		myView.usePassedValue(temp);
		
//		myView.usePassedValue(myView.sendParameterMethod());
		//
		myView.moreInteractive("Zac", temp);
		myView.testStringMethods();
	}
	
}
