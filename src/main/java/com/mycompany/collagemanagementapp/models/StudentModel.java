/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.collagemanagementapp.models;

/**
 *
 * @author hp
 */
public class StudentModel {
    
    int id;
    String name;
    int feeApplicable;
    int feePaid;
    int feePending;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getFeeApplicable() {
        return feeApplicable;
    }

    public void setFeeApplicable(int feeApplicable) {
        this.feeApplicable = feeApplicable;
    }

    public int getFeePaid() {
        return feePaid;
    }

    public void setFeePaid(int feePaid) {
        this.feePaid = feePaid;
    }

    public int getFeePending() {
        return feePending;
    }

    public void setFeePending(int feePending) {
        this.feePending = feePending;
    }

    public StudentModel(int id, String name, int feeApplicable, int feePaid, int feePending) {
        this.id = id;
        this.name = name;
        this.feeApplicable = feeApplicable;
        this.feePaid = feePaid;
        this.feePending = feePending;
    }
          
}
