package com.gamesLibrary.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gamesLibrary.domain.Reply;
import com.gamesLibrary.repository.Repository;
import com.gamesLibrary.service.Service.ReplyService;

@Service
public class ReplyServiceImpl implements ReplyService {
	
	@Autowired
	private Repository.ReplyRepository replyRepository;
	
	@Override
	public List<Reply> getAllReply(String rootId, String category) {
		return replyRepository.getAllReply(rootId, category);
	}

	@Override
	public void setNewReply(Reply reply) {
		replyRepository.setNewReply(reply);
	}
}
