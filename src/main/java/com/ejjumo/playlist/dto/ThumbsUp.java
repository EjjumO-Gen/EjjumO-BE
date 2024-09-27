package com.ejjumo.playlist.dto;

public class ThumbsUp {
    private boolean isThumbsUp;
    private int thumbs;

    public ThumbsUp() {
    }

    public ThumbsUp(boolean isThumbsUp, int thumbs) {
        this.isThumbsUp = isThumbsUp;
        this.thumbs = thumbs;
    }

    @Override
    public String toString() {
        return "ThumbsUp{" +
                "isThumbsUp=" + isThumbsUp +
                ", thumbs=" + thumbs +
                '}';
    }

    public boolean getIsThumbsUp() {
        return isThumbsUp;
    }

    public void setIsThumbsUp(boolean isThumbsUp) {
        this.isThumbsUp = isThumbsUp;
    }

    public int getThumbs() {
        return thumbs;
    }

    public void setThumbs(int thumbs) {
        this.thumbs = thumbs;
    }
}
