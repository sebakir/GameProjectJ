package com.concrete;

import com.abstracts.ICampaignService;
import com.entities.Campaign;

public class CampaignManager implements ICampaignService {

	@Override
	public void add(Campaign campaign) {
		System.out.println("Kampanya eklendi : "+ campaign.getName());
		
	}

	@Override
	public void update(Campaign campaign) {
		System.out.println( campaign.getName() + " Kampanya güncellendi " );
		
		
	}

	@Override
	public void delete(Campaign campaign) {
		System.out.println( campaign.getName()+ "kampanyalardan cikarildi");
		
		
	}

}
