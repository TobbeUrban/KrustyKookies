package dbtLab3;

import javax.swing.JComponent;

public class WelcomePane extends BasicPane implements Pane {

	public WelcomePane(Database db) {
		super(db);
		// TODO Auto-generated constructor stub
	}

	public void entryActions() {
		clearMessage();
		displayMessage("To exit click the x in the top right corner.");
	}

	public JComponent createTopPanel() {
		return messageLabel;
	}
	
	public void welcome(){
		displayMessage("Welcome! Please choose a tab for your needs.");
	}

}
