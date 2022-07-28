package com.example.demo.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	Optional<User> findOne(int id);

	void save(@Param("name") String name, @Param("user") User user);

	void update(@Param("id") int id, @Param("name") String name);

	void delete(int id);
}