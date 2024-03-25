class Test{
    public static void main(String[] args) {
        // 程式進入點
        Test.talk(); // 呼叫類別的方法
        BasicMath.add(3, 5); // 加法 8 
        BasicMath.multiply(9, 9); // 乘法 81
    }
    // 定義更多自己的類別方法（用來把類似的功能放在一起，分門別類組織程式）
    static void talk(){
        System.out.println("Hello");
    }
}

// 將數學運算都集合放在一起，方便組織程式
class BasicMath{
    static void add(int n1, int n2){
        System.out.println(n1 + n2);
    }
    static void multiply(int n1, int n2){
        System.out.println(n1 * n2);
    }
}