import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;

public class Okno3 extends JFrame {

    JButton btnOk;
    JTextField txtPass;
    JTextField txtLogin;
    JTextField txtUrl;
    JTextField txtInfo;

    Okno3(){
        int y = Toolkit.getDefaultToolkit().getScreenSize().height;
        int x = Toolkit.getDefaultToolkit().getScreenSize().width;

        this.setBounds(x/4, y/4, x/2, y/2);
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponent();
    }

    private void initComponent(){
        btnOk = new JButton("Ok");
        btnOk.setBounds(320,20,100,50);
        txtPass = new JTextField();
        txtPass.setBounds(20,180,200,50);
        txtPass.setText("enter Pass");
        txtLogin = new JTextField();
        txtLogin.setBounds(20,100,200,50);
        txtLogin.setText("enter Login");
        txtUrl = new JTextField();
        txtUrl.setBounds(20,20,200,50);
        txtUrl.setText("enter Url");
        txtInfo = new JTextField();
        txtInfo.setBounds(320, 100,200,100);
        this.setLayout(null);
        this.add(btnOk);
        this.add(txtLogin);
        this.add(txtPass);
        this.add(txtUrl);
        this.add(txtInfo);

        btnOk.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    Connection conn = DriverManager.getConnection(txtUrl.getText(), txtLogin.getText(), txtPass.getText());
                    txtInfo.setText("ok");
                } catch (SQLException ex){
                    txtInfo.setText(ex.getMessage());
                }
            }
        });

    }
}
