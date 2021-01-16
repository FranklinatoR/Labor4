package org.yuriichmyr.repository;


import org.yuriichmyr.entity.Player;
import org.yuriichmyr.exception.ServiceException;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Repository
public class PlayerRepository {

    @PostConstruct
    public void init(){
        savedPlayers = new ArrayList<>();
    }

    private static Long lastId = 1L;
    private static List<Player> savedPlayers;

    public Player getPlayerById(final Long id){
        return savedPlayers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Player with id: " + id + " not found ", null));
    }

    public List<Player> getAllPlayers(){
        return savedPlayers;
    }

    public Player createPlayer(final Player player){
        if(player.getId() != null){
            throw new ServiceException(400, "Player shouldn't have an id ", null);
        }

        ++lastId;
        player.setId(lastId);

        savedPlayers.add(player);

        return player;
    }

    public Player updatePlayer(final Player player){
        if(player.getId() == null){
            throw new ServiceException(400, "Player shouldn't have an id ", null);
        }

        final Player savedPlayer = getPlayerById(player.getId());

        savedPlayer.setNickName(player.getNickName());
        savedPlayer.setGame(player.getGame());
        savedPlayer.setSponsors(player.getSponsors());
        savedPlayer.setTeam(player.getTeam());

        return savedPlayer;
    }

    public void deletePlayerById(final Long id){
        if(id == null){
            throw new ServiceException(400, "Id isn't specified", null);
        }

        savedPlayers.stream()
                .filter(e -> e.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new ServiceException(400, "Player with id: " + id + " not found ", null));

        savedPlayers = savedPlayers.stream()
                .filter(e -> !e.getId().equals(id))
                .collect(Collectors.toList());

    }

    public static boolean checkSavedPlayers(Long id) {
        if(savedPlayers.isEmpty()) return false;
        else{
            for (Player player:
                    savedPlayers) {
                if (player.getId().equals(id)){
                    player.setCountComments(player.getCountComments() + 1);
                    return true;
                }
            }
            return false;
        }
    }

    public void deletePlayerById(Long id) {
    }
}
