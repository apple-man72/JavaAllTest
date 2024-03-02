package DataStructures.com.SparseArr;

/**
 * 五子棋 转 稀疏数组
 */
public class SparseArr {
    public static void main(String[] args) {
        //创建一个原始的二维数组，11*11
        int[][] charArr1 = new int[11][11];
        charArr1[1][2] = 1;
        charArr1[2][3] = 2;
        //输出原始的二维数组
        //0表示没有棋子  1表示黑子 2表示蓝子
        System.out.println("输出原始的二维数组");
        for (int[] row : charArr1) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }
        /*
            将二维数组转化为稀疏数组的思想
          1.先遍历二维数组，得到非0数据的个数
         */
        int sum = 0;
        for (int i = 0; i < charArr1.length; i++) {
            for (int j = 0; j < charArr1.length; j++) {
                if (charArr1[i][j] != 0) {
                    sum++;
                }
            }
        }
        System.out.println("sum= \t" + sum);
//        创建对应的稀疏数组
        int sparseArray[][] = new int[sum + 1][3];
//       给稀疏数组赋值
        sparseArray[0][0] = 11;
        sparseArray[0][1] = 11;
        sparseArray[0][2] = sum;

//        遍历二维数组，将非0的值存放到稀疏数组中
        int count = 0;
        for (int i = 0; i < charArr1.length; i++) {
            for (int j = 0; j < charArr1.length; j++) {
                if (charArr1[i][j] != 0) {
                    count++;
                    sparseArray[count][0] = i;
                    sparseArray[count][1] = j;
                    sparseArray[count][2] = charArr1[i][j];
                }
            }
        }
//        输出稀疏数组的形式
        System.out.println();
        System.out.println("得到的稀疏数组为如下形式```");
        for (int i = 0; i < sparseArray.length; i++) {
            System.out.printf("%d\t%d\t%d\t\n", sparseArray[i][0], sparseArray[i][1], sparseArray[i][2]);

        }
//        将稀疏数组恢复成原始的二维数组
        /*
        1.先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组，
        2.再读取稀疏数组的后几行，赋值给原始的二维数组。
         */

//        1. 先读取稀疏数组的第一行，根据第一行的数据，创建原始的二维数组，
        int chessArr2[][] = new int[sparseArray[0][0]][sparseArray[0][1]];
//        2.再读取稀疏数组后几行的数据，并赋给原始的二维数组即可
        for (int i = 1; i < sparseArray.length; i++) {
            chessArr2[sparseArray[i][0]][sparseArray[i][1]] = sparseArray[i][2];
        }
        System.out.println();
        System.out.println("恢复后的二维数组");
        for (int[] row : chessArr2) {
            for (int item : row) {
                System.out.printf("%d\t", item);
            }
            System.out.println();
        }

    }
}
