import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.holun.entity.User;

import java.util.ArrayList;
import java.util.List;

/**
 * FastJson的使用
 */

public class Test {
    @org.junit.Test
    public void name() {
        User user1 = new User(1, "李浩伦", "1234");
        User user2 = new User(2, "独一味", "134");
        User user3 = new User(3, "老张", "122");

        List<User> list = new ArrayList<>();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        //将List集合对象转换成json字符串
        String s1 = JSON.toJSONString(list);
        System.out.println(s1);
        //将json字符串转换成List集合对象
        List<User> list1 = JSONArray.parseArray(s1, User.class);
        list1.forEach(System.out :: println);

        System.out.println();
        //将javabean对象转换成json字符串
        String s2 = JSON.toJSONString(user1);
        System.out.println(s2);
        //将json字符串转换成javabean对象
        user1 = JSON.parseObject(s2, User.class);
        System.out.println(user1);

        System.out.println();
        User user4 = new User(4, "伦哥", "haolun124");
        //将java对象转换成json对象
        JSONObject jsonObject = (JSONObject) JSON.toJSON(user4);
        System.out.println(jsonObject);
        //将json对象转换成java对象
        User user5 = JSON.toJavaObject(jsonObject, User.class);
        System.out.println(user5);


    }
}
