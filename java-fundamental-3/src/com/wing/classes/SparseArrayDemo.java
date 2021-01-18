package com.wing.classes;

public class SparseArrayDemo {
    public static void main(String[] args) {
        System.out.println("1. 构造原始数组----------------------");
        // 构造初始数组
        // 模拟围棋棋盘，0：没有棋子  1：黑色棋子  2：白色棋子
        int[][] array1 = new int[11][11];
        array1[1][2] = 1;
        array1[2][3] = 2;

        // 输出原始数组
        /**
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	1	0	0	0	0	0	0	0	0
         * 0	0	0	2	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         * 0	0	0	0	0	0	0	0	0	0	0
         */
        System.out.println("原始数组为: ");
        for (int[] ints: array1) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

        System.out.println("2. 构造稀疏数组----------------------");
        // 计算原始数组中的有效值个数
        int validCount = 0;
        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                if (array1[i][j] != 0) {
                    validCount++;
                }
            }
        }
        System.out.println("原始数组中的有效值的个数为: " + validCount);

        // 构造稀疏数组
        // 稀疏数组的个数
        /**
         *      row  |  col    |   val
         * [0] 多少行 | 多少列   |   有效值
         * ----------------------------
         * [1] 具体行 | 具体列   |  对应的值
         * [2] 具体行 | 具体列   |  对应的值
         * [3] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [n] 具体行 | 具体列   |  对应的值
         */
        System.out.println("构造稀疏数组: " );
        int[][] array2 = new int[validCount+1][3];

        // 构造稀疏数组第一行信息
        array2[0][0] = array1.length;
        array2[0][1] = array1[0].length;
        array2[0][2] = validCount;

        // 构造稀疏数组其他行数据
        /**
         * 遍历原数组，将非零的值存放到稀疏数组中
         */
        int count = 0;   // 记录数据不为0的行数
        for (int i = 0; i < array1.length; i++) {
            // 按行遍历
            for (int j = 0; j < array1[i].length; j++) {
                if (array1[i][j] != 0) {
                    count++;
                    array2[count][0] = i;      // 对应原始数组中具体行
                    array2[count][1] = j;      // 对应原始数组中具体列
                    array2[count][2] = array1[i][j];      // 对应原始数组中这行和这列的对应的值
                }
            }
        }

        // 输出稀疏数组，格式如
        /**
         *      row  |  col    |   val
         * [0] 多少行 | 多少列   |   有效值
         * ----------------------------
         * [1] 具体行 | 具体列   |  对应的值
         * [2] 具体行 | 具体列   |  对应的值
         * [3] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [.] 具体行 | 具体列   |  对应的值
         * [n] 具体行 | 具体列   |  对应的值
         */
        System.out.println("稀疏数组为: " );
        /**
         * 11	11	2
         * 1	2	1
         * 2	3	2
         */
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i][0] + "\t" + array2[i][1] + "\t" + array2[i][2]);
        }

        // 从稀疏数组还原原始数组
        System.out.println("3. 还原数组----------------------");

        System.out.println("根据稀疏数组定义原始数组的大小：");

        // 根据稀疏数组构造原始数组,稀疏数组[0][0]记录原始数组的行数，稀疏数组[0][1]记录原始数组的列数
        int[][] array3 = new int[array2[0][0]][array2[0][1]];

        // 从稀疏数组还原原始数组数据，下标从1开始，因为第0行记录多少行，多少列和有效值，而从第1行才开始记录具体行，具体列对应的具体值
        for (int i = 1; i < array2.length; i++) {
            array3[array2[i][0]][array2[i][1]] = array2[i][2];
        }

        // 输出还原后的原始数组
        System.out.println("还原后的数组为: ");
        for (int[] ints: array3) {
            for (int anInt: ints) {
                System.out.print(anInt + "\t");
            }
            System.out.println();
        }

    }
}
