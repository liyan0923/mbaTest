package com.santian.test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class MyGui implements MouseListener {
    JButton button;


    public static void main(String[] args) {
        MyGui gui=new MyGui();
        gui.go();


    }

    public void go(){
        JFrame frame=new JFrame();
        button=new JButton("click me");
        button.addMouseListener(this);
        Gdraw draw1=new Gdraw();
        frame.getContentPane().add(draw1);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        frame.getContentPane().add(button);

        frame.setSize(400,300);
        frame.setVisible(true);
    }

    public class Gdraw extends JPanel {

        public void paintComponent(Graphics g){

            g.setColor(Color.yellow);
            g.fillRect(20,50,200,200);

        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        button.setText("clicked");

    }

    @Override
    public void mousePressed(MouseEvent e) {
        button.setText("pressed");
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        button.setText("released");
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        button.setText("laile");
    }

    @Override
    public void mouseExited(MouseEvent e) {
        button.setText("mouse zoule");
    }
}
