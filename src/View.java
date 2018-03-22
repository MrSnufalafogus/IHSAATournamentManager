//Written by Justin

import java.util.Observable;
import java.util.Observer;

import javax.swing.JFrame;
import javax.swing.JScrollPane;

import java.awt.GridLayout;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.DefaultTreeCellRenderer;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;

public class View extends JFrame implements Observer{
	private static final long serialVersionUID = 1L;
	
	private Model theModel;
	private JTree tree;
	
	public View(Model model){
		
		theModel = model;
		theModel.addObserver(this);
		setBounds(200, 200, 300, 200);
		setTitle("View");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		
		createTree();
		
		JScrollPane treePane = new JScrollPane(tree);
		getContentPane().add(treePane);
		
		//Creates Menu Bar
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		JMenu mnFile = new JMenu("File");
		mnFile.setMnemonic('F');
		menuBar.add(mnFile);
		
		// Creates Menu Items
		JMenuItem mntmSearch = new JMenuItem("Search");
		mnFile.add(mntmSearch);
		mntmSearch.addActionListener(new Controller());
		JMenuItem mntmCollapseAll = new JMenuItem("Collapse All");
		mnFile.add(mntmCollapseAll);
		mntmCollapseAll.addActionListener(new Controller());
		JMenuItem mntmExit = new JMenuItem("Exit");
		mnFile.add(mntmExit);
		mntmExit.addActionListener(new Controller());
		
		
		setVisible(true);
		
		
		
		
	}
	
	private void createTree(){
		//creates a tree with the root node: Tournament
		//Tournament branches to the competition levels
		//Levels branch to the host schools
		//The host schools branch to all participating schools
		
		
		DefaultMutableTreeNode root = new DefaultMutableTreeNode("Tournament");
		DefaultMutableTreeNode level;
		DefaultMutableTreeNode host;
		DefaultMutableTreeNode school;
		
		level = new DefaultMutableTreeNode("Sectionals");
		root.add(level);
		
		for (int i = 0; i < theModel.getSectionalHosts().length; i++){
			host = new DefaultMutableTreeNode(theModel.getSectionalHosts()[i]);		//Creates and adds a host node to the sectional node
			level.add(host);
			for (int j = 0; j < theModel.getSectionals()[i].length; j++){
				school = new DefaultMutableTreeNode(theModel.getSectionals()[i][j]);//Fills the host node with the list of schools participating
				host.add(school);
			}
		}
		
		
		level = new DefaultMutableTreeNode("Regionals");
		root.add(level);
		level = new DefaultMutableTreeNode("Semi-States");
		root.add(level);
		level = new DefaultMutableTreeNode("State Finals");
		root.add(level);
		
		tree = new JTree(root);
		tree.setShowsRootHandles(true);
		
		//Turns off icons
		DefaultTreeCellRenderer renderer = (DefaultTreeCellRenderer) tree.getCellRenderer();
        renderer.setLeafIcon(null);
        renderer.setClosedIcon(null);
        renderer.setOpenIcon(null);
	}
	
	public JTree getTree(){
		return tree;
	}
	
	
	
	
	@Override
	public void update(Observable arg0, Object arg1) {
		
	}
}
