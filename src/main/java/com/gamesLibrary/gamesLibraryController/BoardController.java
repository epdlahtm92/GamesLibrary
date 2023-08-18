package com.gamesLibrary.gamesLibraryController;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gamesLibrary.domain.Board;
import com.gamesLibrary.domain.Reply;
import com.gamesLibrary.service.Service;

@Controller
public class BoardController {
	@Autowired
	private Service.BoardService boardService;
	@Autowired
	private Service.ReplyService replyService;
	
	// create
		@GetMapping("/member/addPost")
		public String requestAddPostForm(@ModelAttribute("newPost") Board board) {
			return "addPost";
		}
		
		@PostMapping("/member/addPost")
		public String submitAddNewPost(@ModelAttribute("newPost") Board board, HttpServletRequest request, HttpSession session) {
			boardService.setNewPost(board);
			return "redirect:/boardList";
		}
	
	// read
		@GetMapping("/boardList")
		public String requestBoardList(Model model) {
			List<Board>boardList = boardService.getAllBoardList();
			model.addAttribute("boardList", boardList);
			return "boardList";
		}
	
		@GetMapping("/postView")
		public String requestPostById(@RequestParam("boardId") String boardId, Model model, @ModelAttribute("newReply") Reply reply) {
			Board board = boardService.getPostById(boardId);
			List<Reply> replyList = replyService.getAllReply(boardId, "board");
			
			model.addAttribute("board", board);
			model.addAttribute("replyList", replyList);
			
			return "postView";
		}
	
	// update
		@GetMapping("/admin/updatePost")
		public String requestUpdatePostForm(@RequestParam("boardId") String boardId, Model model) {
			Board board = boardService.getPostById(boardId);
			model.addAttribute("updatePost", board);
			return "updatePost";
		}
		
		@PostMapping("/admin/updatePost")
		public String submitUpdatePost(@ModelAttribute("updatePost") Board board, Model model) {
			boardService.updateOnePost(board);
			boardService.getAllBoardList();
			String boardId = Integer.toString(board.getBoardId());
			Board resultBoard = boardService.getPostById(boardId);
			model.addAttribute("board", resultBoard);
			return "postView";
		}
		
	// delete
		@GetMapping("/admin/deletePost")
		public String requestDeletePost(@RequestParam("boardId") String boardId) {
			boardService.deleteOnePost(Integer.parseInt(boardId));
			return "redirect:/boardList";
		}
	
	// Reply
		// Add Reply
			@PostMapping("/postView")
			public String submitAddBoardReply(@ModelAttribute("newReply") Reply reply) {
				replyService.setNewReply(reply);
				String boardId = Integer.toString(reply.getRootId());
				return "redirect:/postView?boardId=" + boardId;
			}
}
