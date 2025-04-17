package exceptions;

public class NameCollection {
	private static String[] names = {"Govinda", "Ranbir", "Ranveer", "Alia", "Deepika"};
	
	public static int getPosition(String name) throws NameNotFoundException {
		int position = -1;
		int length = names.length;
		for(int index = 0; index < length; index++) {
			String currentName = names[index];
			if(currentName.equals(name)) {
				position = index;
			}
		}
		if(position == -1) {
			NameNotFoundException nx = 
					new NameNotFoundException("The supplied name is invalid", name);
			throw nx;
		}
		return position;		
	}
}
