import java.awt.*;
import java.awt.Desktop;
import java.awt.event.*;
import javax.swing.*;
import java.net.URI;

public class about extends JPanel implements ActionListener
{

	JLabel l1,l2,l3,l4,l5,l6,l8;
	ImageIcon im1;
	JButton l7;
	Font f1,f2;

	about()
	{
		this.setLayout(new GridLayout(8,2));
		Image img = Toolkit.getDefaultToolkit().getImage("logo.png");
	
		im1 = new ImageIcon("logo2.png");
		l1 = new JLabel(im1);
		this.add(l1);

		l2 = new JLabel("XEditor",JLabel.CENTER);
		f1 = new Font("Ariel",Font.BOLD,30);
		l2.setFont(f1);
		this.add(l2);

		f2 = new Font("Ariel",Font.BOLD,15);
		l3 = new JLabel("About : This is a simple Text editor");
		l4 = new JLabel("Relese date : 20,11,2022");
		l5 = new JLabel("Version : 1.0");
		l6 = new JLabel("Developer : Altamsh Bairagdar");
		l7 = new JButton("Documentation At : https://github.com/AltamshBairagdar/XEditor.git");
		l8 = new JLabel("Copyright 2022 - present XEditor.io. All rights reserved.");
		l3.setFont(f2);l4.setFont(f2);l5.setFont(f2);l6.setFont(f2);l7.setFont(f2);l8.setFont(f2);

		l1.setBackground(Color.white);
		l2.setBackground(Color.white);
		l3.setBackground(Color.white);
		l4.setBackground(Color.white);
		l5.setBackground(Color.white);
		l6.setBackground(Color.white);
		l7.setBackground(Color.white);
		l8.setBackground(Color.white);

	this.setBackground(Color.white);
	
	l7.setForeground(Color.black);


	//l1.setEnabled(false);l2.setEnabled(false);l3.setEnabled(false);l4.setEnabled(false);l5.setEnabled(false);l6.setEnabled(false);l8.setEnabled(false);

		l7.addActionListener(this);

		this.add(l3);
		this.add(l4);
		this.add(l5);
		this.add(l6);
		this.add(l7);
		this.add(l8);
		//for create an Dialog box
		JOptionPane.showMessageDialog(null,this,"About XEditor",JOptionPane.CLOSED_OPTION);
	}

	public void actionPerformed(ActionEvent ae){

	try{

	Desktop d = Desktop.getDesktop();
	d.browse(new URI("https://github.com/AltamshBairagdar/XEditor.git"));

	}catch(Exception e){}


	
}


}
