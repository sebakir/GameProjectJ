package com.abstracts;

import com.entities.User;

public interface IUserService {

	void add(User user) throws Exception;
	void update(User user);
	void delete(User user);
}
