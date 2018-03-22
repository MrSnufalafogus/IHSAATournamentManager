//Written by Justin

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller implements ActionListener{
	
	private static Model model;
	private static View view;
	
	public static void main(String[] args){
		model = new Model();
		
		view = new View(model);
		view.setVisible(true);
	}
	
	
	@Override
	public void actionPerformed(ActionEvent e) {
		//Performs appropriate action whenever View fires an event
		
		
		if (e.getActionCommand().equals("Search")){
			//Opens a search window
			SearchView sView = new SearchView(model);
			
			
		} else if (e.getActionCommand().equals("Collapse All")){
			//runs through each row and collapses it
			for (int i = view.getTree().getRowCount(); i > 0; i--) {
		         view.getTree().collapseRow(i);
			}
			
			
			
		} else if (e.getActionCommand().equals("Exit")){
			//Exits the program
			System.exit(0);
		}
	}

}
