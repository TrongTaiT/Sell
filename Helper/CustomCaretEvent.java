/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.awt.Color;
import java.awt.Font;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.text.JTextComponent;

/**
 *
 * @author trongtai
 */
public class CustomCaretEvent implements CaretListener {

    @Override
    public void caretUpdate(CaretEvent e) {
        // get the source cause the event
        JTextComponent txtField = (JTextComponent) e.getSource();

        if (txtField.getText().trim().equals(txtField.getToolTipText())) {
//            txtField.setText("");
            txtField.setCaretPosition(0);
            txtField.setForeground(Color.red);
            Font font = txtField.getFont();
            font = font.deriveFont(Font.ITALIC);
            txtField.setFont(font);
            System.out.println("1");
        } else if (txtField.getText().trim().equals("")) {
//            txtField.setText(txtField.getToolTipText());
            txtField.setForeground(Color.BLACK);
            Font font = txtField.getFont();
            font = font.deriveFont(Font.PLAIN);
            txtField.setFont(font);
            System.out.println("2");
        } else {
            txtField.setForeground(Color.BLACK);
            Font font = txtField.getFont();
            font = font.deriveFont(Font.PLAIN);
            txtField.setFont(font);
            System.out.println("3");
        }

//        if (txtField.getText().trim().equals(txtField.getToolTipText())) {
//            txtField.setCaretPosition(0);
//            txtField.setForeground(Color.GRAY);
//            Font font = txtField.getFont();
//            font = font.deriveFont(Font.ITALIC);
//            txtField.setFont(font);
//            System.out.println("1");
////            return;
//        } else if (txtField.getText().equals("")) {
//            txtField.setText(txtField.getToolTipText());
//            txtField.setForeground(Color.GRAY);
//            Font font = txtField.getFont();
//            font = font.deriveFont(Font.ITALIC);
//            txtField.setFont(font);
//            System.out.println("2");
//            return;
//        } else { //(!txtField.getText().trim().equals(txtField.getToolTipText()))
//            txtField.setForeground(Color.BLACK);
//            Font font = txtField.getFont();
//            font = font.deriveFont(Font.PLAIN);
//            txtField.setFont(font);
//            System.out.println("3");
//        }
    }

}
