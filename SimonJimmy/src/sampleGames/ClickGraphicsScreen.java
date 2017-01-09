package guiPractice.sampleGames;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.ArrayList;

import guiPractice.Screen;
import guiPractice.components.Action;
import guiPractice.components.ClickableGraphic;
import guiPractice.components.Graphic;
import guiPractice.components.Visible;

public class ClickGraphicsScreen extends Screen implements MouseMotionListener, MouseListener{

	private ClickableGraphic picture;
	private boolean bounce = true;

	public ClickGraphicsScreen(int width, int height) {
		super(width, height);
	}

	public void mouseClicked(MouseEvent e) {
		if(picture.isHovered(e.getX(), e.getY())){
			picture.act();
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

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		picture = new ClickableGraphic(190,150, 300, 300, "resources/sampleImages/goku1.jpg");
		picture.setAction(new Action(){
			public void act(){
				if(picture.getX()<600 && bounce){
					picture.setX(picture.getX()+150);
				}else{
					picture.setX(picture.getX()-150);
					bounce = false;
				}
				}
				});
		viewObjects.add(picture);
	}

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	public MouseMotionListener getMouseMotionListener(){
		return this;
	}
	
	public MouseListener getMouseListener(){
		return this;
	}

}
