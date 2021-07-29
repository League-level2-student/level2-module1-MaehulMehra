package _02_array_list_guestbook;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class GuestBook implements ActionListener {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	JFrame frame = new JFrame ();
	JPanel panel = new JPanel ();
	JButton addButton = new JButton ("Add a Name");
	JButton viewButton = new JButton ("View the names");
	ArrayList<String> names = new ArrayList<String> ();
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
void createGUI () {
	frame.setVisible(true);
	frame.add(panel);
	panel.add(addButton);
	panel.add(viewButton);
	frame.pack();
	addButton.addActionListener(this);
	viewButton.addActionListener(this);
}
@Override
public void actionPerformed(ActionEvent arg0) {
	JButton buttonPressed = (JButton) arg0.getSource();
	if (buttonPressed == addButton) {
		String name = JOptionPane.showInputDialog(null, "Enter a name");
		names.add(name);
	}
	else if (buttonPressed == viewButton) {
		String endResult = "";
		int guestNum = 1;
		for (int i = 0; i < names.size(); i++){
		endResult += "Guest #" + guestNum + ": " + names.get(i) + "\n";
		guestNum++;
		}
		JOptionPane.showMessageDialog(null, endResult);
	}
	
	// TODO Auto-generated method stub
	
}
}

