public class Vector3 {
    private int a;
    private int b;
    private int c;

    public Vector3(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Vector3() {
        this(0, 0, 0);
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getC() {
        return c;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public void setC(int c) {
        this.c = c;
    }

    public Vector3 add(Vector3 other) {
        this.a += other.a;
        this.b += other.b;
        this.c += other.c;
        return this;
    }

    public Vector3 subtract(Vector3 other) {
        this.a -= other.a;
        this.b -= other.b;
        this.c -= other.c;
        return this;
    }

    public int dot(Vector3 other) {
        return this.a * other.a + this.b * other.b + this.c * other.c;
    }

    public Vector3 multiply(int scalar) {
        this.a *= scalar;
        this.b *= scalar;
        this.c *= scalar;
        return this;
    }
}