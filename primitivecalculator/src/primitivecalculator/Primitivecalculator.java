/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primitivecalculator;

import java.util.*;

public class Primitivecalculator 
{
    private static int min(int k,int l)
    {
        int min=l;
        if(k<l)
        {
            min=k;
        }
        return min;
    }
    private static List<Integer> optimal_sequence(int n) {
    List<Integer> sequence = new ArrayList<>();

    int[] arr = new int[n + 1];

    for (int i = 1; i < arr.length; i++) {
        arr[i] = arr[i - 1] + 1;
        if (i % 2 == 0) arr[i] = min(1 + arr[i / 2], arr[i]);
        if (i % 3 == 0) arr[i] = min(1 + arr[i / 3], arr[i]);

    }

    for (int i = n; i > 1; ) {
        sequence.add(i);
        if (arr[i - 1] == arr[i] - 1)
            i = i - 1;
        else if (i % 2 == 0 && (arr[i / 2] == arr[i] - 1))
            i = i / 2;
        else if (i % 3 == 0 && (arr[i / 3] == arr[i] - 1))
            i = i / 3;
    }
    sequence.add(1);

    Collections.reverse(sequence);
    return sequence;
}


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        List<Integer> sequence = optimal_sequence(n);
        System.out.println(sequence.size() - 1);
        for (Integer x : sequence) {
            System.out.print(x + " ");
        }
    }
}

