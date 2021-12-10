/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Sell.Helper;

import java.util.regex.Pattern;

/**
 *
 * @author Dev-StOrM
 */
public class RegexValidation {

    public static boolean isNumber(Object object) {
        try {
            Double.parseDouble(((String) object));
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    // alphabet including Unicode UTF-8
    static final public boolean isValidName(String str) {
        final String NAME_REGEX
                = "^[A-Za-zẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ"
                + "ắằẳẵặăấầẩẫậâáàãảạđếềểễệêéèẻẽẹíìỉĩịốồổỗộôớờởỡợơóòõỏọứừửữựưúùủũụýỳỷỹỵ]+"
                + "(\\s[A-Za-zẮẰẲẴẶĂẤẦẨẪẬÂÁÀÃẢẠĐẾỀỂỄỆÊÉÈẺẼẸÍÌỈĨỊỐỒỔỖỘÔỚỜỞỠỢƠÓÒÕỎỌỨỪỬỮỰƯÚÙỦŨỤÝỲỶỸỴ"
                + "ắằẳẵặăấầẩẫậâáàãảạđếềểễệêéèẻẽẹíìỉĩịốồổỗộôớờởỡợơóòõỏọứừửữựưúùủũụýỳỷỹỵ]+)+$";
        final Pattern NAME_PATTERN = Pattern.compile(NAME_REGEX);

        return NAME_PATTERN.matcher(str).matches();
    }

    // Vietnam phone number, only contain 10 -> 12 numberic characters
    static final public boolean isValidPhoneNumber(String str) {
        final String PHONE_REGEX = "^\\d{10,12}$";
        final Pattern PHONE_PATTERN = Pattern.compile(PHONE_REGEX);

        return PHONE_PATTERN.matcher(str).matches();
    }

    // local-part + @ + domain part
    static final public boolean isValidEmail(String str) {
        final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*"
                + "@" + "(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$";
        final Pattern EMAIL_PATTERN = Pattern.compile(EMAIL_REGEX);

        return EMAIL_PATTERN.matcher(str).matches();
    }

    // 5->18 characters, can contains alphanumeric characters not case sensitive
    // allows '.', '_'
    static final public boolean isValidUsername(String str) {
        final String USERNAME_REGEX = "^[a-zA-Z0-9]([._](?![._])|[a-zA-Z0-9]){5,18}[a-zA-Z0-9]$";
        final Pattern USERNAME_PATTERN = Pattern.compile(USERNAME_REGEX);

        return USERNAME_PATTERN.matcher(str).matches();
    }

//    1. Password must contain at least one digit [0-9].
//    2. Password must contain at least one lowercase Latin character [a-z].
//    3. Password must contain at least one uppercase Latin character [A-Z].
//    4. Password must contain at least one special character like ! @ # & ( ).
//    5. Password must contain a length of at least 8 characters and a maximum of 36 characters.
    static final public boolean isValidPassword(String str) {
        final String PASSWORD_REGEX = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,36}$";
        final Pattern PASSOWRD_PATTERN = Pattern.compile(PASSWORD_REGEX);

        return PASSOWRD_PATTERN.matcher(str).matches();
    }

//    // check valid for MaSV
//    static final public boolean isValidMaSV(String str) {
//        final String MASV_REGEX = "^SV\\d{3}$"; // exp: "SV001";
//        final Pattern MASV_PATTERN = Pattern.compile(MASV_REGEX);
//
//        return MASV_PATTERN.matcher(str).matches();
//    }
}
