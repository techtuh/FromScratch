package automationexercise;

public class Functionalities {

	public static void Login() {
		
	System.setProperty("webdriver.chrome.driver", "./FromScratch/Driver/chromedriver.exe");
	System.setProperties(null);
	
	
	}
	
	public static void main(String[] args) {
		Functionalities obj = new Functionalities();
		obj.Login();
		
	}
}
