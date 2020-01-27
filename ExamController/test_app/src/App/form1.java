package App;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class form1 {
    private JButton OKButton;
    private JTextArea textArea1;
    private JPanel panel;
    int a = 0;

    public form1() {
        OKButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(a == 0){
                    textArea1.setText("Hello World!");
                    JOptionPane.showConfirmDialog(null, "Hello World :)");
                    a = 1;
                }
                else{
                    textArea1.setText("Goodbye World!");
                    JOptionPane.showConfirmDialog(null, "Bye World :(");
                    a = 0;
                }
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setContentPane(new form1().panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
