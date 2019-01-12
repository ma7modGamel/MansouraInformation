package com.example.xxpc.mansorainfo;

public class ModelDoctor {
   private String nameDoctor;
   private String phoneDoctor;
   private String locationDoctor;

    public String getNameDoctor() {
        return nameDoctor;
    }

    public String getPhoneDoctor() {
        return phoneDoctor;
    }

    public String getLocationDoctor() {
        return locationDoctor;
    }

    public ModelDoctor(String nameDoctor, String phoneDoctor, String locationDoctor) {
        this.nameDoctor = nameDoctor;
        this.phoneDoctor = phoneDoctor;
        this.locationDoctor = locationDoctor;
    }
}
