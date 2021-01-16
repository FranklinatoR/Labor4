package org.yuriichmyr.service.impl;

import org.yuriichmyr.dto.PlayerDTO;
import org.yuriichmyr.exception.ServiceException;
import org.yuriichmyr.mapper.PlayerToPlayerDTOMapper;
import org.yuriichmyr.repository.PlayerRepository;
import org.yuriichmyr.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class PlayerServiceImpl implements PlayerService {

    @Autowired
    private PlayerRepository playerRepository;

    @Autowired
    private PlayerToPlayerDTOMapper playerMapper;


    @Override
    public PlayerDTO getPlayerById(Long id) {
        return playerMapper.toDTO(playerRepository.getPlayerById(id));
    }

    @Override
    public List<PlayerDTO> getAllPlayers() {
        return playerRepository.getAllPlayers().stream()
                .map(e -> playerMapper.toDTO(e))
                .collect(Collectors.toList());
    }

    @Override
    public PlayerDTO createPlayer(PlayerDTO playerDTO) {
        if(PlayerDTO.getId() != null){
            throw new ServiceException(400, "Player shouldn't have an id ", null);
        }

        return playerMapper.toDTO(playerRepository.createPlayer(playerMapper.toEntity(playerDTO)));
    }

    @Override
    public PlayerDTO updatePlayer(PlayerDTO playerDTO) {
        if(PlayerDTO.getId() == null){
            throw new ServiceException(400, "Player have an id ", null);
        }

        return playerMapper.toDTO(playerRepository.updatePlayer(playerMapper.toEntity(playerDTO)));
    }

    @Override
    public void deletePlayerById(Long id) {
       playerRepository.deletePlayerById(id);
    }
}
