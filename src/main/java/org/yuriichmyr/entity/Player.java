package org.yuriichmyr.entity;

public class Player {
    private Long id;
    private String NickName;
    private String Game;
    private String Sponsors;
    private String Team;
    private int countComments;

    public Player() {
    }

    public Player(Long id, String nickName, String game, String sponsors, String team, int countComments) {
        this.id = id;
        this.NickName = nickName;
        this.Game= game;
        this.Sponsors = sponsors;
        this.Team = team;
        this.countComments = countComments;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        this.NickName = nickName;
    }

    public String getGame() {
        return Game;
    }

    public void setGame(String game) {
        this.Game = game;
    }

    public String getSponsors() {
        return Sponsors;
    }

    public void setSponsors(String sponsors) {
        this.Sponsors = sponsors;
    }

    public String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        this.Team = team;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }
}
