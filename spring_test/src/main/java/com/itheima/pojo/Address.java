package com.itheima.pojo;

/**
 * ClassName: Address
 * Package: com.itheima.pojo
 * Description:
 *
 * @Author: Shuo
 * @Create: 2023/4/28 15:19
 * @Version: 1.0
 */
public class Address {
    private String province;
    private String city;

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "Address{" +
                "province='" + province + '\'' +
                ", city='" + city + '\'' +
                '}';
    }
}
