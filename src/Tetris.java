/* Michael Bartholic & Will Sands
 * Started: April 13, 2015
 * On my honor, I pledge that I have neither given nor received unauthorized help on this assignment nor have I presented someone else's work as my own.
 */
import java.applet.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.Timer;

public class Tetris extends Applet {
	
	Image dbImage;
	Graphics dbg;
	
	
	
	public void init(){
		
	}

	public void paint(Graphics g){
		
	}
	
	
	public void update(Graphics g){
		//initialize
		if (dbImage == null){
			dbImage = createImage(getSize().width,getSize().height);
			dbg = dbImage.getGraphics();
		}
		
		//clear the screen in the background
		dbg.setColor(getBackground());
		dbg.fillRect(0,0,getSize().width,getSize().height);
		dbg.setColor(getForeground());
		paint(dbg);
		
		//draw the image to screen
		g.drawImage(dbImage,0,0,this);
	}
	
}
