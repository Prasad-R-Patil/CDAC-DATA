package wapper_class_string_builder;

public class StringBuilderWithWrapperClassExample {

	public static void main(String[] args) {
		// This program acccepts 3 command line arguments: person name, age, weight 
		String name = args[0];
		int age = Integer.parseInt(args[1]);
		float weight = Float.parseFloat(args[2]);
		
		//Creating an empty StringBuilder
		StringBuilder builder = new StringBuilder();
		//Start adding data into StringBuilder using overloaded append() methods
		builder.append("Hello ");
		builder.append(name);
		builder.append(". Your age is ");
		builder.append(age);
		builder.append(" years and your weight is ");
		builder.append(weight);
		builder.append(" Kgs");
		
		System.out.println(builder);

	}

}
