package ru.geekbrains.java.core.classworks.classwork8;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sample {

    public static void main(String[] args) {
        new SampleWindow();
    }

    public static class SampleWindow extends JFrame {
        private int counter;

        public SampleWindow() throws HeadlessException {
            setSize(640, 480);
            setDefaultCloseOperation(EXIT_ON_CLOSE);
//            setLocation(1000, 1000);
            setLocationRelativeTo(null);
            setTitle("My sample window");
            JPanel panel = new JPanel();
            panel.setLayout(new FlowLayout());
            JButton button1 = new JButton("BUTTON");
            JButton button2 = new JButton("EXTRA");
            panel.add(button1);
            panel.add(button2);
            add(panel, BorderLayout.NORTH);
            JLabel label = new JLabel("Press the button");
            label.setFont(new Font("Arial", Font.BOLD, 60));
            add(label);

            button1.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    label.setText("COUNTER: " + --counter);
                }
            });

            button2.addActionListener(e -> label.setText("COUNTER: " + ++counter));
            repaint();
            setVisible(true);
        }
    }
}
