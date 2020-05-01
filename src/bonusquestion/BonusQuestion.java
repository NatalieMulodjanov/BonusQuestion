/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusquestion;

/**
 *
 * @author Natalie Mulodjanov
 */
public class BonusQuestion {

    public static void main(String[] args) {
       Question grade1 = new Question(99);
       
       grade1.setGrade(100);
        System.out.println("The grade new is: " + grade1.getGrade() );
    }
    
}
