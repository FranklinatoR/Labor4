package org.yuriichmyr.dto;

import org.yuriichmyr.entity.Player;

import java.time.LocalDate;
import java.util.List;

public class UserDTO {
    private Long id;
    private String userName;
    private String firstName;
    private String lastName;
    private LocalDate birth;
    private int countComments;

    private List<Player> userPlayerComment;


    public UserDTO() {
    }

    public UserDTO(Long id, String userName, String firstName, String lastName, LocalDate birth, int countComments, List<Player> userGameComment) {
        this.id = id;
        this.userName = userName;
        this.firstName = firstName;
        this.lastName = lastName;
        this.birth = birth;
        this.countComments = countComments;
        this.userPlayerComment = userGameComment;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
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
