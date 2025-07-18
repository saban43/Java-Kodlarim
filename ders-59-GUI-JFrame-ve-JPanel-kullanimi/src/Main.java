import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        // Graphical User Interface (GUI)
        // Swing : Sun Microsystems tarafından piyasaya sürülen resmi Java GUI aracıdır.

        JFrame frame = new JFrame();
        frame.setSize(300,300);


        JPanel panel = new JPanel();
        JButton btn = new JButton("Button");
        panel.add(btn);


        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}