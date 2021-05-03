package com.concrete;

import com.abstracts.IUserValidateService;
import com.entities.User;

public class UserValidateManager implements IUserValidateService{

	@Override
	public boolean validate(User user) {
		return true;
	}

}
