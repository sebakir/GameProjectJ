package com.concrete;

import com.abstracts.IUserService;
import com.abstracts.IUserValidateService;
import com.entities.User;

public class UserManager implements IUserService {

	IUserValidateService userValidateService;
	

	public UserManager(IUserValidateService userValidateService) {
		this.userValidateService = userValidateService;
	}

	@Override
	public void add(User user) throws Exception {
		if(userValidateService.validate(user)) {
			System.out.println(user.getFirstName() + " eklendi");
		}
		else {
			throw new Exception("not invalid user : "+user.getFirstName());
			
		}
		
	}

	@Override
	public void update(User user) {
		System.out.println("Sistemden silindi : " + user.getFirstName());

	}

	@Override
	public void delete(User user) {
		System.out.println("Sistem bilgileri güncellendi : " + user.getFirstName());
	}

}
