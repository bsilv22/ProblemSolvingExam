/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examproblem;

/**
 *
 * @author Brett
 */
public class ExamProblem {

    // ToDo1: the following instance members declaration violates encapsulation principles,
    // also one of the names is not compatible with Java naming convention, fix these 3 problems
    private String studentName;

    private String studentAddress;

    public ExamProblem() {

        this.studentName = "";

        this.studentAddress = "";

    }

    // ToDo2: Overload the constructor with another that accepts name and address. Use the parameters to initialize 
    // instance members. 
    public ExamProblem(String studentName, String studentAddress) {

        this.studentName = studentName;
        this.studentAddress = studentAddress;

    }

    public void setStudentName(String newName) {
        this.studentName = newName;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentAddress(String newStudentAddress) {
        this.studentAddress = newStudentAddress;
    }

    public String getStudentAddress() {
        return studentAddress;
    }

    // ToDo3: add 4 methods as setters and getters for the previous instance members.
}
