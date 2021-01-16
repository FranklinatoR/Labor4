package org.yuriichmyr.resource;


import org.yuriichmyr.dto.PlayerDTO;
import org.yuriichmyr.service.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class PlayerResource {

    @Autowired
    private PlayerService playerService;

    @GetMapping("/players/{id}")
    public PlayerDTO getPlayerById(final @PathVariable Long id){
        return playerService.getPlayerById(id);
    }

    @GetMapping("/players")
    public List<PlayerDTO> getAllPlayers(){
        return playerService.getAllPlayers();
    }

    @PostMapping("/players")
    public PlayerDTO playerService.createPlayer()final /*@Valid*/ @RequestBody PlayerDTO PlayerDTO){
        return playerService.createPlayer(PlayerDTO);
    }

    @PutMapping("/players")
    public PlayerDTO getPlayerById(final @RequestBody PlayerDTO playerDTO){
        return playerService.updatePlayer(playerDTO);
    }

    @DeleteMapping("/players/{id}")
    public void deletePlayerById(final @PathVariable Long id){
        playerService.deletePlayerById(id);
    }

}
