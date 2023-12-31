package com.example.be.dto;

import com.example.be.entities.Clinic;
import com.example.be.entities.User;
import com.example.be.entities.enums.NumberStar;

public class RateRequest {

    private NumberStar numberStar;

    private User expert;

    private Clinic clinic;

    public User getExpert() {
        return expert;
    }

    public void setExpert(User expert) {
        this.expert = expert;
    }

    public NumberStar getNumberStar() {
        return numberStar;
    }

    public void setNumberStar(NumberStar numberStar) {
        this.numberStar = numberStar;
    }

    public Clinic getClinic() {
        return clinic;
    }

    public void setClinic(Clinic clinic) {
        this.clinic = clinic;
    }
}
