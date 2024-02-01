package JSON;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Test;

import java.util.HashMap;

public class TestJson {

@Test
    public  void testWriteJson() throws JsonProcessingException {

    /*Person与字符串的转换*/
    Dog dog = new Dog("小黄");

    Person person = new Person("张三", 10, dog);




    //将Person对象转换为一个字符串

    ObjectMapper objectMapper = new ObjectMapper();

    String personStr= objectMapper.writeValueAsString(person);
    System.out.println(personStr);
}


//将刚才的字符串转化为一个对象

@Test
public  void  testReadJson( ) throws JsonProcessingException {

   String personStr ="{\"name\":\"张三\",\"age\":10,\"dog\":{\"name\":\"小黄\"}}";

    ObjectMapper objectMapper = new ObjectMapper();


    Person person = objectMapper.readValue(personStr, Person.class);

    System.out.println(person);

}


@Test
/*Map与JSON的转换*/
    
    public  void testMapToJson() throws JsonProcessingException {

        HashMap data = new HashMap();

        data.put("a","valuea");
        data.put("b","valueb");

        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);



    }

    @Test

    /*LIST与JSON的转换*/
    public  void testLISTToJson() throws JsonProcessingException {

      /*  ArrayList data= new ArrayList();


        data.add("a")   ;
        data.add("b")   ;
        data.add("c")   ;*/


        String []data = {"a","b","c"};
        ObjectMapper objectMapper = new ObjectMapper();
        String s = objectMapper.writeValueAsString(data);
        System.out.println(s);



    }



    

}
