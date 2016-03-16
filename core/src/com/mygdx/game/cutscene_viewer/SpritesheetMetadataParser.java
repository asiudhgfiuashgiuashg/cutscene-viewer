package com.mygdx.game.cutscene_viewer;

import com.badlogic.gdx.files.FileHandle;
import com.badlogic.gdx.graphics.g2d.Animation;
import com.badlogic.gdx.utils.Json;

import java.util.Map;
import java.util.HashMap;

/**
 * 
 * @author elimonent
 *
 * a class for reading in spritesheet metadata and creating
 * appropriate animations for a spritesheet based on that metadata
 */
public class SpritesheetMetadataParser {
	
	/**
	 * NOT COMPLETE
	 * @param file - a spritesheet
	 * @return animations from that file in a dictionary
	 */
	public Map<String, Animation> getAnimations(FileHandle file) {
		Json json = new Json();
		SpritesheetMetadata metadata = json.fromJson(SpritesheetMetadata.class, file);
		
		return null;
	}
}
