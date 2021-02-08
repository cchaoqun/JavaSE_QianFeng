package Demo3;

import java.util.Scanner;

public class TestDoWhile2 {
    
    public static void main(String[] args){

        //Student write code, Teacher gives evaluation
        //Program ends until teacher gives a 'Y'

        //Declare a Scanner class variable
        Scanner input = new Scanner(System.in);

        char Eva = 'Y';//Set a initial value

        do{
            System.out.println("Write code again");

            System.out.println("Please enter your evaluation");

            Eva = input.next().charAt(0);// Input 'Y' means satisfy the evaluation, otherwise, write the code until pass

        }while(Eva != 'Y');

        System.out.println("End of program");

    }
}