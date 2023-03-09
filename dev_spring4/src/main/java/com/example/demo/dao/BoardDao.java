package com.example.demo.dao;

import java.util.List;
import java.util.Map;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

import com.example.demo.controller.BoardController;

public class BoardDao extends MultiActionController {
	private static final Logger logger = LoggerFactory.getLogger(BoardController.class);
	private SqlSessionTemplate sqlSessionTemplate=null;
	public void setSqlSessionTemplate(SqlSessionTemplate sqlSessionTemplate) {
			this.sqlSessionTemplate = sqlSessionTemplate;
														}
	public List<Map<String, Object>> boardList(Map<String, Object>pMap){
		logger.info("boardList호출");
		List<Map<String,Object>> bList = null;
		bList = sqlSessionTemplate.selectList("boardList" , pMap);
		logger.info(bList.toString());
		return bList;
	}
}
