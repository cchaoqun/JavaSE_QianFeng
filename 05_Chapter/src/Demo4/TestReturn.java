package Demo4;/*

�����﷨
    public static ����ֵ���� �������� (��ʽ�����б�){//�涨����ֵ�ľ������ͣ����������ã�void)

        //��������

        return value;//����ֵ���������󷵻�һ�����
    }

���÷���

    ���� = ��������(); 

Note:

1. һ������ֻ����һ������ֵ
2. ���з���ֵ�ķ������ڷ�֧�ṹʱ�����뱣֤ÿһ����֧��������ȷ�ķ���ֵ
    
*/

public class TestReturn{

    public static void main(String[] args){

        //���巽���������������ĺͣ������ؽ������main�д�ӡ

        int result = add(10, 5);//result: ���շ���ֵ���������õı��ʽ�����ռ������������صĽ��

        System.out.println(result);

        //�ڼ�����5+10�ĺ�֮�󣬼�����20����������

        int result2 = add(result, 20);

        System.out.println(result2);
    }


    public static int add (int num1, int num2){// int ����ֵ���ͣ�������Լ���˷��صĽ������

        int sum = num1 + num2;

        return sum;// sum ����ֵ���뷵��ֵ����ƥ��ľ�����
    }
}

