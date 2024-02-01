package 特殊性质.Static;

public class static01 {
    public static void main(String[] args) {



        staticexerxise01 staticexerxise01 = new staticexerxise01();
        staticexerxise01.test1();

        staticexerxise02 staticexerxise021 = new staticexerxise02();

        staticexerxise01 staticexerxise0101= staticexerxise021.getstaticexercise();
        staticexerxise0101.test1();


    }
}

class staticexerxise01 {

    public void test1(){
        System.out.println("test1");
    }

}

class staticexerxise02 {
    public void test1() {
        System.out.println("test1");

    }

    public staticexerxise01 getstaticexercise() {
        {
            return new staticexerxise01();
        }
    }
}
