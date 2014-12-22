package com.wigo.game.desktop;

import com.badlogic.gdx.backends.lwjgl.LwjglApplication;
import com.badlogic.gdx.backends.lwjgl.LwjglApplicationConfiguration;
import com.wigo.game.WhatIsGoingOn;

public class DesktopLauncher {
	public static void main (String[] arg) {
		LwjglApplicationConfiguration config = new LwjglApplicationConfiguration();
		config.title = "What Is Going On?";
		config.width = 640;
		config.height = 480;
		new LwjglApplication(new WhatIsGoingOn(), config);
	}
}
