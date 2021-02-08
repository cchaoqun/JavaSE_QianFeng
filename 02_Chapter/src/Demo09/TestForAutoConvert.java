package Demo09;

public class TestForAutoConvert{
    public static void main(String[] args){
        System.out.println();
        //����-����

        short s = 123;

        int i1 = s;//��ԭ����ֵ���뵽Ŀ�����ͱ����У��Զ�����ת����

        System.out.println(i1);

        byte b = 100;

        short s2 = b;//�Զ�����ת��

        System.out.println(s2);

        //С��-С��

        float f = 1.5F;

        double b1 = f;//�Զ�����ת��

        System.out.println(b1);

        //С��-����

        int i2 = 200;

        double d2 = i2;//�Զ�����ת��

        System.out.println(d2);

        //�ַ�-����

        char c1 = 'A';

        int i3 = c1;//�Զ�����ת��

        System.out.println(i3);

        //�ַ�-С��

        char c2 = 'a';

        double i4 = c2;//�Զ�����ת��

        System.out.println(i4);

        //boolean�޷�����������ת��

        boolean b3 = true;

        //int i5 = b3;
    }
}