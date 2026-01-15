package br.com.kaue;
import totalcross.ui.MainWindow;
import totalcross.ui.Label;
import totalcross.sys.Settings;
public class manager extends MainWindow {
    
    public manager() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        Label helloWord = new Label("Hello World!");
        add(helloWord, CENTER, CENTER);
    }
}
