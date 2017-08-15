package wanglijun.vip.practice;

/**
 * @author： wlj
 * @Date: 2017-08-15
 * @email: wanglijundev@gmail.com
 * @desc: 单例模式 饿汗式
 */

public class SingleTest2 {
    private SingleTest2() {
    }

    private static SingleTest2 instance = new SingleTest2();

    public static SingleTest2 getInstance() {
        return instance;
    }
}
