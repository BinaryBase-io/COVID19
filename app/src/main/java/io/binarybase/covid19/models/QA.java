package io.binarybase.covid19.models;

import android.os.Parcel;
import android.os.Parcelable;

public class QA implements Parcelable {
    public static final Creator<QA> CREATOR = new Creator<QA>() {
        @Override
        public QA createFromParcel(Parcel in) {
            return new QA(in);
        }

        @Override
        public QA[] newArray(int size) {
            return new QA[size];
        }
    };
    private String answer;
    private int image;
    private int isImage;

    public QA(String answer) {
        this.answer = answer;
        this.isImage = 1;
    }

    public QA(int image, int isImage) {
        this.image = image;
        this.isImage = isImage;
    }

    protected QA(Parcel in) {
        answer = in.readString();
        image = in.readInt();
        isImage = in.readInt();
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public int getIsImage() {
        return isImage;
    }

    public void setIsImage(int isImage) {
        this.isImage = isImage;
    }

    @Override
    public int describeContents() {
        return hashCode();
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(answer);
        dest.writeInt(image);
        dest.writeInt(isImage);
    }
}
