package wanglijun.vip.practice;

import wanglijun.vip.practice.utils.LogUtils;

/**
 * @author： wlj
 * @Date: 2017-08-16
 * @email: wanglijundev@gmail.com
 * @desc: java算法之 冒泡排序
 */

public class SortMaoPao {
    /**
     * 从小到大的排序方式 1
     */
    public static  void SamllAndBig() {
        int arr[] = {6, 3, 1, 9, 2, 35, 11};
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp;
                    temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            LogUtils.d(" " + arr[i] +" ");
        }
    }
}
