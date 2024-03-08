package org.team4.controller.managerdashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.view.manager.add.AddItemPanel;

public class AddItemController implements ActionListener{
	
	private AddItemPanel addItemPanel;
	
	public AddItemController(AddItemPanel addItemPanel) {
		this.addItemPanel = addItemPanel;
		addListeners();
	}
	
	private void addListeners() {
		
		this.addItemPanel.getBookButton().addActionListener(this);
		this.addItemPanel.getDvdButton().addActionListener(this);
		this.addItemPanel.getMagazineButton().addActionListener(this);
		
		this.addItemPanel.getAddBookPanel().getAddButton().addActionListener(this);
		this.addItemPanel.getAddDVDPanel().getAddButton().addActionListener(this);
		this.addItemPanel.getAddMagazinePanel().getAddButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.addItemPanel.getBookButton()) {
			
			this.addItemPanel.changeToBook();
			
		}else if(e.getSource() == this.addItemPanel.getDvdButton()) {
			
			this.addItemPanel.changeToDVD();
			
		}else if(e.getSource() == this.addItemPanel.getMagazineButton()) {
			
			this.addItemPanel.changeToMagazine();
			
		}else if(e.getSource() == this.addItemPanel.getAddBookPanel().getAddButton()) {
			
			MaintainDatabase.getInstance().getBookDatabase().addBook(this.addItemPanel.getAddBookPanel().getBook());
			JOptionPane.showMessageDialog(null, "Added a Book.");
			
		}else if(e.getSource() == this.addItemPanel.getAddDVDPanel().getAddButton()) {
			
			MaintainDatabase.getInstance().getDVDDatabase().addDVD(this.addItemPanel.getAddDVDPanel().getDVD());
			JOptionPane.showMessageDialog(null, "Added a DVD.");
			
		}else if(e.getSource() == this.addItemPanel.getAddMagazinePanel().getAddButton()) {
			
			MaintainDatabase.getInstance().getMagazineDatabase().addMagazine(this.addItemPanel.getAddMagazinePanel().getMagazine());
			JOptionPane.showMessageDialog(null, "Added a Magazine.");
		}
	}

}
