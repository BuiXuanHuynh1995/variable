public class Main {
    public static void main(String[] args) {
        boolean valid;   //default = false;
        boolean active = true;
        char c = 'h';
        short s = 1;    //[-2^15 - 2^15 -1]
        int i = 10;     //[-2^31 - 2^31 -1]
        long l = 10;    //[-2^63 - 2^63 -1]
        double d = 10d;
        float f = 10f;
        System.out.println(c);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(d);
        System.out.println(f);

        ////////////////////////////////////
        int height = 0;
        double with = 220.35;

        double result = height; //eps kiểu rộng/không tường minh;
        System.out.println("giá trị của result sau khi ép kiểu: "+ result);
        int witdh = (int) with; // ép kiểu hẹp/tường minh
        System.out.println("giá truh cua width sau khi ép kiểu: "+ witdh);
    }

}
