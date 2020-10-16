public class Checkerboard {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        String checker = "";
        for (int j = 1; j <= n; j++) {
            if (j % 2 == 0)
                checker = " ";
            else
                checker = "";
            for (int i = 0; i <= n; i++) {
                if (i == n)
                    System.out.println(checker);
                else
                    checker += "* ";
            }
        }
    }
}
