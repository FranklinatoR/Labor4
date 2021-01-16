package org.yuriichmyr.service;

import org.yuriichmyr.dto.CommentDTO;

import java.util.List;

public interface CommentService {

    CommentDTO getCommentById(Long id);
    List<CommentDTO> getAllComment();
    CommentDTO createComment(CommentDTO commentDTO, Long id);
    CommentDTO updateComment(CommentDTO commentDTO);
    void deleteCommentById(Long id);
}
