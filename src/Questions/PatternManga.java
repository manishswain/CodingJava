package Questions;

public class PatternManga {
    public static void main(String[] args) throws Exception {
        int n = 10;
        int no = n * 2 - 1;
        int temp, ptemp;
        long start = System.currentTimeMillis();
        for (int i = 0; i < no; i++) {
            int tempn = n;
            if (i <= no / 2) {
                temp = i;
                ptemp = i;
            } else {
                temp = no - i - 1;
                ptemp = no - i - 1;
            }
            for (int j = 0; j < no; j++) {
                if (j == 0) {
                    System.out.print(tempn + " ");
                    continue;
                }
                while (temp != 0) {
                    System.out.print(--tempn + " ");
                    temp--;
                    j++;
                }
                while (ptemp + j < no) {
                    System.out.print(tempn + " ");
                    j++;
                }
                while (ptemp > 0) {
                    System.out.print((++tempn) + " ");
                    ptemp--;
                    j++;
                }
                System.out.println();
            }
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
}
