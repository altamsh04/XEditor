import java.awt.*;
import javax.swing.*;

public class Load extends JFrame
{
	JLabel l1;
	ImageIcon im1;
	JProgressBar jpb;
	int i = 0;
	BorderLayout bl;
	Load()
	{
		this.setVisible(true);
		this.setSize(500,500);
		this.setTitle("XEditor");
		bl = new BorderLayout();
		this.setLayout(bl);
		this.setLocationRelativeTo(null);
		this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

		Image img = Toolkit.getDefaultToolkit().getImage("logo.png");
		this.setIconImage(img);
		
		this.setBackground(Color.gray);

		im1 = new ImageIcon("X.png");
		l1 = new JLabel(im1);
		this.add(l1,BorderLayout.CENTER);

		jpb = new JProgressBar(0,1000);
		jpb.setValue(0);
		jpb.setStringPainted(true);
		this.add(jpb,BorderLayout.SOUTH);
	}

	public void loop()
	{
		while(i<=1000)
		{		
			jpb.setValue(i);
			i = i + 10;
			try
			{
			Thread.sleep(40);
			}
			catch(Exception e)
			{}			
		}
		new  XEditor();
		this.dispose();	
	}


	public static void main(String args[])
	{
            Load L = new Load();
        	L.loop();
    }
}
