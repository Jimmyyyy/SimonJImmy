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
import guiPractice.components.TextArea;
import guiPractice.components.TextLabel;
import guiPractice.components.Visible;

public class MouseGameScreen extends Screen implements MouseMotionListener, MouseListener{

	private Graphic picture;
	private Button button;
	private TextArea paragraph;
	private Action action;

	public MouseGameScreen(int width, int height) {
		super(width, height);
	}

	@Override
	public void initObjects(ArrayList<Visible> viewObjects) {
		//paragraph = new TextArea(40, 85, 760, 500, "What did you just say about me? I’ll have you know I graduated top of my class in the Navy Seals, and I’ve been involved in numerous secret raids on Al-Quaeda, and I have over 300 confirmed kills. I am trained in gorilla warfare and I’m the top sniper in the entire US armed forces. You are nothing to me but just another target. I will wipe you out with precision the likes of which has never been seen before on this Earth, mark my words. You think you can get away with saying that to me over the Internet? Think again. As we speak I am contacting my secret network of spies across the USA and your IP is being traced right now so you better prepare for the storm, maggot. The storm that wipes out the pathetic little thing you call your life. You’re dead, kid. I can be anywhere, anytime, and I can kill you in over seven hundred ways, and that’s just with my bare hands. Not only am I extensively trained in unarmed combat, but I have access to the entire arsenal of the United States Marine Corps and I will use it to its full extent to wipe you off the face of the continent. If only you could have known what unholy retribution your little “clever” comment was about to bring down upon you, maybe you would have held your tongue. But you couldn’t, you didn’t, and now you’re paying the price, you idiot. I will rain fury all over you and you will drown in it. You’re dead, kiddo.");
		picture = new Graphic(190,150, 300, 300, "resources/sampleImages/one.png");
		button = new Button(500, 45, 150, 40, "Let's bring it back boi.", Color.yellow, new Action(){
			public void act(){
				MouseFollower.game.setScreen(MouseFollower.clickScreen);
				}
				});
		//picture = new Graphic(50,50, .5,"resources/sampleImages/yeet.jpg");
		viewObjects.add(picture);
		viewObjects.add(button);
		
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

	public void mouseDragged(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
