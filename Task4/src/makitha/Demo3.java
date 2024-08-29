package makitha;
class B1 {
    private int a;
    private String b;
    public B1()
    {
        super();
    }
    public B1(int a, String b)
    {
        super();
        this.a = a;
        this.b = b;
    }
    public int getA()
    {
        return a;
    }
    public void setA(int a)
    {
        this.a = a;
    }
    public String getB()
    {
        return b;
    }
    public void setB(String b)
    {
        this.b = b;
    }
    public String toString()
    {
        return "B1 [a=" + a + ", b=" + b + "]";

    }


}


public class Demo3 {
    public static void main(String[] args)
    {
        B1 b1 = new B1();
        b1.setA(10);
        b1.setB("Hello");
        System.out.println(b1.getA());
        System.out.println(b1.getB());
        System.out.println(b1.toString());
    }

}
