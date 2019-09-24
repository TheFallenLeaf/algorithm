package cn.edu.cup.tanyao.algorithm;

/**
 * 排序算法
 * @author tanyao
 * @date 2019/9/23
 */
public class Sort {
    /**
     * 排序前序列
     */
    private int[] data;

    /**
     * 构造方法,深拷贝
     * @param data
     */
    public Sort (int[] data) {
        this.data = new int[data.length+1];
        this.data[0] = 0;
        System.arraycopy(data, 0, this.data, 1, data.length);
    }

    /**
     * 直接插入排序
     */
    public void Insertion1 () {
        //第一位为哨岗,从第三位开始排序
        for (int i = 2; i < data.length; i++) {
            data[0] = data[i];
            for (int j = i-1; j >= 0; j--) {
                if (data[j] > data[0]) {
                    data[j+1] = data[j];
                }
                else {
                    data[j+1] = data[0];
                    break;
                }
            }
        }
        data[0] = 0;
    }

    /**
     * 二分插入排序
     */
    public void Insertion2 () {
        //先排出一个有序列
        if (data[1] > data[2]) {
            data[0] = data[2];
            data[2] = data[1];
            data[1] = data[0];
        }

        for (int i = 3; i < data.length; i++) {
            data[0] = data[i];

        }

    }

    public int[] getData () {
        return data;
    }
}
