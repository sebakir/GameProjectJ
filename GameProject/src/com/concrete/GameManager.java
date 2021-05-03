package com.concrete;

import com.abstracts.IGameService;
import com.entities.Game;

public class GameManager implements IGameService {

	@Override
	public void add(Game game) {
		System.out.println(game.getName() + " eklendi");
		
	}

	@Override
	public void update(Game game) {
		System.out.println(game.getName() + " silindi");
	}

	@Override
	public void delete(Game game) {
		System.out.println(game.getName() + " güncellendi");
	}

}
