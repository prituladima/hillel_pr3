

public class StringsRev {
    public static void main(String[] args) {

        String s = "i_love_you";

//        for (int i = 0; i < s.length(); i++) {
//
//        }
//        System.out.println(new StringBuilder(s).reverse());
//        print(s, 0, s.length());
//        print2(s, s.length() - 1, -1);

        Stack stack = new Stack(s.length());
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }

        for (int i = 0; i < s.length(); i++) {
            System.out.print(stack.pop());
        }

    }

    private static class Stack {

        final char[] arr;
        final int cap;

        private Stack(int cap) {
            this.cap = cap;
            this.arr = new char[cap];
        }

        int pointer = -1;

        public void push(char ch) {
            arr[++pointer] = ch;
        }

        public char pop() {
            return arr[pointer--];
        }


        public char peek() {
            return arr[pointer];
        }

        public boolean isEmpty() {
            return pointer == -1;
        }


    }

    private static void print2(String s, int ind, int upTo) {
        if (upTo < ind) {
            System.out.print(s.charAt(ind));
            print2(s, ind - 1, upTo);
        }
    }

    private static void print(String s, int ind, int len) {
        if (ind < len) {
            print(s, ind + 1, len);
            System.out.print(s.charAt(ind));
        }
    }
}
