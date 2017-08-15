package wanglijun.vip.practice;

/**
 * @author： wlj
 * @Date: 2017-08-15
 * @email: wanglijundev@gmail.com
 * @desc: 单例模式 懒汉式
 * 这种是线程不安全的，会导致在多线程不能正常工作
 */

public class SingleTest {
    private static SingleTest sSingleTest;

    private SingleTest() {
    }

    public static SingleTest getInstance() {
        if (sSingleTest != null) {
            sSingleTest = new SingleTest();
        }
        return sSingleTest;
    }
}
