import java.awt.*;
import javax.swing.*;

public class tabledata extends JPanel
{	
	tabledata()
	{
		Image img = Toolkit.getDefaultToolkit().getImage("logo.png");

		String[] columnNames = {	"Name","Shortcut"	};

        String[][] data =	{
    							{"New","Ctrl+N"},
    							{"Open","Ctrl+O"},
    							{"Save","Ctrl+S"},
    							{"Exit","Ctrl+E"},
    							{"Undo","Ctrl+U"},
    							{"Redo","Ctrl+R"},
    							{"Cut","Ctrl+X"},
    							{"Copy","Ctrl+C"},
    							{"Paste","Ctrl+V"},
    							{"Delete","Ctrl+D"},
    							{"Select All","Ctrl+A"},
    							{"Font","Ctrl+F"},
    							{"Background","Ctrl+B"},
    							{"Font Color","Ctrl+L"},
    							{"Zoom In","Ctrl+P"},
    							{"Zoom Out","Ctrl+M"},
    							{"View Help","Ctrl+H"},
    						};

    	JTable table= new JTable(data,columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		table.setEnabled(false);
	
		this.add(scrollPane);

    	JOptionPane.showMessageDialog(null,this,"View Help",JOptionPane.CLOSED_OPTION);

	}
}