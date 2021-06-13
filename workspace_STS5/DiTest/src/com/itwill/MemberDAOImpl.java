package com.itwill;

public class MemberDAOImpl implements MemberDAO {

	private String id;
	private String pw;
	
	private Board b;
	
	public Board getB() {
		return b;
	}

	public void setB(Board b) {
		this.b = b;
	}

	MemberDAOImpl(){
		this.id = "test";
		this.pw = "1234";
	}

	MemberDAOImpl(String id){
		this.id = id;
		this.pw = "1234";
	}
	
	MemberDAOImpl(String id, String pw){
		this.id = id;
		this.pw = pw;
	}
	
	
	public String getId() {
		return id;
	}


	public void setId(String id) {
		this.id = id;
	}


	public String getPw() {
		return pw;
	}


	public void setPw(String pw) {
		this.pw = pw;
	}


	public void insertMember() {
		System.out.println("회원 가입 성공!");
		
	}
	
	public void idCheck() {
		System.out.println("체크 완료 : "+id+" , "+pw);
	}
	
}
