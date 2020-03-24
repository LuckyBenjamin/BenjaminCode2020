package benjamin.core.java.corejava.bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @ClassName User
 * @Description: {}
 * @Author Benjamin
 * @Date 2020/3/8
 **/
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {
    private Integer id;

    private String name;

    private Integer age;
}
