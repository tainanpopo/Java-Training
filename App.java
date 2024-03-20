// 類別的屬性 Class Attribute 或稱作 Static Attribute

class Test1{
    static int a = 10;
    static String s = "Hello Class";
}

class Test2{
    static double a = 3.14;
    // 程式進入點
    public static void main(String[] args) {
        System.out.println(Test1.a); // 10
        System.out.println(Test2.a); // 3.14
        System.out.println(Test1.s); // Hello Class
        Test1.a = 50;
        System.out.println(Test1.a); // 50
        Test1.a++;
        System.out.println(Test1.a); // 51
    }
}