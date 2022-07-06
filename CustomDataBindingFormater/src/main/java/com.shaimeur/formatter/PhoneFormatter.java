package com.shaimeur.formatter;

import com.shaimeur.model.Phone;
import org.springframework.format.Formatter;

import java.text.ParseException;
import java.util.Locale;

public class PhoneFormatter implements Formatter<Phone> {
    @Override
    public Phone parse(String s, Locale locale) throws ParseException {
        String[] temp = s.split("-");
        Phone p = new Phone();
        p.setAreaCode(temp[0]);
        p.setPrefix(temp[1]);
        p.setNumber(temp[2]);
        System.out.println("insinde phone formatter parse method");
        System.out.println(p);
        return p;
    }


    @Override
    public String print(Phone object, Locale locale) {
        return null;
    }
}
