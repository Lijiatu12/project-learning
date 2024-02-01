package DateAndCalender.Date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class date01 {
    public static void main(String[] args) throws ParseException {
//国外时间
        Date d1 = new Date();
        System.out.println("当前时间" + d1);

        Date d2 = new Date(9234567);
        System.out.println("d2=" + d2);

//国内时间
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy年MMdd日  hh:mm:ss E");
        String format = sdf.format(d1);
        System.out.println("当前时间" + format);





        String s = "1996年01月01日 10:20:30 星期一";

        
        Date parse = sdf.parse(s);
        System.out.println("parse=" + sdf.format(parse));


    }}


