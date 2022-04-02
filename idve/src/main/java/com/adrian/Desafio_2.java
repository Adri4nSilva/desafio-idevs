package com.adrian;

import java.util.Scanner;

public class Desafio_2 {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        in.close();
    }
}

/*
    DESAFIO 2:
    *Escreva um algoritmo que mostre todos os números n menores que 10.000, onde n e n + 1 possuem o mesmo número de divisores. Por exemplo, considere a seguinte sequência de números e seus respectivos divisores:

    *Numero:                                            *Divisores
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 1                                                       1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 2                                                    2, 1 
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 3                                                    3, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 4                                                 4, 2, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 5                                                    5, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 6                                              6, 3, 2, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 7                                                    7, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 8                                              8, 4, 2, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 9                                                 9, 3, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 10                                            10, 5, 2, 1   
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 11                                                  11, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 12                                         12, 6, 3, 2, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 13                                                  13, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 14                                            14, 7, 2, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════
    * 15                                            15, 5, 3, 1
    ═══════════════════════════⊹⊱❖⊰⊹═════════════════════════════

    *Podemos concluir que dessa sequência somente os números 2 e 14 devem aparecer na tela.
*/