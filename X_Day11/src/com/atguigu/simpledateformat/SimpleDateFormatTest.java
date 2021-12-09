package com.atguigu.simpledateformat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest {

    public static void main(String[] args) throws ParseException {
        long now = System.currentTimeMillis();
        String birthString = "1999年04月06日 00:00:00";
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MM月dd日 HH:mm:ss");
        Date birthDate = sdf.parse(birthString);
        long birthTime = birthDate.getTime();
        double result = 1.0 * (now - birthTime) / (1000*60*60*24);
        System.out.println("您已经活了 = " + result+"天");
    }

}
