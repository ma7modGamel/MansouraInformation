package com.example.xxpc.mansorainfo;


import android.os.Parcel;
import android.os.Parcelable;

public class ModelCofe implements Parcelable{
   private String nameCofe;
   private String phoneCofe;
   private String LinkCofe;
   private String locationcofe;

   private  int p1,p2,p3;

    public ModelCofe(String nameCofe, String phoneCofe, String linkCofe, int p1, int p2, int p3, String locationcofe) {
        this.nameCofe = nameCofe;
        this.phoneCofe = phoneCofe;
        LinkCofe = linkCofe;
        this.locationcofe = locationcofe;
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;
    }

    protected ModelCofe(Parcel in) {
        nameCofe = in.readString();
        phoneCofe = in.readString();
        LinkCofe = in.readString();
        locationcofe = in.readString();
        p1 = in.readInt();
        p2 = in.readInt();
        p3 = in.readInt();
    }

    public static final Creator<ModelCofe> CREATOR = new Creator<ModelCofe>() {
        @Override
        public ModelCofe createFromParcel(Parcel in) {
            return new ModelCofe(in);
        }

        @Override
        public ModelCofe[] newArray(int size) {
            return new ModelCofe[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    public String getNameCofe() {
        return nameCofe;
    }

    public String getPhoneCofe() {
        return phoneCofe;
    }

    public String getLinkCofe() {
        return LinkCofe;
    }

    public String getLocationcofe() {
        return locationcofe;
    }

    public int getP1() {
        return p1;
    }

    public void setP1(int p1) {
        this.p1 = p1;
    }

    public int getP2() {
        return p2;
    }

    public void setP2(int p2) {
        this.p2 = p2;
    }

    public int getP3() {
        return p3;
    }

    public void setP3(int p3) {
        this.p3 = p3;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(nameCofe);
        parcel.writeString(phoneCofe);
        parcel.writeString(LinkCofe);
        parcel.writeString(locationcofe);
        parcel.writeInt(p1);
        parcel.writeInt(p2);
        parcel.writeInt(p3);
    }
}
