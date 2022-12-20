package Example;

import Example.PO.User;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Author bxdu
 * @Date 2022/12/20/ 10:49
 **/
public class Example {
    /**
     * list -> map
     * (key1, key2) -> key2) 作用是使用新的值覆盖旧的值。
     */
    List<User> list = new ArrayList<>();
    Map<Long,User> map = list.stream().collect(Collectors.toMap(User::getUserId, Function.identity(), (key1, key2) -> key2));

}
