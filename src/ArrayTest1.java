/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-14 15:59
 */

/** ⑤数组元素的弄人初始化值
 *
 *         >数组元素是整形：0
 *         >数组元素是浮点型：0.0
 *         >数组元素是char型：0或‘\u0000’ 而不是‘0’
 *         >数组元素是布尔型：false
 *
 *
 *
 *         >数组元素是引用类型时： null  不是"null"
 *
 *
 *        ⑥数组的内存解析：
 *        内存的简化结构：
 *        栈(stack) 存放局部变量
 *        堆(heap)存放 new出来的结构 ： 比如：对象、数组
 *
 *        方法区：常量池 静态域
 * */
public class ArrayTest1 {
    public static void main(String[] args) {

        int[] arr = new int[4];
        for (int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("**********");


        short[] arr1 = new short[4];
        for (int i = 0; i < arr1.length; i++){
            System.out.println(arr1[i]);
        }
        System.out.println("**********");


        float[] arr2 = new float[4];
        for (int i = 0; i < arr2.length; i++){
            System.out.println(arr2[i]);
        }
        System.out.println("**********");


        char[] arr3 = new char[4];
        for (int i = 0; i < arr3.length; i++){
            System.out.println(arr3[i]);
        }
        System.out.println("**********");


        boolean[] arr5 = new boolean[4];

        System.out.println(arr5[0]);


        String[] arr6 = new String[4];
        System.out.println(arr6[0]);



    }

}
