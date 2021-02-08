package Demo04;

/**
 * ������������ ��С����
 */
public class TestType2{
    public static void main(String[] args){

        //float ������С���� double ˫����С��

        double d = 1.2;

        System.out.println(d);

        double d2 = 1;

        System.out.println(d2);

        float f = 1.5F;

        System.out.println(f);//�κ�С������ֵĬ�����Ͷ�Ϊdouble,���Ҫ�洢��float�����У���Ҫ׷�ӡ�F"

        //��ѧ������

        double d3 = 2E3;//2 * 10 ^ 3
        System.out.println(d3);

        double d4 = 2E7;//2 * 10 ^ 7
        System.out.println(d4);

        float f2 = 5E4F;//5 * 10 ^ 4 ׷��F����float
        System.out.println(f2);

        //ȡֵ��Χ�Ĳ���

        //float������ȡֵ��Χ 0.0000000000000000000000000000000000000000000014F ~ 340000000000000000000000000000000000000F

        float floatMin = 0.0000000000000000000000000000000000000000000014F;//float��С������
        
        float floatMax = 340000000000000000000000000000000000000F;//float���������

        System.out.println(floatMin);
        System.out.println(floatMax);

        //float������ȡֵ��Χ -340000000000000000000000000000000000000F ~ -0.0000000000000000000000000000000000000000000014F

        float floatMin2 = -340000000000000000000000000000000000000F;//float��С������
        
        float floatMax2 = -0.0000000000000000000000000000000000000000000014F;//float�������

        System.out.println(floatMin2);
        System.out.println(floatMax2);

        //double ������ȡֵ��Χ

        double doubleMin = 4.9E-324;//double��С������
        double doubleMax = 1.7E308;//double���������

        System.out.println(doubleMin);
        System.out.println(doubleMax);

        double doubleMin2 = -1.7E308;//double��С������
        double doubleMax2 = -4.9E-324;//double�������

        System.out.println(doubleMin2);
        System.out.println(doubleMax2);
    }
}