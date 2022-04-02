package com.adrian;

import java.util.Scanner;

public class Desafio_1 
{
    public static void main(String[] args)
    { 
        Scanner in = new Scanner(System.in);
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //leitura da palavra ou texto:
        System.out.print("Informe a palavra ou frase para ser contada: ");    
        String palavra = in.nextLine().toLowerCase();
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //contadores se inicializando em 0
        int contador_1=0, contador_2=0, contador_3=0, contador_4=0,contador_5=0,contador_8=0,contador_10=0, total=0;
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //laço de repetição para contabilizar a palavra || texto digitado
        for(int i=0; i<palavra.length(); i++)
        {
            //switch case usado para separar os valores das letras e fazer a soma
            switch(palavra.charAt(i))
            {
                case 'a': case 'e': case 'i': case 'o': case 'u': case 'l': case 'n': case 'r': case 's': case 't':
                    contador_1++;
                    break;
                case 'd': case'g':
                    contador_2+=2;
                    break;
                case 'b': case'c': case 'm': case 'p':
                    contador_3+=3;
                    break;
                case 'f': case'h': case 'v': case 'w': case 'y':
                    contador_4+=4;
                    break;
                case 'k':
                    contador_5+=5;
                    break;
                case 'j': case'x':
                    contador_8+=8;
                    break;
                case 'q': case 'z':
                    contador_10+=10;
                    break;
            }
        }
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //contador final:
        total = (contador_1 + contador_2 + contador_3 + contador_4 + contador_5 + contador_8 + contador_10);
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //Impressão dos dados
        System.out.println("O valor de: " + palavra + " vale: " + total);
        //═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
        //fechamento do Scanner (por conta do VScode)
        in.close();
    }
}

/*
    DESAFIO 1:
    *Dado uma palavra qualquer p, construa um algoritmo que calcule a pontuação da palavra de acordo com a pontuação informada na tabela abaixo:
    
    *- Letra:                                           *- Valor:      
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * A, E, I, O, U, L, N, R, S, T                      * 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * D, G                                              * 2      
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * B, C, M, P                                        * 3
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * F, H, V, W, Y                                     * 4
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * K                                                 * 5
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * J, X                                              * 8
   ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * Q, Z                                              * 10
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════

    *Por exemplo, se a palavra “desafio” for digitada, a pontuação esperada será 11:
    *- D   E   S   A   F   I   O
    *- 2 + 1 + 1 + 1 + 4 + 1 + 1 = 11
*/    
