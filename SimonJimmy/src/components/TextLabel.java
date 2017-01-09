package guiPractice.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextLabel extends Component {
	
	private String text; 
	private String font;
	private int size;

	public TextLabel(int x, int y, int width, int height, String s) {
		super(x, y, width, height);
		this.text = s;
		font = "Comic Sans MS";
		size = 16;
		update();
	}
	
	public void setText(String s){
		this.text = s;
		update();
	}

	public void setFont(String s){
		this.font = s;
		update();
	}
	
	public void setSize(int n){
		this.size = n;
		update();
	}
	
	public String getText() {
		return text;
	}

	public String getFont() {
		return font;
	}

	public int getSize() {
		return size;
	}

	@Override
	public void update(Graphics2D g) {
		g = clear();
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.black);
		if(text != null){
			g.setFont(new Font(font, Font.PLAIN, size));
			g.drawString(text, 4, getHeight()-5);
		}
	}

}
