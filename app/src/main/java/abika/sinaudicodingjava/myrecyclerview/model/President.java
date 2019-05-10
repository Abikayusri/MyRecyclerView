package abika.sinaudicodingjava.myrecyclerview.model;

import android.os.Parcel;
import android.os.Parcelable;

public class President implements Parcelable {
    private String name, remark, photo;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemarks() {
        return remark;
    }

    public void setRemarks(String remark) {
        this.remark = remark;
    }

    public String getPhoto() {
        return photo;
    }

    public void setPhoto(String photo) {
        this.photo = photo;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.name);
        dest.writeString(this.remark);
        dest.writeString(this.photo);
    }

    President() {
    }

    private President(Parcel in) {
        this.name = in.readString();
        this.remark = in.readString();
        this.photo = in.readString();
    }

    public static final Parcelable.Creator<President> CREATOR = new Parcelable.Creator<President>() {
        @Override
        public President createFromParcel(Parcel source) {
            return new President(source);
        }

        @Override
        public President[] newArray(int size) {
            return new President[size];
        }
    };
}