/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class TestScores {
    private double[] testScores;
    
    
    public TestScores(double[] scores){
        this.testScores = scores;
    }
    
    public double getAverage() throws InvalidTestScoreException{
        double total = 0;
        
        for(int i = 0; i < testScores.length; i++){
            if(testScores[i] < 0 || testScores[i] > 100)
                throw new InvalidTestScoreException("Test score cannot be negative or greater than 100!");
            total += testScores[i];
        }
        return total / testScores.length;
    }
}
