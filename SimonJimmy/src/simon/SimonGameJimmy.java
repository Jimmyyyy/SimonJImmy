package simon;

import guiPractice.GUIApplication;

public class SimonGameJimmy extends GUIApplication {
	
	public static void main(String[] args) {
		SimonGameJimmy game = new SimonGameJimmy();
		Thread app = new Thread(game);
		app.start();
	}
	
	public SimonGameJimmy() {
		
	}
	@Override
	protected void initScreen() {
		// TODO Auto-generated method stub
		SimonScreenJimmy screen = new SimonScreenJimmy(getWidth(), getHeight());
		setScreen(screen);
	}
	
	

}
