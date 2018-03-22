//Written by Justin

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;

public class SearchView extends JFrame{
	//Simple GUI, much potential
	
	private static final long serialVersionUID = 1L;
	private JTextField txtSearch;
	
	public SearchView(Model model){
		setTitle("Search");
		getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		setVisible(true);
		
		txtSearch = new JTextField();
		getContentPane().add(txtSearch);
		txtSearch.setColumns(10);
		
		JButton btnSearch = new JButton("Search");
		getContentPane().add(btnSearch);
		
	}
		
}
