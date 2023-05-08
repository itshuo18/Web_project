package myDynamicProxy;

/**
 * ClassName: ${NAME}
 * Package:
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/1 14:05
 * @Version: 1.0
 */
public class Main {
    public static void main(String[] args) {
//      1.获取代理对象
//      代理对象 = ProxyUtils.createProxy(被代理对象);
//      2.调用代理的方法
//      代理对象.唱歌的方法();
        
        BigStar bigStar = new BigStar("鸡哥");
        Star proxy = ProxyUtil.createProxy(bigStar);

        String result = proxy.sing("只因你太美");
        System.out.println(result);


    }
}