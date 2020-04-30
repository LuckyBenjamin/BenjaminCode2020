package benjamin.core.java.corejava.jdk8;

import benjamin.core.java.corejava.bean.User;
import org.junit.Test;
import org.springframework.cglib.core.CollectionUtils;

import java.util.ArrayList;
import java.util.stream.Collectors;

/**
 * @ClassName Jdk8Grammar
 * @Description: {JDK 8 语法测试}
 * @Author Benjamin
 * @Date 2020/3/25
 **/
public class Jdk8Grammar {
    
    /** 
     * @MethodName: Test
     * @Description: Stream对null的处理
     * @Param: []
     * @Return: void
    **/
    @Test
    public void StreamTest(){
        ArrayList<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            users.add(new User(1,"李志斌"+i,18+i));
        }
        System.out.println(users.stream().map(e -> e.getName()).collect(Collectors.toList()));
        ArrayList<User> users2 = new ArrayList<>();
        System.out.println(users2.stream().map(e -> e.getName()).collect(Collectors.toList()));
        System.out.println(users2.stream().map(e -> e.getName()).collect(Collectors.toList())==null?"是的":"不是");
        System.out.println(users2==null?"null":"no");
    }
}
