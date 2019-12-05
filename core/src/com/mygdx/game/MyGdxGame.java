package com.mygdx.game;

import com.badlogic.gdx.ApplicationAdapter;
import com.badlogic.gdx.Gdx;
import com.badlogic.gdx.Input;
import com.badlogic.gdx.graphics.GL20;
import com.badlogic.gdx.graphics.Texture;
import com.badlogic.gdx.graphics.g2d.Sprite;
import com.badlogic.gdx.graphics.g2d.SpriteBatch;

public class MyGdxGame extends ApplicationAdapter {
	private SpriteBatch batch;
	private Texture img;
	private Sprite mySprite;
	private int X;
	private int Y;
	
	@Override
	public void create () {
		batch = new SpriteBatch();
		img = new Texture("joe.png");
		mySprite = new Sprite(img, img.getWidth(), img.getHeight());
	}

	@Override
	public void render () {
		if (Gdx.input.isKeyPressed(Input.Keys.LEFT))
		{
			X--;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.RIGHT))
		{
			X++;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.DOWN))
		{
			Y--;
		}
		if (Gdx.input.isKeyPressed(Input.Keys.UP))
		{
			Y++;
		}
		Gdx.gl.glClearColor(1, 0, 0, 1);
		Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT);
		batch.begin();
		batch.draw(mySprite, X, Y);
		batch.end();
	}
	
	@Override
	public void dispose () {
		batch.dispose();
		img.dispose();
	}
}
