package Demo6;/*
ʲô�ǵݹ�
    ������мȶ����ɵ�����ʱ���ڷ����ڲ������������ı�̷���

��ʱʹ�õݹ�
    ����Ҫ�����������Բ��Ϊ���ɸ�С���⣬��С����Ľ��������ͬ�������е���������
    ʹ��ѭ������ĳ������⣬�������滻Ϊ�ݹ�

�ݹ�׳�
    �ݽ���ÿһ���ƽ������㶼����һ�α�ü򵥣�ֱ���򵥵���������ƽ������ܻ�ý����Ҳ�дﵽ����
    �ع飺���ڳ��ڵĽ����������ϻع飬���μ���ÿһ��Ľ����ֱ���ع鵽���

*/

/* 

�����ĸ���
    ʵ���ض����ܵ�һ�δ��룬���Է���ʹ��

���������
    public static ����ֵ���� �������� (�β��б�){
        ��������
        return ����ֵ
    }

�����ĵ���
    ��������(ʵ���б�)

�����ĺô�
    ����������룬��߸����ԣ��ɶ��ԣ�ά���ԣ�����ֹ�����

�ݹ�
    ����������Ϊ���ɸ�С���⣬��С����Ľ��������ͬ���й̶����ɣ������ó��ڣ������е����Լ�

*/

public class TestFactorial{

    public static void main(String[] args){

        //����׳�
        int result = factorial(5);

        System.out.println(result);
    }

    //����n�Ľ׳�
    public static int factorial(int n){

        if (n == 1){
            return 1;
        }else{
            return n * factorial(n-1);
        }
    }

/* 
    //����5�Ľ׳�
    public static int getFive(int n){// n = 5

        return n * getFour(n - 1);
        //return 5*24
    }
    //����4�Ľ׳�
    public static int getFour(int n){// n = 4

        return n * getThree(n - 1);
        //return 4*6
    }

    public static int getThree(int n){// n = 3

        return n * getTwo(n - 1);
        //return 3*2
    }

    public static int getTwo(int n){// n = 2

        return n * getOne(n - 1);
        // return 2*1
        
    }

    public static int getOne(int n){// n = 1

        return 1;
        
    }
*/
}