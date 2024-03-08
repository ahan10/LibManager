package org.team4.controller.managerdashboard;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.team4.maintaindb.MaintainDatabase;
import org.team4.model.items.Book;
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
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == this.addItemPanel.getBookButton()) {
			this.addItemPanel.changeToBook();
			
		}else if(e.getSource() == this.addItemPanel.getAddBookPanel().getAddButton()) {
			MaintainDatabase.getInstance().getBookDatabase().addBook((Book) this.addItemPanel.getAddBookPanel().getBook());
		}
	}

}
