package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service
public class UserService {

	private final UserMapper userMapper;

	@Autowired
	public UserService(UserMapper userMapper) {
		this.userMapper = userMapper;
	}

	public User findOne(int id) throws Exception {
		return userMapper.findOne(id).orElseThrow(() -> new Exception("データが登録されていません"));
	}

	public void saveUserList(String name) {
		userMapper.save(name);
	}

	public void updateUserList(int id, String name) {
		userMapper.update(id, name);
	}

	public void deleteUserList(int id) {
		userMapper.delete(id);
	}

}