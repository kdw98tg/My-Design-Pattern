package src.observer.swing;

import javax.swing.*;
import java.awt.*;

public class SwingObserverExample {
    private JFrame jFrame;

    public static void main(String[] args) {
        SwingObserverExample example = new SwingObserverExample();
        example.go();
    }

    public void go() {
        jFrame = new JFrame();

        JButton button = new JButton("Should I do it?");

        button.addActionListener(event ->
                System.out.println("하지마, 후회할거야.")
        );
        button.addActionListener(event ->
                System.out.println("어서 해버려")
        );
        jFrame.getContentPane().add(BorderLayout.CENTER,button);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.getContentPane().add(BorderLayout.CENTER, button);
        jFrame.setSize(300,300);
        jFrame.setVisible(true);
    }


}
