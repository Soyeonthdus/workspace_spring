package com.example.demo.logic;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.example.demo.controller.BoardController;
import com.example.demo.dao.BoardDao;

public class BoardLogic extends MultiActionController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	
	private BoardDao boardDao = null;
	//직접 인스턴스화하는것 대신에 해야할일이 있다.-생성자객체주입법과 setter객체 주입법이 있다,
	//생성자 객체주입은 xml에서 함 setter주입은 자바가 함
	
	public void setBoardDao (BoardDao boardDao) {
		this.boardDao=boardDao;
	}
	
	
	public List<Map<String, Object>> boardList(Map<String, Object> pMap) {
		logger.info("boardList");
		List<Map<String, Object>> bList = new ArrayList<>();
		bList = boardDao.boardList(pMap);
		return bList;
	}
}
