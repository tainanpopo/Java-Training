public class DataTypeVariable{
    public static void main(String[] args){
        System.out.println("Hello Java");
        //在終端機印出各種型態的資料
        //整數 預設是int型態
        int x;
        x=3;
        System.out.println(x);
        x=120;
        System.out.println(x); //可以覆蓋
        //長整數，數字的後面須加上L
        long y=46666666666666L;
        System.out.println(y);
        //浮點數，預設為double型態
        double m=3.14159268;
        System.out.println(m);
        //單精度浮點數，數字的後面須加上F
        float n=3.14159268F;
        System.out.println(n); //只到小數點後第7位，超過則四捨五入
        //布林值
        boolean b=true;
        System.out.println(b);
        //字元
        char c='嗨';
        System.out.println(c);
        //字串：可以包含0到多個字元
        String s="我愛Coding";
        System.out.println(s);
        s="Java真好玩";
        System.out.println(s); //可以覆蓋

    }
}