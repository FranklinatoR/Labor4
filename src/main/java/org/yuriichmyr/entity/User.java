package org.yuriichmyr.entity;

import java.time.LocalDate;
import java.util.List;

public class User {
    private Long id;
    private String NickName;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private int countComments;

    private List<Player> userPlayerComment;


    public User() {
    }

    public User(Long id, String userName, String firstName, String lastName, LocalDate birth, int countComments, List<Player> userPlayerComment) {
        this.id = id;
        this.NickName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.countComments = countComments;
        this.userPlayerComment = userPlayerComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return NickName;
    }

    public void setUserName(String userName) {
        this.NickName = userName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }

    public List<Player> getUserPlayerComment() {
        return userPlayerComment;
    }

    public void setUserPlayerComment(List<Player> userPlayerComment) {
        this.userPlayerComment = userPlayerComment;
    }
}
