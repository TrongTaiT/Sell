/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.awt.Component;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Dev-StOrM
 */
public class ValidationHelper {

    // need additional method trim();
    static public boolean isNullField(Component component, JTextField txt, String fieldName) {
        if (txt.getText().equals("")) {
            MsgBox.alert(component, "Nhập " + fieldName + "!");
            txt.requestFocus();
            return true;
        }
        return false;
    }

    static public boolean isValidPassword(Component component, JPasswordField pwd, String fieldName) {
        String password = new String(pwd.getPassword());
        if (ValidationHelper.isNullField(component, pwd, fieldName) == true) {
            return false;
        } else if (password.length() < 8 || password.length() > 36) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải có độ dài từ 8 đến 36 kí tự");
            pwd.requestFocus();
            return false;
        } else if (Validator.isValidPassword(password) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải chứa ít nhất một kí tự: viết thường + số + "
                    + "viết hoa + đặc biệt ('!','@','#','&','(',')'...)");
            pwd.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isValidName(Component component, JTextField txt, String fieldName) {
        if (ValidationHelper.isNullField(component, txt, fieldName) == true) {
            return false;
        }
        if (Validator.isValidName(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isValidPhoneNumber(Component component, JTextField txt, String fieldName) {
        if (ValidationHelper.isNullField(component, txt, fieldName) == true) {
            return false;
        }
        if (Validator.isValidPhoneNumber(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isValidEmail(Component component, JTextField txt, String fieldName) {
        if (ValidationHelper.isNullField(component, txt, fieldName) == true) {
            return false;
        }
        if (Validator.isValidEmail(txt.getText()) == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " chưa hợp lệ!");
            txt.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isNumber(Object object) {
        try {
            Double.parseDouble(((String) object));
        } catch (NumberFormatException e) {
            return false;
        }
        return true;
    }

    public static boolean isNumberField(Component component, JTextField txt, String fieldName) {
        if (isNullField(component, txt, fieldName) == true) {
            return false;
        }
        try {
            Double.parseDouble(txt.getText());
        } catch (NumberFormatException e) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải là số");
            txt.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isNumberField(Component component, JTextField txt, String fieldName, Double min) {
        if (isNumberField(component, txt, fieldName) == false) {
            return false;
        }
        boolean condition = (Double.parseDouble(txt.getText()) > min);
        if (condition == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải lớn hơn " + min);
            txt.requestFocus();
            return false;
        }
        return true;
    }

    public static boolean isNumberField(Component component, JTextField txt, String fieldName, Double min, Double max) {
        if (isNumberField(component, txt, fieldName) == false) {
            return false;
        }
        Double number = Double.parseDouble(txt.getText());
        boolean condition = (number > min) && (number < max);
        if (condition == false) {
            MsgBox.alert(component, "Nhập " + fieldName + " phải lớn hơn " + min
                    + " và nhỏ hơn " + max);
            txt.requestFocus();
            return false;
        }
        return true;
    }

}
