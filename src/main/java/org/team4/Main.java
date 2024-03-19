package org.team4;

import org.team4.controller.login.LoginController;
import org.team4.view.login.LoginPage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        @SuppressWarnings("unused")
        LoginController controller = new LoginController(loginPage);

    }
}