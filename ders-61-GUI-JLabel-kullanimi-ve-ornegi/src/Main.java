import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // JLabel


        JFrame f = new JFrame("Label Örneği");
        JLabel l1 = new JLabel("Yazı kısmı");       // butonda yaptıgımız gibi l1.setText("Yazı kısmı") diyerek de isim verebiliriz
        l1.setBounds(100,50,200,30);

        JButton btn = new JButton("Değiştir");
        btn.setBounds(100,100,100,30);
        btn.addActionListener(new ActionListener() {
            int c = 1 ;
            @Override
            public void actionPerformed(ActionEvent e) {
                l1.setText("Butona " + c++  + " kez tıklandı!");
            }
        });



        f.add(btn);
        f.add(l1);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);

    }
}