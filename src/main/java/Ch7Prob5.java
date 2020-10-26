/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class Ch7Prob5 {
    public static void main(String[] args) {
        int [] array1 = {4, 10, 150, 40, 55, 85, 92};
        greaterThan(array1, 70);        
    }
    public static void greaterThan (int[] arrayToCompare, int n) {
        for (int i = 0; i < arrayToCompare.length; i++){
            if (arrayToCompare[i] > n){
                System.out.println(arrayToCompare[i]);
            }
        }
    }
}
