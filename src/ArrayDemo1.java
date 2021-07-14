import java.util.Scanner;

/**
 * @version 1.0
 * @author: jiazhihao
 * @date: 2021-07-14 18:02
 */
public class ArrayDemo1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入学生人数");
        int number = input.nextInt();
        // 2.创建数组，存储学生成绩；动态初始化
        int [] scores = new int[number];
        //3.给数组中的元素赋值
        System.out.println("请输入"+number+"个学生成绩");
        for (int i = 0; i < scores.length; i++) {
            scores[i] = input.nextInt();
        }
        //4,获取数组中的元素的最大值：最高分
        int maxScore = 0;
        for (int i = 0; i < scores.length; i++) {
            if(maxScore < scores[i]){
                maxScore = scores[i];
            }
        }
        //5.根据每个学生成绩与最高分的差值，得到每个学生的等级，并输出等级和成绩
        char level;
        for (int i = 0; i < scores.length; i++) {
            if(maxScore - scores[i] <=10){
                level = 'A';
            }else if(maxScore - scores[i] <=20){
                level = 'A';
            }else if(maxScore - scores[i] <=30){
                level = 'A';
            }else{
                level = 'D';
            }
            System.out.println("student" + i + "score is" + scores[i]+",grade is"+level);

        }
    }
}
