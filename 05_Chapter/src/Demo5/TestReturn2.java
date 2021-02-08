package Demo5;/*
return�������÷�

    1.Ӧ�����з���ֵ���͵ķ����У�
        return value;//��ʾ������ǰ�����������з���ֵ�����ص����÷�����
    
    2.Ӧ����û�з���ֵ����(void)�ķ����У�
        return;//��ʾ������ǰ������ֱ�ӷ��ص����÷�����

����С��

    1.һ�����п��Զ�����������ÿ������֮�����ڲ��й�ϵ������Ƕ��
    2.ͨ��һ������ֻ���һ������
    3.���ٴ������ࣻ��߸����ԣ���߿ɶ��ԣ���߿�ά���ԣ�����ֹ�����

*/



public class TestReturn2{

    public static void main(String[] args){

        double result = add(1.5, 10.2);

        System.out.println("��������" + result);

        //--------------------------------------------

        String str = isEven(10);

        System.out.println(str);

        //--------------------------------------------

        show();


    }

    public static double add(double a, double b){

        double sum = a + b;

        System.out.println("�������");

        return sum;//������ǰ�����������з���ֵ�����ص��������ó�
    }

    public static String isEven(int num){

        if(num % 2 == 0){
            return "ż��";
        }else{
            return "����";
        }
    }

    public static void show(){

        for (int i = 1; i <= 10; i++){

            System.out.println("��ǰֵ" + i);
            if (i == 5){
                return;//���˴���break,����������forѭ����������ִ�з�����������䣬��return������������������һ�������������������һ��
            }
        }
    }
}

