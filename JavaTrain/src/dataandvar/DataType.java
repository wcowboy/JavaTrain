package dataandvar;

public class DataType {
    byte a;
    short b;
    int c;
    long d = 3L;
    float e = 3.0f;
    double f = 3.0d;
    char g;
    boolean h = true;
    public static final int STUDY_TIME = 1000;


    public static void main(String[] args) {
        char name1 = '王';
        char name2 = '天';
        char name3 = '锐';
        System.out.println("name: " + name1 + name2 + name3);
    }
    short q = 3;
    int w = 4;
    short sum = (short) (q + w);

}
