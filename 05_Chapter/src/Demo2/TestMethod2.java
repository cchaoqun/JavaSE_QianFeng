package Demo2;

public class TestMethod2 {
    

    //�����ڶ�ε���printSignʱ��ӡ��ͬ������ '-'
    public static void main(String[] args){

        System.out.println("��ǰ���¹�");

        printSign(5);//ʵ�ʲ�����10���ڵ��ô��η���ʱ�����봫��ʵ�ʲ���ֵ��Ϊ��ʽ������ֵ

        System.out.println("���ǵ���˪");
   
        printSign(10);

        System.out.println("��ͷ������");
      
        printSign(15);

        System.out.println("��ͷ˼����");

        printSign(20);
    }

    //�Զ��巽��
    public static void printSign(int count){//int count : ��ʽ����������������ʱ��ѭ��count��

        for (int i = 1; i <= count; i++){

            System.out.print("-");
        }

        System.out.println();
    }
    
}