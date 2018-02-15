package de.bflader.notepadmanager;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Application {

	private static final Logger LOGGER = LogManager.getLogger(Application.class);

	public void run() {
		LOGGER.info("Hello World!");
	}

}
