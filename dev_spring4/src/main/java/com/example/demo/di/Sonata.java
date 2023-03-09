package com.example.demo.di;
//di란 dependency injection(의존성 주입)을 의미한다 

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;

public class Sonata {
	Logger logger = LoggerFactory.getLogger(Sonata.class);
		//전역변수
		private int speed;
		private String carName;
		private int wheelNum;
		//생성자
		public Sonata() {
			logger.info("디폴트생성자 입니다");
		}
		
		public Sonata(int speed, String carName, int wheelNum) {
				logger.info("파라미터가 있는 생성자입니다");
			this.speed = speed;
			this.carName = carName;
			this.wheelNum = wheelNum;
		}
		//메소드
	public void stop () {
			logger.info("자동차가 정지합니다.");
	}
	
	public String toString() {
		return "그 남자의 자동차는 " + this.carName
				+ "이고, 현재 속도는 " + this.speed
				+ "이고, 자동차의 바퀴수는" + this.wheelNum + "이다";
	}
	
}//end of class
