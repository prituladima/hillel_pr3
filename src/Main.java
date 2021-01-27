public class Main {
    static int cnt = 0;

    public static void main(String[] args) {
        //[0..n)
        //[0..0)
        //[0..1)
        //[10..n)

        int L = 10;
        int R = 30;
//< <= >= <
//        for (int i = R - 1; L - 1 < i; i--) {
//            System.out.println(i);
//        }

        //[29..9)
//        print1(L, R);
//        print2(R - 1, L - 1);

        String output = "djbdf";
        print3(L, R, output);
        System.out.println(output);

    }

    private static void print3(int l, int r, String stringBuilder) {
        if (l < r) {
            stringBuilder = stringBuilder.concat(String.valueOf(l)).concat(String.valueOf(' '));
            print3(l + 1, r, stringBuilder);
        }
    }

    private static void print1(int l, int r) {
        if (l < r) {
            System.out.println(l);
            print1(l + 1, r);
        }
    }

    private static void print2(int r, int l) {
        if (l < r) {
            print2(r - 1, l);
            System.out.println(r);
        }
    }

}