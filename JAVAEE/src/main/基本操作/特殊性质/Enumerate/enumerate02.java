public class enumerate02 {


    public static void main(String[] args) {

        System.out.println(Season02.Spring);
        System.out.println(Season02.Summer);
        System.out.println(Season02.Autumn);
        System.out.println(Season02.Winter);


    }
}

enum Season02{


    //final+static   ==取消类的加载

    Spring( "春天","温暖"),Summer( "夏天","炎热"), Autumn( "秋天","凉爽"),  Winter( "冬天","寒冷");
    private String name;

    private String  desc;


    private Season02(String name, String desc) {//防止直接new
        this.name = name;
        this.desc = desc;
    }

    public String getName() {//去掉setxx    防止属性修改
        return name;
    }


    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}