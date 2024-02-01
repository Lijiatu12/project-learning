package StringBuffer和StringBuilder;

public class StringBuffer01 {
    public static void main(String[] args) {


       //        String  == =StringBuffer
        //使用构造器
        String str ="hello tom";
        StringBuffer stringBuffer2 = new StringBuffer(str);
        //使用append方法
        StringBuffer stringBuffer3 = new StringBuffer();
        stringBuffer3 =stringBuffer3.append(str);

          //方式1
        StringBuffer stringBuffer = new StringBuffer("韩顺平教育");
        String s = stringBuffer.toString();

        String string = new String(stringBuffer);

    }
}
