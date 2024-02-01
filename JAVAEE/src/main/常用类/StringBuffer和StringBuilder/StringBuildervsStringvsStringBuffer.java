package StringBuffer和StringBuilder;

public class StringBuildervsStringvsStringBuffer {

    public static void main(String[] args) {

        //串行化
        //对象序列任然是存放在 父类  堆中

        long startTime = 0l;
        long endTime = 0l;

        StringBuffer buffer = new StringBuffer("");

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i =0;i<20000;i++){
            buffer.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringbuffer执行时间：" + (endTime - startTime));






        startTime = System.currentTimeMillis();
        for (int i =0;i<20000;i++) {
            builder.append(String.valueOf(i));
        }
        endTime = System.currentTimeMillis();
        System.out.println("stringbuilder执行时间：" + (endTime - startTime));


        String text = "";
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 20000; i++) {
            text = text + i;

        }
        endTime = System.currentTimeMillis();
        System.out.println("string执行时间：" + (endTime - startTime));






    }
}
