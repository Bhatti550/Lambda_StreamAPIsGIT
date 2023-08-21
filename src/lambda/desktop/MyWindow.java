package lambda.desktop;

import javax.swing.*;
import java.awt.*;
public class MyWindow {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame("Login");
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
        JButton button=new JButton("Click Me");
        jFrame.setSize(400,400);
        jFrame.setLayout(new FlowLayout());
        jFrame.add(button);

        button.addActionListener(e->{
                System.out.println("Button Clicked.");
                JOptionPane.showMessageDialog(null,"You Clicked On Button.");
            });

    }
}
