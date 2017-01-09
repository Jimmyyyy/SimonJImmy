package guiPractice.sampleGames;

import guiPractice.GUIApplication;

public class MouseFollower extends GUIApplication {
	
	public static CoordinateScreen coordScreen;
	public static MouseGameScreen theScreen;
	public static ClickGraphicsScreen clickScreen;
	public static MouseFollower game;
	
	public static void main (String[] args){
		game = new MouseFollower();
		Thread app = new Thread(game);
		app.start();
	}

	@Override
	protected void initScreen() {
		coordScreen = new CoordinateScreen(getWidth(), getHeight());
		theScreen = new MouseGameScreen(getWidth(), getHeight());
		clickScreen = new ClickGraphicsScreen(getWidth(), getHeight());
		setScreen(coordScreen);
	}

}
