package Class15;

public class MPractice4 {
    int largNum(int num1, int num2) {
        if (num1 > num2) {
            return num1;
        } else {
            return num2;
        }
    }
    public static void main (String[] args) {
        MPractice4 mp=new MPractice4();
        System.out.println(mp.largNum(12,13));
    }
}
