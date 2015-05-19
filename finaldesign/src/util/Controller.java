package util;

public class Controller {

	private static Controller controller;
	private CommonTagertSet ctSet;
	
	private Controller()
	{
		ctSet = new CommonTagertSet();
		ctSet.init();
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
	
	public void updateModel(byte[] buffer)
	{
		
	}
	
	public CommonTagertSet getCommonTarget()
	{
		return ctSet;
	}
	
	public int getPoint()
	{
		return 0;
	}
}
