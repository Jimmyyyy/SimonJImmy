package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener {
	
	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Action action;
	private Graphic picture;

	public CoordinateScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		label = new TextLabel(40, 45, 760, 40, "");
		paragraph = new TextArea(40, 85, 760, 500, "WHat did u just say about me");
		button = new Button(200, 45, 150, 40, "Click me boi.", Color.red, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.theScreen);
				}
				});
		picture = new Graphic(25,150, 960, 450, "resources/sampleImages/goku2.jpg");
		//picture = new Graphic(50,50, .5,"resources/sampleImages/yeet.jpg");

		
		viewObjects.add(label);
		viewObjects.add(picture);
		viewObjects.add(paragraph);
		viewObjects.add(button);
		

		MovingComponent mc = new MovingComponent(30,60,80,80);
		mc.setVy(3);
		viewObjects.add(mc);
		mc.play();
	}

	public void mouseDragged(MouseEvent m) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent m) {
		label.setText("Mouse at " + m.getX() + ", " + m.getY());
	}
	
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
			}
	}

	public void mouseEntered(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}
