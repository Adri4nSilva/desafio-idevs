package com.adrian;

import java.util.Scanner;

public class Desafio_3 
{
    public static boolean ePrimo(int value)
    {
        if(value<=1)
        {
            return false;
        }
        //══════════⊹⊱❖⊰⊹════════════
        for(int i=2; i<value; i++)
        {
            if(value % i == 0)
            {
                return false;
            }
        }
        //══════════⊹⊱❖⊰⊹════════════
        return true;
    }
    public static int somaPrimo(int value)
    {
        int soma=0, i=1;
        while(i <= value)
        {
            if(ePrimo(i))
            {
                soma+=i;
            }
            i+=1;
        }
        return soma;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        System.out.print("Insira um numero: ");
        int value = in.nextInt();
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        int currentSum = 0;
        int currentNumber = 6;
        
        while ((currentSum + currentNumber) < value) 
        {
            if (ePrimo(currentNumber)) 
            {
                currentSum += currentNumber;
            }
            currentNumber++;
        }
        System.out.println(currentSum);
        in.close();
    }
}

/*
    DESAFIO 3:
    *O número primo 41, pode ser escrito como a soma de 6 números primos consecutivos:

    *41 = 2 + 3 + 5 + 7 + 11 + 13

    *Essa é a maior soma de números primos consecutivos que gera um número primo abaixo de 100.

    *A maior soma de números primos consecutivos abaixo de 500 que gera um número primo contém 14 termos e é igual à 281:

    *281 = 2 + 3 + 5 + 7 + 11 + 13 + 17 + 19 + 23 + 29 + 31 + 37 + 41 + 43

    *Faça um algoritmo que receba um número n e mostre qual é o maior número primo abaixo de n que é obtido através da soma consecutiva de números primos.

    maior primo abaixo de 1000 que é obtido atraves da soma consecutiva é 827
*/