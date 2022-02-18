import java.util.Scanner;

public class TriangleClassifier {
    public static String testEquilateral(int a, int b, int c) {
        int edgeA = a;
        int edgeB = b;
        int edgeC = c;
        String display = "";
        if (a==b&b==c) {
            display = "equilateral triangle";
        }
        else{
            if (a==0&c==b){
                display="no triangle";
            }
        }
        if (a==b&a!=c&b!=c){
            display="isosceles triangle";
        }
        if (a!=b&b!=c&c!=a){
            display="regular triangle";
        }
        if (a+b<c || b+c<a || a+c<b){
            display="no triangle";
        }
        return display;
    }
}