package org.wahlzeit.location;

public abstract class LocationDefImpl implements Location {
	
	public void setMapcode(String mapcode)
	{
		if (mapcode.contains("."))
			doSetMapcode(mapcode);
	}

	abstract void doSetMapcode(String mapcode);
}
