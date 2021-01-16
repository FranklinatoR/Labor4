package org.yuriichmyr.service;

import org.yuriichmyr.dto.PlayerDTO;

import java.util.List;

public interface PlayerService {
    PlayerDTO getPlayerById(Long id);
    List<PlayerDTO> getAllPlayers();
    PlayerDTO createPlayer(PlayerDTO playerDTO);
    PlayerDTO updatePlayer(PlayerDTO playerDTO);
    void deletePlayerById(Long id);
}
