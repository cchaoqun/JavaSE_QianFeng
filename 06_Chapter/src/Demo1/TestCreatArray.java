package Demo1;/* 

����ĸ���
    һ�������Ĵ洢�ռ䣬�洢�����ͬ�������͵�ֵ
�ص�
    ������ͬ
    ���ȹ̶� 

��������
    ������ÿ�����ݳ�Ϊ"Ԫ��"
    ��ÿ��Ԫ�ؽ��еĴ洢��ȡֵ������Ϊ"Ԫ�صķ���"
    ����Ԫ��ʱ����ʹ��"�±�"(��0��ʼ������+1���Զ�����)
    ���ʵ��﷨��������[�±�]// a[0] = 10; ȡ a[0];

*/

public class TestCreatArray{

    public static void main(String[] args){

        int[] a = new int[5];
        // = ��ߣ�����int�������ͱ��������������Ϊa
        // = �ұߣ����䳤��Ϊ5�������ռ�

        a[0] = 10;
        a[1] = 11; 
        a[2] = 22;
        a[3] = 33;
        a[4] = 44;

        // System.out.println(a[0]);
        // System.out.println(a[1]);
        // System.out.println(a[2]);
        // System.out.println(a[3]);
        // System.out.println(a[4]);

        //������±���Ч��Χ

        // a[-1] = 100; //�������Ч��Χ 0 ~ ���鳤��-1
        // a[5] = 101;

        //����ı���: ��ͷ��β����һ�������ÿ��Ԫ�ؽ��з���

        for (int i = 1; i <= a.length; i++){

            System.out.println(a[i-1]);
        }

        
    }
}