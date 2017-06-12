package com.elfatah.testgramedia.domain.model;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by elfatahwashere on 6/12/2017.
 */

public class Content implements Parcelable {
    String content;

    public Content(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(this.content);
    }

    protected Content(Parcel in) {
        this.content = in.readString();
    }

    public static final Parcelable.Creator<Content> CREATOR = new Parcelable.Creator<Content>() {
        @Override
        public Content createFromParcel(Parcel source) {
            return new Content(source);
        }

        @Override
        public Content[] newArray(int size) {
            return new Content[size];
        }
    };
}
