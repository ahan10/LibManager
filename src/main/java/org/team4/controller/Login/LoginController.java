package org.team4.controller.Login;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;

import org.team4.controller.managerdashboard.ManagerController;
import org.team4.maintaindb.MaintainUser;
import org.team4.model.user.User;
import org.team4.view.Login.LoginPage;
import org.team4.view.Manager.ManagerDashboard;

public class LoginController implements ActionListener {
	private LoginPage loginPage;
	private MaintainUser maintainUser;

	public LoginController(LoginPage loginPage, MaintainUser maintainUser) {
		this.loginPage = loginPage;
		this.maintainUser = maintainUser;
		addListeners();
	}

	/**
	 * Checks if password contains at least 1 upper case letter, lower case letter,
	 * number, and symbol
	 * 
	 * @param password
	 * @return
	 */
	private boolean checkPasswordStrength(String password) {
		char ch;
		boolean upperCaseFlag = false;
		boolean lowerCaseFlag = false;
		boolean numberFlag = false;
		boolean symbolFlag = false;
		for (int i = 0; i < password.length(); i++) {
			ch = password.charAt(i);
			if (Character.isDigit(ch)) {
				numberFlag = true;
			} else if (Character.isUpperCase(ch)) {
				upperCaseFlag = true;
			} else if (Character.isLowerCase(ch)) {
				lowerCaseFlag = true;
			} else {
				symbolFlag = true;
			}
		}

		return upperCaseFlag & lowerCaseFlag & numberFlag & symbolFlag;
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
							@SuppressWarnings("unused") ManagerController controller = new ManagerController(frame);
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
			if (loginPage.getUserNameInput().length() == 0
					|| loginPage.getUserNameInput().equals("Name")
					|| loginPage.getRegisterEmailInput().length() == 0
					|| loginPage.getRegisterEmailInput().equals("Email")
					|| loginPage.getRegisterPasswordInput().length() == 0
					|| loginPage.getRegisterPasswordInput().equals("Password")) {
				System.out.println("Missing Input Fields");
				JOptionPane.showMessageDialog(loginPage,
						"Registration Failed!\nPlease ensure all fields are filled in properly");
			} else {
				boolean flag = false;
				for (User u : maintainUser.users) {
					if (u.getEmail().equals(loginPage.getRegisterEmailInput())) {
						flag = true;
						System.out.println("Account with email " + u.getEmail() + " already exists");
						JOptionPane.showMessageDialog(loginPage, "Account with email " + u.getEmail()
								+ " already exists\nTry logging in or use a different email");
						break;
					}
				}
				if (flag == false) {
					System.out.println("Email doesnt already exist, still need to check other credentials");
					if (checkPasswordStrength(loginPage.getRegisterPasswordInput())) {
						System.out.println("Password Strong");
						maintainUser.addUser(new User(loginPage.getRegisterEmailInput(), loginPage.getRegisterPasswordInput(), loginPage.getUserNameInput(), loginPage.getRegisterAccountType()));
						System.out.println("New User Registered");
					} else {
						System.out.println("Password Weak");
						JOptionPane.showMessageDialog(loginPage,
								"Registration Failed!\nPlease ensure password contains at least 1 uppercase letter, lowercase letter, number, and symbol");
					}
				}
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
