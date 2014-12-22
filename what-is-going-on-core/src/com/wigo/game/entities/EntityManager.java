package com.wigo.game.entities;

import java.util.ArrayList;

public class EntityManager {

	
	private static EntityManager instance = null;
	
	public static ArrayList<Entity> entityList;
	private static int entityID;
	
	protected EntityManager(){
		this.entityList = new ArrayList<Entity>();
	}
	
	public static EntityManager getInstance(){
		if(instance == null)
		{
			instance = new EntityManager();
			return instance;
		}
		else
			return instance;
	}
	
	public static void addEntity(Entity e){
		entityList.add(e);
	}
	
	public static boolean removeEntity(Entity e){
		return entityList.remove(e);
	}
}
