package org.team4.controller.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.team4.controller.managerdashboard.ManagerController;
import org.team4.maintaindb.MaintainUser;
import org.team4.model.user.User;
import org.team4.view.Login.LoginPage;
import org.team4.view.Manager.ManagerDashboard;

public class LoginController implements ActionListener{
	private LoginPage loginPage;
	private MaintainUser maintainUser;
	
	public LoginController(LoginPage loginPage, MaintainUser maintainUser) {
		this.loginPage = loginPage;
		this.maintainUser = maintainUser;
		addListeners();
	}
	
	private void addListeners() {
		loginPage.getLoginButton().addActionListener(this);
		loginPage.getRegisterButton().addActionListener(this);
		loginPage.getCreateAccountButton().addActionListener(this);
		loginPage.getAlreadyHaveAccountButton().addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == loginPage.getLoginButton()) {
			boolean flag = false;
			for (User u : maintainUser.users) {
				if (u.getEmail().equals(loginPage.getEmailInput())) {
					flag = true;
					if (u.getPassword().equals(loginPage.getPasswordInput())) {
						/**
						 * Email found and Correct Password Provided Move to home page
						 */
						loginPage.getPasswordWarning().setVisible(false);
						switch (u.getType()) {
						case "STUDENT":
							System.out.println(u.toString() + " Logged in Successfully as Student");
							break;
						case "FACULTY":
							System.out.println(u.toString() + " Logged in Successfully as Faculty");
							break;
						case "NONFACULTY":
							System.out.println(u.toString() + " Logged in Successfully as Non-Faculty");
							break;
						case "MANAGER":
							System.out.println(u.toString() + " Logged in Successfully as Manager");
							// TEMPORARY METHOD FOR OPENING MANAGERDASHBOARD
							ManagerDashboard frame = new ManagerDashboard();
							frame.setLocationRelativeTo(null);
							frame.setVisible(true);
							ManagerController controller = new ManagerController(frame);
							loginPage.setVisible(false);
							break;
						case "VISITOR":
							System.out.println(u.toString() + " Logged in Successfully as Visitor");
							break;
						}

					} else {
						loginPage.getPasswordWarning().setVisible(true);
						loginPage.getEmailWarning().setVisible(false);
						System.out.println(u.toString() + " Incorrect Password");
					}
				}

			}
			if (flag == false) {
				loginPage.getEmailWarning().setVisible(true);
				System.out.println("Account not found\nPlease make sure you have entered the correct Email");
			}
		}
		
		else if (e.getSource() == loginPage.getCreateAccountButton()) {
			boolean flag = false;
			for (User u : maintainUser.users) {
				if (u.getEmail().equals(loginPage.getRegisterEmailInput())) {
					flag = true;
					System.out.println("Account with email " + u.getEmail() + " already exists");
				}
			}
			if (flag == false) {
				System.out.println("Email doesnt already exist, still need to check other credentials");
			}

			}
		
		else if (e.getSource() == loginPage.getRegisterButton()) {
			System.out.println("User attempted to Register");
			loginPage.showRegistrationPage();
		}
		
		else if (e.getSource() == loginPage.getAlreadyHaveAccountButton()) {
			System.out.println("User wishes to login to existing account");
			loginPage.showLoginPage();
		}

	}
	

}
