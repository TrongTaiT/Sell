/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.awt.Color;
import java.awt.Component;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JPasswordField;
import javax.swing.border.LineBorder;
import javax.swing.text.JTextComponent;

/**
 *
 * @author Dev-StOrM
 */
// fieldName should be change to toolTiptext for synchronization and not violate human mistake by typing
public class ValidationHelper {

    public static Color validColor = new Color(0, 230, 64);
    public static Color errorColor = new Color(242, 38, 19);

    public static boolean isNotNull(String text, String placeholder) {
        return !(text.equals("") || text.equals(placeholder));
    }

    public static boolean isValidLength(String text, int maxLength) {
        return text.length() <= maxLength;
    }

    public static boolean isNotNullField(Component parent, JTextComponent txtField, String fieldName) {

        // check null
        if (txtField.getText().equals("") || txtField.getText().equals(fieldName)) {
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + "!");
            setErrorFor(txtField);
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isValidLengthNullableField(Component parent, JTextComponent txtField,
            String fieldName, int maxLength) {

        // check length
        if (txtField.getText().length() > maxLength) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải có độ dài nhỏ hơn " + maxLength);
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isValidLength(Component parent, JTextComponent txtField,
            String fieldName, int maxLength) {

        // check null
        if (isNotNullField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check length
        if (txtField.getText().length() > maxLength) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải có độ dài nhỏ hơn " + maxLength);
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isValidPassword(Component parent, JPasswordField pwd,
            String fieldName) {

        String password = new String(pwd.getPassword());
        // check null
        if (password.equals("") || password.equals(fieldName)) {
            pwd.setBorder(new LineBorder(errorColor));
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + "!");
            return false;
        }

        // check length (regex contains check length but to visualize to user, it must have another check length)
        if (password.length() < 8 || password.length() > 36) {
            pwd.setBorder(new LineBorder(errorColor));
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " phải có độ dài từ 8 đến 36 kí tự");
            return false;
        }

        // check regex (if not strictly follow the rules in regex, this can be commented to remove)
        if (RegexValidation.isValidPassword(password) == false) {
            pwd.setBorder(new LineBorder(errorColor));
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải chứa ít nhất một kí tự: viết thường VÀ số VÀ "
                    + "viết hoa VÀ đặc biệt ('!','@','#','&','(',')'...)");
            return false;
        }

        // else
        pwd.setBorder(new LineBorder(validColor));
        return true;
    }

    public static boolean isValidName(Component parent, JTextComponent txtField,
            String fieldName, int maxLength) {

        // check null
        if (ValidationHelper.isNotNullField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check length
        if (txtField.getText().length() > maxLength) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải có độ dài nhỏ hơn " + maxLength);
            return false;
        }

        // check regex
        if (RegexValidation.isValidName(txtField.getText()) == false) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " chưa hợp lệ!");
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isValidPhoneNumber(Component parent, JTextComponent txtField,
            String fieldName, int maxLength) {

        // check null
        if (ValidationHelper.isNotNullField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check length
        if (txtField.getText().length() > maxLength) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải có độ dài nhỏ hơn " + maxLength);
            return false;
        }

        // check regex
        if (RegexValidation.isValidPhoneNumber(txtField.getText()) == false) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " chưa hợp lệ!");
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isValidEmail(Component parent, JTextComponent txtField,
            String fieldName, int maxLength) {

        // check null
        if (ValidationHelper.isNotNullField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check length
        if (txtField.getText().length() > maxLength) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase()
                    + " phải có độ dài nhỏ hơn " + maxLength);
            return false;
        }

        // check regex
        if (RegexValidation.isValidEmail(txtField.getText()) == false) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " chưa hợp lệ!");
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isNumberField(Component parent, JTextComponent txtField,
            String fieldName) {

        // check null
        if (isNotNullField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check valid number
        try {
            Double.parseDouble(txtField.getText());
        } catch (NumberFormatException e) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " phải là số");
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isNumberField(Component parent, JTextComponent txtField,
            String fieldName, Double min) {

        // check numberfield
        if (isNumberField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check condition : greater than min
        boolean condition = (Double.parseDouble(txtField.getText()) > min);
        if (condition == false) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " phải lớn hơn " + min);
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isNumberField(Component parent, JTextComponent txtField,
            String fieldName, Double min, Double max) {

        // check numberfield
        if (isNumberField(parent, txtField, fieldName) == false) {
            return false;
        }

        // check condition : greater than min and smaller than max
        Double number = Double.parseDouble(txtField.getText());
        boolean condition = (number > min) && (number < max);
        if (condition == false) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Nhập " + fieldName.toLowerCase() + " phải lớn hơn " + min
                    + " và nhỏ hơn " + max);
            return false;
        }

        // else
        setValidFor(txtField);
        return true;
    }

    public static boolean isPickedCombobox(Component parent, JComboBox comboBox, String cboName) {

        // check selected index is equals to first place, as placeholder in design
        if (comboBox.getSelectedIndex() == 0) {
            setErrorFor(comboBox);
            MsgBox.alert(parent, "Chọn " + cboName.toLowerCase() + "!");
            return false;
        } else {
            setValidFor(comboBox);
            return true;
        }
    }

    public static boolean isNotDuplicatedID(Component parent, JTextComponent txtField,
            String fieldName, Object object) {

        // check if the object exists
        if (object != null) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Đã tồn tại " + fieldName + " này!\n"
                    + "Vui lòng chọn mã khác!");
            return false;
        }

        setValidFor(txtField);
        return true;
    }

    public static boolean isExistEntity(Component parent, JTextComponent txtField,
            String fieldName, Object object) {
        
        // check if the object exists
        if (object == null) {
            setErrorFor(txtField);
            MsgBox.alert(parent, "Không tồn tại " + fieldName.toLowerCase() + " này!\n"
                    + "Vui lòng kiểm tra lại!");
            return false;
        }
        
        return true;
    }

    public static void resetBorderColor(JComponent... componets) {
        for (JComponent component : componets) {
            component.setBorder(new LineBorder(Color.gray));
        }
    }

    public static void setErrorFor(JComponent component) {
        component.setBorder(new LineBorder(errorColor));
    }

    public static void setValidFor(JComponent component) {
        component.setBorder(new LineBorder(validColor));
    }

}
