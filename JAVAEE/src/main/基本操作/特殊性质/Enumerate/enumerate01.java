package 特殊性质.Enumerate;

public class enumerate01 {
    public static void main(String[] args) {
        System.out.println(Season.Spring);
        System.out.println(Season.Summer);
        System.out.println(Season.Autumn);
        System.out.println(Season.Winter);

    }
}


class Season{
    private String name;

    private String  desc;

//final+static   ==取消类的加载
    public final static  Season   Spring      =new Season( "春天","温暖");
    public  final static  Season   Summer       =new Season( "夏天","炎热");
    public  final static  Season   Autumn      =new Season( "秋天","凉爽");

    public  final static  Season   Winter      =new Season( "冬天","寒冷");




    private Season(String name, String desc) {//防止直接new
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