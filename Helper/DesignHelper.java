/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.text.JTextComponent;

/**
 *
 * @author NguyenTruongChinh
 */
public class DesignHelper {

    public static void hoverMenuEnter(JLabel label, JPanel panel) {
        label.setForeground(new Color(0, 0, 255));
        panel.setBackground(new Color(204, 204, 255));
        label.setCursor(new Cursor(Cursor.HAND_CURSOR));
    }

    public static void hoverMenuExit(JLabel label, JPanel panel) {
        label.setForeground(new Color(255, 255, 255));
        panel.setBackground(new Color(0, 153, 255));
    }

    public static void addPlaceHolderTextField(JTextComponent textField) {
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }
    
    public static void addPlaceHolderTextField(JTextComponent textField, String placeholderString) {
        textField.setText(placeholderString);
        Font font = textField.getFont();
        font = font.deriveFont(Font.ITALIC);
        textField.setFont(font);
        textField.setForeground(Color.GRAY);
    }

    public static void deletePlaceHolderTextField(JTextComponent textField) {
        textField.setText("");
        Font font = textField.getFont();
        font = font.deriveFont(Font.PLAIN);
        textField.setFont(font);
        textField.setForeground(Color.BLACK);
    }

    public static void setTable(JTable table) {
        table.getTableHeader().setFont(new Font("Segoe UI", Font.BOLD, 14));
        table.getTableHeader().setBackground(new Color(255, 102, 0));
        table.getTableHeader().setForeground(Color.WHITE);
        table.setSelectionBackground(new Color(51, 102, 255));
        table.setSelectionForeground(new Color(255, 255, 255));
        table.setGridColor(new Color(255, 255, 255));
        table.setRowHeight(25);
    }

    public static void setButtonBackgroundColor(JButton button, Color enabledColor, Color unenabledColor) {
        if (button.isEnabled()) {
            button.setBackground(enabledColor);
        } else {
            button.setBackground(unenabledColor);
        }
    }

    public static void setButtonBackgroundColor(Color enabledColor, Color unenabledColor, JButton... buttons) {
        for (JButton button : buttons) {
            if (button.isEnabled()) {
                button.setBackground(enabledColor);
            } else {
                button.setBackground(unenabledColor);
            }
        }
    }    
   
    public static void first(int row) {
        row = 0;
    }

    public static void prev(int row) {
        if (row > 0) {
            row--;
        }
    }

    public static void next(int row, JTable table) {
        if (row < table.getRowCount() - 1) {
            row++;
        }
    }

    public static void last(int row, JTable table) {
        row = table.getRowCount() - 1;
    }
}
