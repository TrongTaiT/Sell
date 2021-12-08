/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Dev-StOrM
 */
public class ValidationHelper {

    public static Color validColor = new Color(54, 215, 183);
    public static Color errorColor = new Color(245, 230, 83);

    // need additional method trim();
    static public boolean isNotNullField(Component component, JTextComponent txt,
            String fieldName, String placeholder) {
        
        // check null
        if (txt.getText().trim().equals("") || txt.getText().trim().equals(placeholder)) {
            MsgBox.alert(component, "Nhập " + fieldName + "!");
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;

    }

    static public boolean isValidPassword(Component component, JPasswordField pwd,
            String fieldName, String placeholder) {

        String password = new String(pwd.getPassword());
        // check null
        if (password.equals("") || password.equals(placeholder)) {
            MsgBox.alert(component, "Nhập " + fieldName + "!");
            pwd.setBorder(new LineBorder(errorColor));
            return false;
        }

        // check length (regex contains check length but to visualize to user, it must have another check length)
        if (password.length() < 8 || password.length() > 36) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải có độ dài từ 8 đến 36 kí tự");
            pwd.setBorder(new LineBorder(errorColor));
            return false;
        }

        // check regex (if not strictly follow the rules in regex, this can be commented to remove)
        if (RegexValidation.isValidPassword(password) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải chứa ít nhất một kí tự: viết thường VÀ số VÀ "
                    + "viết hoa VÀ đặc biệt ('!','@','#','&','(',')'...)");
            pwd.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        pwd.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isValidName(Component component, JTextComponent txt,
            String fieldName, String placeholder) {

        // check null
        if (ValidationHelper.isNotNullField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check regex
        if (RegexValidation.isValidName(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isValidPhoneNumber(Component component, JTextComponent txt,
            String fieldName, String placeholder) {

        // check null
        if (ValidationHelper.isNotNullField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check regex
        if (RegexValidation.isValidPhoneNumber(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isValidEmail(Component component, JTextComponent txt,
            String fieldName, String placeholder) {

        // check null
        if (ValidationHelper.isNotNullField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check regex
        if (RegexValidation.isValidEmail(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isNumberField(Component component, JTextComponent txt,
            String fieldName, String placeholder) {

        // check null
        if (isNotNullField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check valid number
        try {
            Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải là số");
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isNumberField(Component component, JTextComponent txt,
            String fieldName, String placeholder, Double min) {

        // check numberfield
        if (isNumberField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check condition : greater than min
        boolean condition = (Double.parseDouble(txt.getText()) > min);
        if (condition == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải lớn hơn " + min);
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isNumberField(Component component, JTextComponent txt,
            String fieldName, String placeholder, Double min, Double max) {

        // check numberfield
        if (isNumberField(component, txt, fieldName, placeholder) == false) {
            return false;
        }

        // check condition : greater than min and smaller than max
        Double number = Double.parseDouble(txt.getText());
        boolean condition = (number > min) && (number < max);
        if (condition == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải lớn hơn " + min
                    + " và nhỏ hơn " + max);
            txt.setBorder(new LineBorder(errorColor));
            return false;
        }

        // else
        txt.setBorder(new LineBorder(validColor));
        return true;
    }

}
