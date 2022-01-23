import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Okno2 extends JFrame {

    JButton btnUp;
    JButton btnDown;
    JTextField txtLow;
    JTextField txtHigh;

    Okno2(){
        int y = Toolkit.getDefaultToolkit().getScreenSize().height;
        int x = Toolkit.getDefaultToolkit().getScreenSize().width;

        this.setBounds(x/4, y/4, x/2, y/2);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();
    }

    private void initComponent(){
        btnUp = new JButton("Up");
        btnUp.setBounds(20,100,100,50);
        btnDown = new JButton("Down");
        btnDown.setBounds(20,20,100,50);
        txtLow = new JTextField();
        txtLow.setBounds(140,100,200,50);
        txtHigh = new JTextField();
        txtHigh.setBounds(140,20,200,50);
        this.setLayout(null);
        this.add(btnUp);
        this.add(btnDown);
        this.add(txtHigh);
        this.add(txtLow);

        btnUp.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = txtLow.getText();
                txtLow.setText("");
                txtHigh.setText(text);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });

        btnDown.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                String text = txtHigh.getText();
                txtHigh.setText("");
                txtLow.setText(text);
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
    }
}
