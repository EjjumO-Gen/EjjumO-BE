package com.ejjumo.user.dto;

public class User {
    private int userId;
    private String userName;
    private String kakaoId;
    private int totalThumbs;
    private String profilePic;
    private String refreshToken;

    public User() {
    }

    public User(int userId, String userName, String kakaoId, int totalThumbs, String profilePic, String refreshToken) {
        this.userId = userId;
        this.userName = userName;
        this.kakaoId = kakaoId;
        this.totalThumbs = totalThumbs;
        this.profilePic = profilePic;
        this.refreshToken = refreshToken;
    }

    @Override
    public String toString() {
        return "User{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", kakaoId='" + kakaoId + '\'' +
                ", totalThumbs=" + totalThumbs +
                ", profilePic='" + profilePic + '\'' +
                ", refreshToken='" + refreshToken + '\'' +
                '}';
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getKakaoId() {
        return kakaoId;
    }

    public void setKakaoId(String kakaoId) {
        this.kakaoId = kakaoId;
    }

    public int getTotalThumbs() {
        return totalThumbs;
    }

    public void setTotalThumbs(int totalThumbs) {
        this.totalThumbs = totalThumbs;
    }

    public String getProfilePic() {
        return profilePic;
    }

    public void setProfilePic(String profilePic) {
        this.profilePic = profilePic;
    }

    public String getRefreshToken() {
        return refreshToken;
    }

    public void setRefreshToken(String refreshToken) {
        this.refreshToken = refreshToken;
    }
}
