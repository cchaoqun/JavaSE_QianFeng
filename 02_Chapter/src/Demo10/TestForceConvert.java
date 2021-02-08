package Demo10;

public class TestForceConvert{
    public static void main(String[] args){
        
        //����֮���ת��

        //�����㹻����������
        short s1 = 123;

        byte b1 = (byte)s1;

        System.out.println(b1);

        //���Ȳ��������ݽض�

        //2���ֽ�ת��Ϊ1���ֽڣ�������ǰ��λ�ض�ֻʣ�º��λ�����ܻ�������ݱ仯�Լ����Ÿı�

        short s2 = 257;

        byte b2 = (byte)s2;

        System.out.println(b2);

        //���Ȳ������ضϺ���ſ��ܷ����仯

        //��������λ 0�������� 1�������� �ضϺ���λ�� 0->1 ,��������Ϊ����

        short s3 = 130;

        byte b3 = (byte)s3;

        System.out.println(b3);

        //С�� ǿת ����

        double  d1 = 2.99;

        int i1 = (int)d1;

        System.out.println(i1);

        //�ַ� ǿת ����

        char c1 = 'A';

        int i2 = c1;//�Զ�����ת��

        System.out.println(i2);

        char c2 = (char)i2;//ǿ������ת��

        System.out.println(c2);

        //�ַ�������ת����ע������

        short s4 = -1;//-32768 ~ 32767
        //short���ʹ��ڸ�������char���Ͷ�Ӧ��0��ʼ�����ǿ��ת��������Ϊ�������޷��ҵ���ӦASCII���Ӧ������� ��

        char c3 = (char)s4;

        System.out.println(c3);



    }
}