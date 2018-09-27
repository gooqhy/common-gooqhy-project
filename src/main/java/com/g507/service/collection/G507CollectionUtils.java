/**
 * 版权： 北京联众信安成都分公司
 * 描述： 集合处理
 * 创建时间：2018年05月31日
 */
package com.g507.service.collection;

import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

import static java.io.File.separator;

/**
 * 〈一句话功能简述〉集合处理〈功能详细描述〉
 *
 * @author Administrator
 * @version [版本号, 2018年05月31日]
 * @see [相关类/方法]
 * @since [产品/模块版本]
 */
public class G507CollectionUtils {

    /**
     * 〈一句话功能简述〉循环移除List元素 防止下标越界〈功能详细描述〉
     *
     * @param list
     * @param param
     * @return void
     * @throws Exception 异常
     * @methodName removeList
     * @date 2018/5/31 0031 14:51
     * @see [类、类#方法、类#成员]
     */
    public static void removeList(List<String> list, String param) {
        for (Iterator<String> ite = list.iterator(); ite.hasNext(); ) {
            String str = ite.next();
            if (str.contains(param)) {
                ite.remove();
            }
        }
    }

    /**
     * 〈一句话功能简述〉使用java8排序-从小到大〈功能详细描述〉
     *
     * @param list
     * @return void
     * @throws Exception 异常
     * @methodName compareList
     * @date 2018/5/31 0031 20:41
     * @see [类、类#方法、类#成员]
     */
    public static void compareList(List<String> list) {
        Collections.sort(list, (s1, s2) -> s1.compareTo(s2));
    }

    public static void main(String[] args) {
        Arrays.asList("a", "b", "d").forEach((String e) -> System.out.println(e + separator));
        Arrays.asList("a", "b", "d").sort((e1, e2) -> e1.compareTo(e2));
        List<String> aa = Arrays.asList("d", "b", "a");
        System.out.println(aa);
        G507CollectionUtils.compareList(aa);
        System.out.println(aa);
        Arrays.asList("a", "b", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });

        Arrays.asList("d", "a", "d").sort((e1, e2) -> {
            int result = e1.compareTo(e2);
            System.out.println(result);
            return result;
        });
    }


} 