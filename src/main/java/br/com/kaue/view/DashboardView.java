package br.com.kaue.view;

import totalcross.ui.Button;
import totalcross.ui.Container;
import totalcross.ui.Label;
import totalcross.ui.MainWindow;

public class DashboardView extends Container {

    private Label mainLabel = new Label("Bem-vindo ao sistema!");
    private Button exitButton = new Button("Sair");

    @Override
    public void initUI() {
        add(mainLabel, CENTER, CENTER);

        add(exitButton, CENTER, BOTTOM - 50);

        exitButton.addPressListener(event -> {
            MainWindow.getMainWindow().swap(new LoginView());
        });
    }
}
