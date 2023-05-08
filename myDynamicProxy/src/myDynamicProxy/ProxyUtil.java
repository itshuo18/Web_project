package myDynamicProxy;

import java.lang.reflect.Proxy;

/**
 * ClassName: ProxyUtil
 * Package: myDynamicProxy
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/1 14:07
 * @Version: 1.0
 */
public class ProxyUtil {


    /**
     *
     *
     *  形参：被代理的对象
     *  返回值：给对象创造的代理对象
     *  <p>
     *
     *
     *  需求：
     *  1.获取代理对象
     *  代理对象 = ProxyUtils.createProxy(被代理对象);
     *  <p>
     *
     *
     *  2.调用代理的方法
     *  代理对象.唱歌的方法();
     *  <p>
     *
     * */
    public static Star createProxy(BigStar bigStar) {
        Star star = (Star) Proxy.newProxyInstance(
                // 参数一：用于指定用哪个类加载器，去加载生成的代理类
                ProxyUtil.class.getClassLoader(),
                // 参数二：指定接口，这些接口用于指定生成的代理有哪些方法
                new Class[]{Star.class},

                // 参数三：用来指定生成的代理对象要干什么事情
                (proxy, method, args) -> {
                    /*
                     * 参数一：要代理的对象
                     * 参数二：要运行的方法
                     * 参数三：调用方法时，传递的实参
                     * */
                    if("sing".equals(method.getName())){
                        System.out.println("准备话筒，收钱");
                    }else if("dance".equals(method.getName())){
                        System.out.println("准备场地，收钱");
                    }

                    return method.invoke(bigStar,args);
                }
        );
        return star;
    }
}
