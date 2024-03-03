package org.team4.controller.authentication;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.team4.view.authentication.AuthFrame;

public class AuthController implements ActionListener {

    private AuthFrame authFrame;

    public AuthController(AuthFrame authFrame) {
        this.authFrame = authFrame;

        // Add action listeners to the buttons in the authentication frame
        authFrame.getLoginPanel().getLoginButton().addActionListener(this);
        authFrame.getLoginPanel().getRegisterationButton().addActionListener(this);

        authFrame.getRegisterationPanel().getLoginButton().addActionListener(this);
        authFrame.getRegisterationPanel().getRegisterButton().addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == authFrame.getLoginPanel().getLoginButton()) {
            // Implement login logic here
        } else if (e.getSource() == authFrame.getLoginPanel().getRegisterationButton()) {
            authFrame.showRegisterPanel();
        } else if (e.getSource() == authFrame.getRegisterationPanel().getLoginButton()) {
            authFrame.showLoginPanel();
        } else if (e.getSource() == authFrame.getRegisterationPanel().getRegisterButton()) {
            // Implement registration logic here
        }
    }
}
