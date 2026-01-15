package br.com.kaue;
import totalcross.ui.MainWindow;
import br.com.kaue.view.LoginView;
import totalcross.sys.Settings;
public class manager extends MainWindow {
    
    public manager() {
        setUIStyle(Settings.MATERIAL_UI);
    }

    @Override
    public void initUI() {
        LoginView login = new LoginView();
        add(login, LEFT, TOP, PARENTSIZE, PARENTSIZE);
    }
}
