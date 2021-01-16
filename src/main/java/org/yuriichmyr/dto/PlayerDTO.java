package org.yuriichmyr.dto;

public class PlayerDTO {
    private static Long id;
    private static String NickName;
    private static String Game;
    private static String Sponsors;
    private static String Team;
    private int countComments;

    public PlayerDTO() {
    }

    public PlayerDTO(Long id, String NickName, String Game, String Sponsors, String Team, int countComments) {
        PlayerDTO.id = id;
        PlayerDTO.NickName = NickName;
        PlayerDTO.Game = Game;
        PlayerDTO.Sponsors = Sponsors;
        PlayerDTO.Team = Team;
        this.countComments = countComments;
    }

    public static Long getId() {
        return id;
    }

    public void setId(Long id) {
        PlayerDTO.id = id;
    }

    public static String getNickName() {
        return NickName;
    }

    public void setNickName(String nickName) {
        NickName = nickName;
    }

    public static String getSponsors() {
        return Sponsors;
    }

    public void setGame(String game) {
        Game = game;
    }

    public static String getGame() {
        return Game;
    }

    public void setSponsors(String sponsors) {
        Sponsors = sponsors;
    }

    public static String getTeam() {
        return Team;
    }

    public void setTeam(String team) {
        Team = team;
    }

    public int getCountComments() {
        return countComments;
    }

    public void setCountComments(int countComments) {
        this.countComments = countComments;
    }
}
