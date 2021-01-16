package org.yuriichmyr.mapper;

import org.yuriichmyr.dto.PlayerDTO;
import org.yuriichmyr.entity.Player;
import org.springframework.stereotype.Component;

@Component
public class PlayerToPlayerDTOMapper {
    public Player toEntity(final PlayerDTO playerDTO){
        final Player player = new Player();

        player.setId(PlayerDTO.getId());
        player.setNickName(PlayerDTO.getNickName());
        player.setGame(PlayerDTO.getGame());
        player.setSponsors(PlayerDTO.getSponsors());
        player.setTeam(PlayerDTO.getTeam());
        player.setCountComments(playerDTO.getCountComments());

        return player;
    }

    public PlayerDTO toDTO(final Player player){
        final PlayerDTO playerDTO = new PlayerDTO();

        playerDTO.setId(player.getId());
        playerDTO.setNickName(player.getNickName());
        playerDTO.setGame(player.getGame());
        playerDTO.setSponsors(player.getSponsors());
        playerDTO.setTeam(player.getTeam());
        playerDTO.setCountComments(player.getCountComments());

        return playerDTO;
    }
}
