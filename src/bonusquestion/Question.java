/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bonusquestion;

/**
 *
 * @author ntali
 */
public class Question {
    private int grade;
    
    Question(int grade){
        this.grade = grade;
    }
    
    public void setGrade(int grade){
        this.grade = grade;
    }
    
    public int getGrade(){
        return grade;
    }
}