package com.springbook.biz.user;

public interface UserService {

	public void createUser(UserVO vo);
	public UserVO getUser(UserVO vo);
	public void changePassword(UserVO vo);

}
