import java.io.IOException;
import java.util.Locale;

public class RunForm {
    public static void main(String[] args) throws IOException {

        Locale.setDefault(Locale.ROOT);

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
    }
}
