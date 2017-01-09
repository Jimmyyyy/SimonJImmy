package guiPractice;

import java.awt.Graphics;

import javax.swing.JFrame;

public abstract class GUIApplication extends JFrame implements Runnable{

	private Screen currentScreen;
	//no main, cant instentiate an abstract class
	public GUIApplication(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//setUndecorated(true);
		int x=40;
		int y=40;
		int width=600;
		int height=400;
		setBounds(x,y,width,height);
		initScreen();
		setVisible(true);
	}
	//this is a method for creating the starting screen
	protected abstract void initScreen();
	
	public void setScreen(Screen screen){
		//stop controls from previous screen
		if(currentScreen!=null){
			if(currentScreen.getMouseListener() !=null){
				removeMouseListener(currentScreen.getMouseListener());
			}
			if(currentScreen.getMouseMotionListener() !=null){
				removeMouseMotionListener(currentScreen.getMouseMotionListener());
			}
		}
		currentScreen=screen;
		//add new controls
		if(currentScreen!=null){
			addMouseListener(currentScreen.getMouseListener());
			addMouseMotionListener(currentScreen.getMouseMotionListener());
		}
	}
	public void paint(Graphics g){
		g.drawImage(currentScreen.getImage(), 0, 0, null);
	}
	
	public void run(){
		while(true){
			currentScreen.update();
			repaint();
			try {
				Thread.sleep(40);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
