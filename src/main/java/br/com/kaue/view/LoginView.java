package br.com.kaue.view;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.Toast;
import totalcross.ui.gfx.Color;

public class LoginView extends Container {
    Label mainLabel = new Label("Login");
    Edit userName = new Edit();
    Edit password = new Edit();
    Button loginButton = new Button("Logar");

    @Override
    public void initUI() {
        add(mainLabel, CENTER, TOP + 100);

        userName.caption = "username";
        add(userName, CENTER, AFTER + 100);

        password.caption = "password";
        password.setMode(Edit.PASSWORD);
        add(password, CENTER, AFTER + 40);

        loginButton.setBackColor(Color.CYAN);
        loginButton.setForeColor(Color.WHITE);
        add(loginButton, CENTER, AFTER + 80);

        loginButton.addPressListener(event -> {
            Toast.show(userName.getText(), 2000);
        });

    }
}
