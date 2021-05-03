package com.concrete;

import com.abstracts.IOrderService;
import com.entities.Campaign;
import com.entities.Game;
import com.entities.User;

public class OrderManager implements IOrderService{

	@Override
	public void campWithSale(User user, Game game, Campaign campaign) {
		
		System.out.println(user.getFirstName() + " adlı kisi " + game.getName() + "oyununu "+campaign.getName()+" ile beraber başarılı bir şekilde satın aldı.");
		
	}

	@Override
	public void campWithoutSale(User user, Game game) {
		
		System.out.println(user.getFirstName() + " adlı kişi "+ game.getName() + " oyunu basarili bir sekilde satin aldi");
		
	}

}
