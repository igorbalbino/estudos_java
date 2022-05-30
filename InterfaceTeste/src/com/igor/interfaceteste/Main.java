package com.igor.interfaceteste;

import javafx.scene.layout.BorderPane;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main implements ActionListener {

    private JFrame frame;
    private JLabel label;
    private JPanel panel;
    private int count = 0;

    public Main(){
        frame = new JFrame();

        JButton btn = new JButton("butao");
        btn.addActionListener(this);
        label = new JLabel("num clicks: ");

        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(30,30,10,30));
        panel.setLayout(new GridLayout(0,1));
        panel.add(btn);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("My GUI");
        frame.pack();
        frame.setVisible(true);
    }

    public static void main(String[] args) {
	    new Main();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count++;
        label.setText("nnum clicks: " + count);
    }
}
