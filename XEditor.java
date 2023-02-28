//XEditor main home
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.BorderFactory.*;
import javax.swing.border.Border;
import java.io.*;

public class XEditor extends JFrame implements ActionListener
{
		JMenuBar mbar;
		JMenu file,edit,format,view,help;
		JMenuItem new1,open,save,saveas,exit,undo,redo,cut,copy,paste,delete,find,selectall,font,background,fontc,zoomin,zoomout,viewhelp,about;
		JTextArea ta;Color c1;Font f3;
		JScrollPane scroll;
		JPanel lb2,lb3,lb4,lb5;
		JButton jb1,jb2,jb3,jb4,jb5,jb6,jb7,jb8,jb9,jb10,jb11,jb12,jb13,jb14;
		String str;int len,size=15;KeyStroke k1,k2,k3,k4;String data;JLabel count;String text,text1;
		int flag;
		XEditor()
		{
				//frame basic code

				this.setVisible(true);
				this.setSize(500,500);
				this.setTitle("XEditor : untitled");
				this.setLocationRelativeTo(null);
				this.setLayout(new BorderLayout());
				Image img = Toolkit.getDefaultToolkit().getImage("logo.png");
				this.setIconImage(img);
				this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);

				//add Text area to frame
				ta = new JTextArea();
				this.add(ta,BorderLayout.CENTER);

				JLabel ll1 = new JLabel("XEditor version : 1.0");
				count = new JLabel("",JLabel.RIGHT);

				
				lb2 = new JPanel();
				// lb2.setBackground(Color.black);
				lb2.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
				this.add(lb2,BorderLayout.SOUTH);
				lb2.add(ll1);
				lb2.add(count);

				lb3 = new JPanel();
				// lb3.setBackground(Color.black);
				this.add(lb3,BorderLayout.WEST);

				lb4 = new JPanel();
				lb4.setLayout(new FlowLayout(FlowLayout.LEFT,10,10));
				// lb4.setBackground(Color.black);
				this.add(lb4,BorderLayout.NORTH);

				lb5 = new JPanel();
				// lb5.setBackground(Color.black);
				this.add(lb5,BorderLayout.EAST);

				ImageIcon im1 = new ImageIcon("new.gif"); 
				ImageIcon im2 = new ImageIcon("open.gif"); 
				ImageIcon im3 = new ImageIcon("save.gif"); 
				ImageIcon im4 = new ImageIcon("no.gif"); 
				ImageIcon im5 = new ImageIcon("cut.gif"); 
				ImageIcon im6 = new ImageIcon("copy.gif"); 
				ImageIcon im7 = new ImageIcon("paste.gif"); 
				ImageIcon im8 = new ImageIcon("zoomin.gif"); 
				ImageIcon im9 = new ImageIcon("zoomout.gif"); 
				ImageIcon im10 = new ImageIcon("bold.gif"); 
				ImageIcon im11 = new ImageIcon("italic.gif"); 
				ImageIcon im12 = new ImageIcon("about.gif"); 
				ImageIcon im13 = new ImageIcon("length.gif");
				ImageIcon im14 = new ImageIcon("help.gif");
				

				//Border bb = BorderFactory.createLineBorder(Color.black,2);					

				//buttons for componants
				jb1 = new JButton(im1);
				jb1.setBackground(Color.white);
				jb1.setToolTipText("New");
				jb1.addActionListener(this);
				lb4.add(jb1);
				//jb1.setBorder(bb);

				jb2 = new JButton(im2);
				jb2.setBackground(Color.white);
				jb2.setToolTipText("Open");
				jb2.addActionListener(this);
				lb4.add(jb2);
				//jb2.setBorder(bb);

				jb3 = new JButton(im3);
				jb3.setBackground(Color.white);
				jb3.setToolTipText("Save");
				jb3.addActionListener(this);
				lb4.add(jb3);
				//jb3.setBorder(bb);

				jb4 = new JButton(im4);
				jb4.setBackground(Color.white);
				jb4.setToolTipText("Close");
				jb4.addActionListener(this);
				lb4.add(jb4);
				//jb4.setBorder(bb);

				jb5 = new JButton(im5);
				jb5.setBackground(Color.white);
				jb5.setToolTipText("Cut");
				jb5.addActionListener(this);
				lb4.add(jb5);
				//jb5.setBorder(bb);

				jb6 = new JButton(im6);
				jb6.setBackground(Color.white);
				jb6.setToolTipText("Copy");
				jb6.addActionListener(this);
				lb4.add(jb6);
				//jb6.setBorder(bb);

				jb7 = new JButton(im7);
				jb7.setBackground(Color.white);
				jb7.setToolTipText("Paste");
				jb7.addActionListener(this);
				lb4.add(jb7);
				//jb7.setBorder(bb);

				jb8 = new JButton(im8);
				jb8.setBackground(Color.white);
				jb8.setToolTipText("Zoomout");
				jb8.addActionListener(this);
				lb4.add(jb8);
				//jb8.setBorder(bb);

				jb9 = new JButton(im9);
				jb9.setBackground(Color.white);
				jb9.setToolTipText("Zoomin");
				jb9.addActionListener(this);
				lb4.add(jb9);
				//jb9.setBorder(bb);

				jb10 = new JButton(im10);
				jb10.setBackground(Color.white);
				jb10.setToolTipText("Bold");
				jb10.addActionListener(this);
				//jb10.setBorder(bb);
				lb4.add(jb10);

				jb11 = new JButton(im11);
				jb11.setBackground(Color.white);
				jb11.setToolTipText("Italic");
				jb11.addActionListener(this);
				lb4.add(jb11);
				//jb11.setBorder(bb);

				jb12 = new JButton(im12);
				jb12.setBackground(Color.white);
				jb12.setToolTipText("About");
				jb12.addActionListener(this);
				lb4.add(jb12);
				//jb12.setBorder(bb);

				jb13 = new JButton(im13);
				jb13.setBackground(Color.white);
				jb13.setToolTipText("Count words and characters");
				jb13.addActionListener(this);
				lb4.add(jb13);
				//jb13.setBorder(bb);

				jb14 = new JButton(im14);
				jb14.setBackground(Color.white);
				jb14.setToolTipText("View help");
				jb14.addActionListener(this);
				lb4.add(jb14);
				//jb14.setBorder(bb);

				Font f3 = new Font(Font.SANS_SERIF,Font.PLAIN,15);
				ta.setFont(f3);

				scroll = new JScrollPane(ta);
				scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
				scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED);						
				this.add(scroll);
				

				//code for show menubar	
				mbar = new JMenuBar();
				//code for menu
				file = new JMenu("File");
				edit = new JMenu("Edit");
				format = new JMenu("Format");
				view = new JMenu("View");
				help = new JMenu("Help");
				//add menu to menubar
				mbar.add(file);
				mbar.add(edit);
				mbar.add(format);
				mbar.add(view);
				mbar.add(help);
				//create menuitem
				new1 = new JMenuItem("New");
				open = new JMenuItem("Open");
				save = new JMenuItem("Save");
				saveas = new JMenuItem("Save As");
				exit = new JMenuItem("Exit");
				

				//add shortcut for file menuitems to menuitems
				k1=KeyStroke.getKeyStroke(KeyEvent.VK_N, ActionEvent.CTRL_MASK);
				new1.setAccelerator(k1);

				k1=KeyStroke.getKeyStroke(KeyEvent.VK_O, ActionEvent.CTRL_MASK);
				open.setAccelerator(k1);

				k1=KeyStroke.getKeyStroke(KeyEvent.VK_S, ActionEvent.CTRL_MASK);
				save.setAccelerator(k1);

				k1=KeyStroke.getKeyStroke(KeyEvent.VK_E, ActionEvent.CTRL_MASK);
				exit.setAccelerator(k1);

				//add listener to file menuitrms
				new1.addActionListener(this);
				open.addActionListener(this);
				save.addActionListener(this);
				saveas.addActionListener(this);
				exit.addActionListener(this);

				//add menuitem to file menu
				file.add(new1);
				file.add(open);
				file.add(save);
				file.add(exit);

				//create menuitems for edit menu
				undo = new JMenuItem("Undo");
				redo = new JMenuItem("Redo");
				cut = new JMenuItem("Cut");
				copy = new JMenuItem("Copy");
				paste = new JMenuItem("Paste");
				delete = new JMenuItem("Delete");
				find = new JMenuItem("Find");
				selectall = new JMenuItem("Select All");

				//add menuitem to edit menu
				edit.add(undo);
				edit.add(redo);
				edit.add(cut);
				edit.add(copy);
				edit.add(paste);
				edit.add(delete);
				// edit.add(find);
				edit.add(selectall);

				//add shortcut for edit menuitems
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_U, ActionEvent.CTRL_MASK);
				undo.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_R, ActionEvent.CTRL_MASK);
				redo.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_X, ActionEvent.CTRL_MASK);
				cut.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_C, ActionEvent.CTRL_MASK);
				copy.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_V, ActionEvent.CTRL_MASK);
				paste.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_D, ActionEvent.CTRL_MASK);
				delete.setAccelerator(k2);
				
				k2=KeyStroke.getKeyStroke(KeyEvent.VK_A, ActionEvent.CTRL_MASK);
				selectall.setAccelerator(k2);

				//add listener to edit menuitems
				undo.addActionListener(this);
				redo.addActionListener(this);
				cut.addActionListener(this);
				copy.addActionListener(this);
				paste.addActionListener(this);
				delete.addActionListener(this);
				find.addActionListener(this);
				selectall.addActionListener(this);

				//create menuitem for format
				font = new JMenuItem("Font");
				background = new JMenuItem("Background");
				fontc = new JMenuItem("Font Color");

				//add menuitem to format menu
				format.add(font);
				format.add(background);
				format.add(fontc);

				//add shortcut for format menuitems
				k3=KeyStroke.getKeyStroke(KeyEvent.VK_F, ActionEvent.CTRL_MASK);
				font.setAccelerator(k3);
			
				k3=KeyStroke.getKeyStroke(KeyEvent.VK_B, ActionEvent.CTRL_MASK);
				background.setAccelerator(k3);

				k3=KeyStroke.getKeyStroke(KeyEvent.VK_L, ActionEvent.CTRL_MASK);
				fontc.setAccelerator(k3);

				//add listener to format menuitems
				font.addActionListener(this);
				background.addActionListener(this);
				fontc.addActionListener(this);

				//create menuitem for view
				zoomin = new JMenuItem("Zoom In");
				zoomout = new JMenuItem("Zoom Out");

				//add menuitem to view menu
				view.add(zoomin);
				view.add(zoomout);

				//add shortcut for view menuitems
				k3=KeyStroke.getKeyStroke(KeyEvent.VK_P, ActionEvent.CTRL_MASK);
				zoomin.setAccelerator(k3);
				k3=KeyStroke.getKeyStroke(KeyEvent.VK_M, ActionEvent.CTRL_MASK);
				zoomout.setAccelerator(k3);

				//add listener to view menuitems
				zoomin.addActionListener(this);
				zoomout.addActionListener(this);

				//create menuitem to help menu
				viewhelp = new JMenuItem("View Help");
				about = new JMenuItem("About XEditor");

				//add menuitem to help
				help.add(viewhelp);
				help.add(about);
				
				k4=KeyStroke.getKeyStroke(KeyEvent.VK_I, ActionEvent.CTRL_MASK);
				viewhelp.setAccelerator(k4);

				//add listener to help menuitems
				viewhelp.addActionListener(this);
				about.addActionListener(this);

				//add menubar to frame
				this.setJMenuBar(mbar);
		}		
		
		public void actionPerformed(ActionEvent ae)
		{	

			//menu buttons
			//new
			if (ae.getSource()==jb1)
			{
				jb1x();				
			}
			//open
			if (ae.getSource()==jb2) 
			{
				jb2x();
			}
			//Save
			if (ae.getSource()==jb3) 
			{
				jb3x();
			}

			//close
			if (ae.getSource()==jb4) 
			{
				jb4x();
			}

			//cut
			if (ae.getSource()==jb5) 
			{
				ta.cut();
			}
			//copy
			if (ae.getSource()==jb6) 
			{
				ta.copy();
			}
			//paste
			if (ae.getSource()==jb7) 
			{
				ta.paste();
			}	
			//zoomin
			if (ae.getSource()==jb9) 
			{
				jb9x();
			}
			//zoomout
			if (ae.getSource()==jb8) 
			{
				jb8x();
			}
			//bold
			if (ae.getSource()==jb10)
			{
				Font displayFont = new Font(Font.SANS_SERIF, Font.BOLD, size);
				ta.setFont(displayFont);
			}
			//italic
			if (ae.getSource()==jb11) 
			{
				Font displayFont = new Font(Font.SANS_SERIF, Font.ITALIC, size);
				ta.setFont(displayFont);
			}
			//about
			if (ae.getSource()==jb12) 
			{
				new about();
			}
			//count
			if(ae.getSource()==jb13)
			{
				text = ta.getText();
				String words[]=text.split("\\s");
				count.setText(" Words : " + words.length + " Characters : " + text.length());
			}
			if (ae.getSource()==jb14) 
			{
				new tabledata();
			}

			//end menu button
			

			//for edit menu
			if(ae.getSource()==cut) 
			{
				ta.cut();	
			}
			if(ae.getSource()==copy)
			{
				ta.copy();
			}
			if(ae.getSource()==paste)
			{
				ta.paste();
			}
			if(ae.getSource()==selectall)
			{
				ta.selectAll();
			}
			//new
			if (ae.getSource()==new1) 
			{
				jb1x();	
			}

			//save file
			if (ae.getSource()==save) 
			{	
				jb3x();
			}
			//end save file

			//exit
			if (ae.getSource()==exit) 
			{
				jb4x();
			}

			//open file
			if (ae.getSource()==open) 
			{
				jb2x();
			}
			//end open file

			if (ae.getSource()==about) 
			{
				new about();
			}

			if (ae.getSource()==background) 
			{
				c1 = JColorChooser.showDialog(this,"Background Color",Color.red);
				ta.setBackground(c1);
			}
			if (ae.getSource()==font) 
			{
				new XEditorFontFrame();
			}
			if (ae.getSource()==fontc) 
			{
				c1 = JColorChooser.showDialog(this,"Font Color",Color.red);
				ta.setForeground(c1);
			}
			//zoomin
			if (ae.getSource()==zoomin)
			{
				jb9x();
			}
			//zoomout
			if (ae.getSource()==zoomout)
			{
				jb8x();
			}
			if (ae.getSource()==viewhelp) 
			{
				new tabledata();
			}

		}

		//function
		//new 
		public void jb1x()
		{
				text1 = ta.getText();
				if(text1.length()==0)
				{
					ta.setText(null);
				}
				else{

				JPanel panel2= new JPanel();
				JLabel label2=new JLabel("Do you want to save changes Untitled ?");
				panel2.add(label2);

				int result2 = JOptionPane.showConfirmDialog(null,panel2,"Exit XEditor",JOptionPane.OK_OPTION);

				if(result2 == JOptionPane.OK_OPTION)
				{
					jb3x();
				}
				else{ta.setText(null);}
				
				}
		}
		//open
		public void jb2x()
		{
				JFileChooser fc=new JFileChooser();    
    			
    			int i=fc.showOpenDialog(this);    
    			
    			if(i==JFileChooser.APPROVE_OPTION)
    			{    
        		
        		File f=fc.getSelectedFile();    
        		String filepath=f.getPath();    
        		
        		try
       				{  
        				BufferedReader br=new BufferedReader(new FileReader(filepath));    
        				String s1="",s2=""; 

        				while((s1=br.readLine())!=null)
        					{    
        						s2+=s1+"\n";    
       	 					}   
       	 						System.out.print(f);
       	 						this.setTitle("XEditor - "+f);
        						ta.setText(s2);    
        						br.close();    
        			}
        		catch (Exception ex){}                 
    				}
		}
		//save
		public void jb3x()
		{	
				if (flag != 1) {

				JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Save File");   
 
				int userSelection = fileChooser.showSaveDialog(this);
 
				if (userSelection == JFileChooser.APPROVE_OPTION) 
				{
   				File fileToSave = fileChooser.getSelectedFile();
   				
   					try
   					{
   						FileWriter fw = new FileWriter(fileToSave.getAbsolutePath());
   						data = ta.getText();
   						fw.write(data);
   						fw.close();
   					}
   					catch(IOException fe){}
   					String path = fileToSave.getAbsolutePath();
    				System.out.println("Save as file: " + path);
    				this.setTitle("XEditor - "+path);
									
				}
				flag = 1;
		}
		else{
			System.out.println("OKK");
			flag = 0;
		}
	}

		//close
		public void jb4x()
		{
			JPanel panel= new JPanel();
				JLabel label=new JLabel("You want to exit !");
				panel.add(label);

				int result = JOptionPane.showConfirmDialog(null,panel,"Exit XEditor",JOptionPane.OK_OPTION);

				if(result == JOptionPane.OK_OPTION)
				{
					this.dispose();
				}
		}

		//zoomin
		public void jb9x()
		{
			size=size+2;
			Font displayFont = new Font(Font.SANS_SERIF,Font.PLAIN,size);
			ta.setFont(displayFont);
		}

		//zoomout
		public void jb8x()
		{
			size=size-2;
			Font displayFont = new Font(Font.SANS_SERIF, Font.PLAIN, size);
			ta.setFont(displayFont);
		}


	//main method
	public static void main(String[] args) 
	{	
		SwingUtilities.invokeLater(
    	new Runnable(){
        public void run(){
            XEditor xe = new XEditor();
        	}
    	});
	}
	
	
	
	//Second class for font
	public class XEditorFontFrame extends JPanel
	{
	JLabel lb1,lb2,lb3;JButton b1;List l1,l2;Color c1;JTextField t1;String str;int fontsized;Font f0,f1;
	XEditorFontFrame()
	{
		this.setLayout(new GridLayout(3,2));
		lb1 = new JLabel("Font :");
		this.add(lb1);

		l1 = new List(5,false);
		l1.add("Arial");
		l1.add("Cambria");
		l1.add("Comic Sans MS");
		l1.add("Candara");
		l1.add("MS Reference Sans Serif");
		l1.add("Times New Roman");
		l1.add("Verdana");
		l1.add("Trebuchet MS");
		l1.add("Microsoft Sans Serif");
		l1.add("Monospac821 BT");
		l1.add("BankGothic Lt BT");
		l1.add("Book Antiqua");
		l1.add("Consolas");
		l1.add("Dutch801 XBd BT");
		l1.add("Fixedsys");
		l1.add("Franklin Gothic");
		l1.add("Garamond");
		l1.add("Georgia");
		this.add(l1);

		lb2 = new JLabel("Font Style :");
		this.add(lb2);

		l2 = new List(3,false);
		l2.add("Italic");
		l2.add("Bold");
		l2.add("Plain");
		this.add(l2);

		lb3 = new JLabel("Font Size :");
		this.add(lb3);

		t1 = new JTextField(fontsized);
		this.add(t1);

		int result= JOptionPane.showConfirmDialog(null,this,"Font Style",JOptionPane.OK_OPTION);

		if(result == JOptionPane.OK_OPTION)
		{
			if(t1 != null)
				{	
					fontsized = Integer.parseInt(t1.getText());
				}			

			String st = l1.getItem(l1.getSelectedIndex());
				f0 = new Font(st,Font.BOLD,fontsized);
				ta.setFont(f0);
	

			int st1 = l2.getSelectedIndex();
			if (st1==0) 
			{
				f0 = new Font(st,Font.ITALIC,fontsized);
				ta.setFont(f0);
			}
			if (st1==1) 
			{
				f0 = new Font(st,Font.BOLD,fontsized);
				ta.setFont(f0);
			}
			if (st1==2) 
			{
				f0 = new Font(st,Font.PLAIN,fontsized);
				ta.setFont(f0);
			}
		}

	}
}
}