package util;

public class Controller {

	private static Controller controller;
	
	private Controller()
	{
		
	}
	
	public static Controller getInstance()
	{
		if (controller == null)
		{
			controller = new Controller();
		}
		
		return controller;
	}
	
	public LogFrame logMessage(byte[] buffer)
	{
		LogFrame log = new LogFrame();
		
		return log;
	}
}
