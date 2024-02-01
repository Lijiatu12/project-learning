package OutputStream.ObjectOutputStream;

import java.io.Serializable;




    //如果需要序列化某个对象，必须实现Serializable的接口
   public class Dog implements Serializable {

        private String name;

        private  int age;

        private static String nation;

        private transient String color;


        //static  transient的成员不会被序列化

        private static final long serialVersionUID = 1L;

        public Dog(String name, int age, String nation,String color) {
            this.name = name;
            this.age = age;
            this.nation = nation;
            this.color = color;

        }

        @Override
        public String toString() {
            return "Dog{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", color='" + color + '\'' +
                    '}' + nation;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }
    }


