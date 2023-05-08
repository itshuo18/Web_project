package myDynamicProxy;

/**
 * ClassName: BigStar
 * Package: myDynamicProxy
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/5/1 14:07
 * @Version: 1.0
 */
public class BigStar implements Star {
    private String name;

    public BigStar() {
    }

    public BigStar(String name) {
        this.name = name;
    }

    @Override
    public String sing(String name) {
        System.out.println(this.name + "正在唱" + name);
        return "谢谢";
    }

    @Override
    public void dance() {
        System.out.println(this.name + "正在跳舞");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
