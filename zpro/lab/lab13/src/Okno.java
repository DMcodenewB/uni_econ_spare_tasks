import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Okno extends JFrame {

    JButton btnKlik;
    JTextField txtOne;
    JTextField txtTwo;

    Okno(){
        int y = Toolkit.getDefaultToolkit().getScreenSize().height;
        int x = Toolkit.getDefaultToolkit().getScreenSize().width;

        this.setBounds(x/4, y/4, x/2, y/2);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();
    }

    private void initComponent(){
        btnKlik = new JButton("Ok");
        btnKlik.setBounds(240,20,100,50);
        txtOne = new JTextField();
        txtOne.setBounds(20,20,200,50);
        txtTwo = new JTextField();
        txtTwo.setBounds(20,100,200,50);
        this.setLayout(null);
        this.add(btnKlik);
        this.add(txtOne);
        this.add(txtTwo);


        btnKlik.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String txt = txtOne.getText();
                txtOne.setText("");
                txtTwo.setText(txt);
            }
        });
    }

}
