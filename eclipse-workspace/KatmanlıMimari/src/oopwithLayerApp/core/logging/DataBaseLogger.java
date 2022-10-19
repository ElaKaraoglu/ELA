package oopwithLayerApp.core.logging;

public class DataBaseLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("veritabanına loglandı: "+message);
		
	}

}
