import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.Random;

public class Gui extends JFrame
{
    private JLabel label;
    private JButton button1;
    private JButton button2;
    private JButton button3;
    private JLabel randomText;
    private int x = 0;
    
    public Gui(){
         
	setLayout(new FlowLayout());
	
	label = new JLabel("Welcome to PipSqueak Says!");
	add(label);
	
	button1 = new JButton("Movies");
	add(button1);
	
	button2 = new JButton("What should I watch?");
	add(button2);

	randomText = new JLabel("");
	add(randomText);
	
	button3 = new JButton("Take a Quiz");
	add(button3);

	Event e = new Event();
	button2.addActionListener(e);
    }
    public class Event implements ActionListener{
	public void actionPerformed(ActionEvent e){
	
	    Random rand = new Random();
	    int index;
	    if(x == 0){
		index = rand.nextInt(Movie.movieList.size() - 1);
		  randomText.setText("PipSqueak recommends you watch: " + 
		       Movie.movieList.get(index).title);
		  x = 1;
	    }else if(x == 1){
		randomText.setText("");
		x = 0;
	    }
	}
    }
    public static void main(String[] args){
	
	Gui gui = new Gui();
	gui.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	gui.setVisible(true);
	gui.setSize(300, 250);
	gui.setTitle("PipSqueak Says");

	Movie.createMovieList();
    }
}