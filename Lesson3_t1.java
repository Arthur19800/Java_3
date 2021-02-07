package homework.lesson_2.task3_1;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// 1. Написать программу, которая загадывает случайное число от 0 до 9 и пользователю дается 3 попытки угадать это число.
        // При каждой попытке компьютер должен сообщить, больше ли указанное пользователем число, чем загаданное, или меньше.
        // После победы или проигрыша выводится запрос – «Повторить игру еще раз? 1 – да / 0 – нет»(1 – повторить, 0 – нет).
        Random rand = new Random();
        int a = rand.nextInt(10);
        Scanner scaner = new Scanner(System.in);
        Guess_number(a);
        System.out.println("Repeat once again?");
        int c = scaner.nextInt();
        if(c==1) {
            System.out.println("Yes");
        }
        else if(c==0){
            System.out.println("No");
        }

        }
	//  function checks inputted numbers 
    public static void Guess_number(int a) {
        int b;
        int count;
        count = 0;
        Scanner scaner = new Scanner(System.in);
        do {
            b = scaner.nextInt();
            count++;
            System.out.println("Guessed number is :" +b);
            if(b > a) {
                System.out.println("Guessed number is bigger than random one");
            }
            else if (b < a) {
                System.out.println("Guessed number is smaller than random one");
            }
        }
        while(count < 3);
    }

    }

