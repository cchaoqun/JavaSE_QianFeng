package Demo1;

public class TestMethod2 {
    //������
    public static void main(String[] args){
        System.out.println("��ǰ���¹�");

        //�����Զ��巽��
        printSign();
        System.out.println("���ǵ���˪");

        //�����Զ��巽��
        printSign();

        System.out.println("��ͷ������");

        //�����Զ��巽��
        printSign();

        System.out.println("��ͷ˼����");

        //�����Զ��巽��
        printSign();
    }

    //�Զ��巽��
    public static void printSign(){

        for (int i = 1; i <= 10; i++){

            System.out.print("-");
        }

        System.out.println();
    }
    
}