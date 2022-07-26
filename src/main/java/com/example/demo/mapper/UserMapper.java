package com.example.demo.mapper;

import java.util.Optional;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import com.example.demo.entity.User;

@Mapper
public interface UserMapper {

	Optional<User> findOne(int id);

	void save(String name);

	void update(@Param("id") int id, @Param("name") String name);

	void delete(int id);
}