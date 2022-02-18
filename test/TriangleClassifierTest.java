import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TriangleClassifierTest {

    @Test
    void testEquilateral() {
        int a=2;
        int b=2;
        int c=2;
        String Expected="equilateral triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
    @Test
    void testEquilateral1() {
        int a=2;
        int b=2;
        int c=3;
        String Expected="isosceles triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
    @Test
    void testEquilateral2() {
        int a=3;
        int b=4;
        int c=5;
        String Expected="regular triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
    @Test
    void testEquilateral3() {
        int a=8;
        int b=2;
        int c=3;
        String Expected="no triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
    @Test
    void testEquilateral4() {
        int a=-1;
        int b=2;
        int c=1;
        String Expected="no triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
    @Test
    void testEquilateral5() {
        int a=0;
        int b=1;
        int c=1;
        String Expected="no triangle";
        String result = TriangleClassifier.testEquilateral(a,b,c);
        assertEquals(Expected,result);
    }
}