package org.team4;

import org.team4.controller.login.LoginController;
import org.team4.maintaindb.MaintainDatabase;
import org.team4.maintaindb.MaintainUser;
import org.team4.view.login.LoginPage;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.println("Hello and welcome!");

//        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }

        LoginPage loginPage = new LoginPage();
        loginPage.setVisible(true);
        MaintainUser maintainUser = MaintainDatabase.getInstance().getUserDatabase();
        @SuppressWarnings("unused")
        LoginController controller = new LoginController(loginPage, maintainUser);

    }
}