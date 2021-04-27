package com.springbook.biz.user;

public interface UserService {

	public void createUser(UserVO vo);

	public UserVO getUser(UserVO vo);

	public void changePassword(UserVO vo);

	public UserVO find_id(UserVO vo);

	public UserVO findPassword(UserVO vo);
}
