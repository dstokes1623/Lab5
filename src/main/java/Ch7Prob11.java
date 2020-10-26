/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class Ch7Prob11 {
    public static void main(String[] args) {
        int [] testArray = {32, 10, 44, 92, 53, 99};
        
        System.out.println("Total: " + getTotal(testArray));
        System.out.println("Average: " + getAverage(testArray));
        System.out.println("Highest value: " + getHighest(testArray));
        System.out.println("Lowest value: " + getLowest(testArray));
    }
    public static int getTotal(int [] arr){
        int total = 0;
        
        for (int i = 0; i < arr.length; i++){
            total += arr[i];
        }
        return total;
    }
    
    public static double getAverage(int [] arr){
        return getTotal(arr) / arr.length;
    }
    public static int getHighest (int [] arr){
        int highestValue = 0;
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] > highestValue){
                highestValue = arr[i];
            }
        }
        return highestValue;
    }
    
    public static int getLowest (int [] arr) {
        int lowestValue = arr[0];
        
        for (int i = 0; i < arr.length; i++){
            if (arr[i] < lowestValue){
                lowestValue = arr[i];
            }
        }
        return lowestValue;
    }
}