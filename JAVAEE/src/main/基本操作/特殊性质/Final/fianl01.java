package 特殊性质.Final;

class final01 {
    public static void main(String[] args) {



    }


}

class finalexercise01 {
    public static void main(String[] args) {

        final char[] value = {'a', 'b', 'c'};
        char[] v2 = {'t', 'o', +'m'};
        value[0] = 'H';
        //value = v2;  //存在错误

    }
}
