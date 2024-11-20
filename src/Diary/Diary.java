/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Diary;

import java.io.Serializable;

/**
 *
 * @author x23157461
 */
public class Diary implements Serializable{
    
    private String entryTitle, entryText, Date;
    private int feelingsRating;
    
    public Diary(){
        
    }
    
    public Diary(String entryTitle, String entryText, String Date){
        this.entryTitle = entryTitle;
        this.entryText = entryText;
        this.Date = Date;
    }

    public int getFeelingsRating() {
        return feelingsRating;
    }

    public void setFeelingsRating(int feelingsRating) {
        this.feelingsRating = feelingsRating;
    }

    public String getEntryTitle() {
        return entryTitle;
    }

    public void setEntryTitle(String entryTitle) {
        this.entryTitle = entryTitle;
    }

    public String getEntryText() {
        return entryText;
    }

    public void setEntryText(String entryText) {
        this.entryText = entryText;
    }

    public String getDate() {
        return Date;
    }

    public void setDate(String Date) {
        this.Date = Date;
    }

    @Override
    public String toString() {
        return "Diary Entry{" + "Date= " + Date + ", Entry Title= " + entryTitle + ", Entry Text= " + entryText + ", Feelings Rating= " + feelingsRating + '}';
    }
}
