package cn.edu.cup.tanyao.algorithm;

import java.util.Random;

/**
 * @author tanyao
 * @date 2019/9/23
 */
public class TestSort {
    public static void main(String[] args) {
        int[] data = new int[50];
        Random random = new Random(950716);
        System.out.println("----------我--是--分--割--线----------");
        System.out.print("排序前数组: ");
        for (int i = 0; i < data.length; i++) {
            data[i] = random.nextInt(1000);
            if (i % 15 == 0) {
                System.out.println();
            }
            System.out.print(data[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("----------我--是--分--割--线----------");
        System.out.print("排序后数组:");
        Sort sort = new Sort(data);
        sort.Insertion1();
        for (int i = 0; i < sort.getData().length; i++) {
            if (i % 15 == 0) {
                System.out.println();
            }
            System.out.print(sort.getData()[i]);
            System.out.print(" ");
        }
        System.out.println();
        System.out.println("----------我--是--分--割--线----------");
    }
}
