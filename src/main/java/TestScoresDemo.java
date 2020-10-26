/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Client
 */
public class TestScoresDemo {
    public static void main(String[] args) throws InvalidTestScoreException {
        
        double[] testData = {95.5, 90.0, 80.4, 75.8, -68.5, 80.5};
        double[] testData2 = {95.5, 88.0, 80.0, 79.6, 85.9};
        
        TestScores scores = new TestScores(testData);
        TestScores scores2 = new TestScores(testData2);
        
        System.out.println(scores2.getAverage());
        System.out.println(scores.getAverage());
       
        
    }
}
