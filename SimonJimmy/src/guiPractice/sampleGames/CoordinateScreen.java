package guiPractice.sampleGames;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Button;
import guiPractice.components.Graphic;
import guiPractice.components.MovingComponent;
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;
import guiPractice.components.Action;

public class CoordinateScreen extends Screen implements MouseMotionListener, MouseListener{

	private TextLabel label;
	private TextArea paragraph;
	private Button button;
	private Graphic picture;
	
	public CoordinateScreen(int width, int height) {
		super(width, height);
		
	}
	
	public void initObjects(ArrayList<Visible> viewObjects2) {
		label=new TextLabel(40,45,760, 40, "Welcome to the game!!!");
		
		//paragraph = new TextArea(40,85,550,500,"SAmple paragraph  SAmple SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph SAmple paragraph ");
		//viewObjects.add(paragraph);
		button = new Button((getWidth()-200)/2,(getHeight()-50)/2,200,50,"Click here to start",new Color(0,76,153), new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.graphicsMove);
			}
			});
		picture=new Graphic(0,0,getWidth(),getHeight(),"resourses/sampleImages/blueBack.jpg");
		
		viewObjects.add(picture);
		//viewObjects.add(label);
		viewObjects.add(button);
		MovingComponent mc= new MovingComponent(30,60,80,80);
		mc.setVy(3);
		mc.play();
		viewObjects.add(mc);
	}

	
	public void mouseDragged(MouseEvent m) {
	
	}

	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	public MouseListener getMouseListener(){
		return this;
	}
	public void mouseMoved(MouseEvent m) {
//		label.setText("Mouse at: "+m.getX()+", "+m.getY());
		
	}
	           
	@Override
	public void mouseClicked(MouseEvent e) {
		if(button.isHovered(e.getX(), e.getY())){
			button.act();
			}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
