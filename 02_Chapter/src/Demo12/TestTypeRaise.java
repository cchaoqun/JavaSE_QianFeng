package Demo12;

public class TestTypeRaise{
    public static void main(String[] agrs){
        System.out.println();
        //������������һ��Ϊ double,����������Ϊdouble

        int i1 = 10;

        double d1 = 5.0;

        double d2 = i1 + d1;

        System.out.println(d2);

        //�����������û��double,��һ��Ϊfloat,����������Ϊfloat

        float f1 = 3.0F;

        short s1 = 111;

        float f2 = f1 + s1;

        System.out.println(f2);

        //�����������û��float,��һ��Ϊlong,����������Ϊlong

        long l1 = 111;

        byte b1 = 123;

        long l2 = l1 + b1;

        System.out.println(l2);

        //�����������û��long,��һ��Ϊint,����������Ϊint

        int i2 = 123;

        short s2 = 456;

        int i3 = i2 + s2;

        System.out.println(i3);

        //�����������û��int,��Ϊbyte��short,�������Ծ�����Ϊint

        byte b2 = 111;

        short s3 = 222;

        int i4 = b2 + s3;

        System.out.println(i4);

        //�κ�������String ���ʱ��ʵΪƴ�ӣ������Զ�����ΪString

        int i5 = 123;

        String str1 = "Hello";

        String str2 = str1 + i5;

        System.out.println(str2);

        System.out.println("Hello" + i5);

        int javaScore = 100;

        System.out.println("java�ĳɼ�Ϊ�� " + javaScore);
    }
}