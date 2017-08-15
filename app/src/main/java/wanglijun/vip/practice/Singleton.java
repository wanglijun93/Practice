package wanglijun.vip.practice;

/**
 * @author： wlj
 * @Date: 2017-08-15
 * @email: wanglijundev@gmail.com
 * @desc: 单例模式 懒汉式  线程安全的
 */

public class Singleton {
    private static Singleton instance;

    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }
}
