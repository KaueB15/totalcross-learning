package br.com.kaue.view;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Edit;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;
import totalcross.ui.Toast;
import totalcross.ui.gfx.Color;

public class LoginView extends Container {
    private Label mainLabel = new Label("Login");
    private Edit userName = new Edit();
    private Edit password = new Edit();
    private Button loginButton = new Button("Logar");

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
            if(userName.getText().equals("admin") && password.getText().equals("123")) {
                MainWindow.getMainWindow().swap(new DashboardView());
            } else {
                Toast.show("Usuário ou senha inválidos", 1000);
            }
        });

    }
}
