package your.redditandroiddevelopers.model;

import android.content.ContentValues;

/**
 * Model object for the CREATURE_TYPE database table.
 * 
 * Objects are public with no getters/setters for performance
 * 
 * @author Jeffrey Selk
 *
 */
public class CreatureType {

	public int id;
	public String name;
	
	public ContentValues buildContentValues() {
		ContentValues toReturn = new ContentValues();
		toReturn.put("CT_ID", id);
		toReturn.put("CT_NAME", name);
		return toReturn;
	}
}