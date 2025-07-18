import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main {
    public static void main(String[] args) {
        // JButton
        // btn.setBounds(x,y,width,height);

        JFrame f= new JFrame("Buton Örneği");

        JButton btn = new JButton();
        btn.setText("Gönder");      //JButton("Gönder")   ile aynı işlev
        btn.setBounds(100,100,100,30);

        //butona tıkladıktan sonra yapılacak aksiyonları ekleyelim
        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("Butona tıklandı");
            }
        });


        f.add(btn);
        f.setSize(400,400);
        f.setLayout(null);
        f.setVisible(true);


    }
}