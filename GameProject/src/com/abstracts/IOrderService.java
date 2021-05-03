package com.abstracts;

import com.entities.Campaign;
import com.entities.Game;
import com.entities.User;

public interface IOrderService {

	void campWithSale(User user, Game game, Campaign campaign);

	void campWithoutSale(User user, Game game);
}
