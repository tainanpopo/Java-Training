import java.util.Scanner;
public class Array {
    public static void main(String[] args) {
        // 陣列的基本操作練習
        // int[] grades = new int[3];
        // 可在初始化時就給定資料
        // int[] grades = new int[]{90, 80, 70};
        // System.out.println("陣列的長度：" + grades.length);
        // grades[0] = 90;
        // grades[1] = 80;
        // grades[2] = 70;
        
        // for(int i=0;i<grades.length;i++){
        //     System.out.println(grades[i]);
        // }
        
        // 輸入學生的數量，以及每位學生的成績，計算平均數
        System.out.println("請輸入有幾位學生？");
        Scanner s = new Scanner(System.in);
        int nunber = s.nextInt();
        int[] grades = new int[nunber];
        System.out.println("請逐一輸入學生的成績：");
        for(int i=0;i<grades.length;i++){
            grades[i] = s.nextInt();
        }
        // 加總，並計算平均數
        float total = 0;
        for(int i=0; i<grades.length;i++){
            total += grades[i];
        }
        total /= grades.length;
        System.out.println("平均成績為：" + total);
        s.close();
    }
}
