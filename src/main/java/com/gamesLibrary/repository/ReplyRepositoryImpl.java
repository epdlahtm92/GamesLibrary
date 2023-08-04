package com.gamesLibrary.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.gamesLibrary.domain.Reply;
import com.gamesLibrary.mapper.ReplyMapper;
import com.gamesLibrary.repository.Repository.ReplyRepository;

@Repository
public class ReplyRepositoryImpl implements ReplyRepository {
	
	@Autowired
	private ReplyMapper replyMapper;
	
	private List<Reply> listOfReply = new ArrayList<Reply>();
	
	//Create
		@Override
		public void setNewReply(Reply reply) {
			replyMapper.insertReply(reply);
		}

	//Read
		@Override
		public List<Reply> getAllReply(String rootId, String category) {
			listOfReply = replyMapper.getAllReply(rootId, category);
			return listOfReply;
		}
		
	//Update
	
	//Delete
	
}
