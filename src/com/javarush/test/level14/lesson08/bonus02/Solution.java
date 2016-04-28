package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int number1 = Integer.parseInt(reader.readLine());
        int number2 = Integer.parseInt(reader.readLine());
        System.out.println(getMostDiveder(number1, number2));
    }

    public static int getMostDiveder(int a, int b)
    {
        int diveder = (a < b) ? a : b;
        for (int i = diveder; i > 0; i--)
        {
            if ((a % i) == 0 && (b % i) == 0)
            {
                diveder = i;
                break;
            }
        }
        return diveder;
    }

}
