package com.wigo.game.entities;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @author pilapodapostache
 *
 * @Usage Contains an ArrayList from java.util.ArrayList of Entity objects, and is used to loop through all available
 * entity objects created and update their logic and graphics based content.
 */
public class EntityManager {

	
	private static EntityManager instance = null;
	
	public static ArrayList<Entity> entityList;
	private static int entityID;
	
	//Singleton: Used to ensure only ONE instance of this object is available
	protected EntityManager(){
		EntityManager.entityList = new ArrayList<Entity>();
	}
	
	/**
	 * @return The instance of the Entity Manager and it it doesn't exist, creates it and returns it.
	 */
	public static EntityManager getInstance(){
		if(instance == null)
		{
			instance = new EntityManager();
			return instance;
		}
		else
			return instance;
	}
	
	/**
	 * @param entity - An entity you want to add to the EntityManager
	 */
	public static void addEntity(Entity entity){
		entityList.add(e);
	}
	
	public static boolean removeEntity(Entity e){
		return entityList.remove(e);
	}
	
	
	//Goes through all entities in the EntityList and updates them.
	//TODO: Should we do two different update methods? (One for Logic, one for Graphics?)
	public static void update(){
		Iterator<Entity> i = entityList.iterator();
		while(i.hasNext()){
			Entity e = i.next();
			e.update();
		}
	}
}
