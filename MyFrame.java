package com.company;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

class MyFrame extends JFrame {


    private JTextArea textArea;
    private JButton btn;

    MyFrame() {
        super("zxcShadowFiend");


        setLayout(new BorderLayout());

        textArea = new JTextArea();
        btn = new JButton("F9");

        add(textArea, BorderLayout.CENTER);
        add(btn, BorderLayout.SOUTH);


        btn.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent arg0) {
                textArea.append("???\n");

                setSize(600, 400);
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                setVisible(true);
            }

        });
        setSize(600, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);

        }
    }