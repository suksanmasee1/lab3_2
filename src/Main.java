import javax.swing.*;
import java.io.FileReader;

public class Main {

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        Login  loginPanel  = new Login();
        frame.setContentPane(new Login().getMainPanel());
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
