/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mainpkg;

/**
 *
 * @author HP
 */
public class Registration {

    protected String courseTitle;
    protected int courseSection;
    protected int courseCredit;
    protected int scholarship;

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }

    public int getCourseSection() {
        return courseSection;
    }

    public void setCourseSection(int courseSection) {
        this.courseSection = courseSection;
    }

    public int getCourseCredit() {
        return courseCredit;
    }

    public void setCourseCredit(int courseCredit) {
        this.courseCredit = courseCredit;
    }

    public int getScholarship() {
        return scholarship;
    }

    public void setScholarship(int scholarship) {
        this.scholarship = scholarship;
    }

    public float getAmount() {
        float total = (float)this.courseCredit * 6000;
        float amount = total - (total*((float)this.scholarship/100));
        return amount;

    }

    public Registration() {
    }

    public Registration(String courseTitle, int courseSection, int courseCredit, int scholarship) {
        this.courseTitle = courseTitle;
        this.courseSection = courseSection;
        this.courseCredit = courseCredit;
        this.scholarship = scholarship;
    }

    public Registration(String courseTitle, int courseSection, int courseCredit) {
        this.courseTitle = courseTitle;
        this.courseSection = courseSection;
        this.courseCredit = courseCredit;
    }

    @Override
    public String toString() {
        return "Course Title  :   " + courseTitle + "      courseSection  :   " + courseSection + "    courseCredit   :    " + courseCredit;
    }

}
