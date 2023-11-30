package com.example.todolist.Utilities;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class DateValidation {
    public static boolean isValidDateFormat(String input) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        try {
            dateFormat.parse(input);
            return true;
        } catch (ParseException e) {
            return false;
        }
    }

}
