package Wrapperclass;

class  wrapperclass03{
    public static void main(String[] args) {
        wrapperclass03exercise wrapperclass03exercise = new wrapperclass03exercise();
        wrapperclass03exercise.method();

    }


}
class wrapperclass03exercise {
    public void method() {
        Integer i = 1;
        Integer j = 1;

        System.out.println(i == j);//valueof
Integer m =-129;
        Integer n =-129;
        System.out.println(m ==n);//new integer(xx)
    }
}
