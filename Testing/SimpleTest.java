package LearnJava.Testing;

import static org.mockito.Mockito.*;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author lzjun
 * @version 0.1
 * @date 2012-5-5
 *
 */
public class SimpleTest {

    @Test
    public void simpleTest(){

        //创建mock对象，参数可以是类，也可以是接口
        List<String> list = mock(List.class);

        //设置方法的预期返回值
        when(list.get(0)).thenReturn("helloworld");

        String result = list.get(0);

        //验证方法调用(是否调用了get(0))
        verify(list).get(0);

        //junit测试
        Assert.assertEquals("helloworld", result);

        Map<Integer,String> map = mock(Map.class);
        when(map.put(anyInt(),anyString())).thenReturn("hello");//anyString()替换成"hello"就会报错
        map.put(1, "world");
        verify(map).put(eq(1), eq("world")); //eq("world")替换成"world"也会报错
    }
}
