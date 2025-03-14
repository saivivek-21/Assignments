package assignments;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Assignment5_ArraysandCollections {

	public static void main(String[] args) {
		// Create a list of the top 5 most populated countries in the world and print 2

		List<String> topcountries = new ArrayList<String>();
		topcountries.add("India");
		topcountries.add("China");
		topcountries.add("United States");
		topcountries.add("Indonesia");
		topcountries.add("Pakistan");

		System.out.println("topcountries" + ":" + topcountries.get(2));
		// Create a set of the top 10 most visited tourist attractions in the world and
		// print out its size.

		Set<String> top10 = new HashSet<String>();
		top10.add("Eiffel Tower");
		top10.add("Taj Mahal");
		top10.add("Dubai");
		top10.add("Amber Fort");
		top10.add("Bangkok");
		top10.add("Colosseum");
		top10.add("Delhi");
		top10.add("Goa");
		top10.add("London");
		top10.add("Mysore");

		System.out.println("Size:" + top10.size());
		// Create a map of the 5 largest cities in the United States and their
		// populations.
		Map<String, Integer> unitedstates = new HashMap<String, Integer>();
		unitedstates.put("New York City", 8335897);
		unitedstates.put("Los Angeles", 3822238);
		unitedstates.put("Houston", 2302878);
		unitedstates.put("Phoenix", 1472909);
		unitedstates.put("San Diego", 1381162);

		System.out.println(unitedstates);
		// Create an array of 10 random integers and print out the sum of 3rd and 5th
		// Value.
		int[] numbers = { 12, 34, 56, 78, 90, 11, 23, 45, 67, 89 };

		System.out.println(
				"Array: " + numbers[0] + " " + numbers[1] + " " + numbers[2] + " " + numbers[3] + " " + numbers[4] + " "
						+ numbers[5] + " " + numbers[6] + " " + numbers[7] + " " + numbers[8] + " " + numbers[9]);

		int sum = numbers[2] + numbers[4];
		System.out.println("Sum of 3rd and 5th values: " + sum);
		
		List<String> movies = new ArrayList<>();
        movies.add("Avatar");
        movies.add("Avengers: Endgame");
        movies.add("Titanic");
        movies.add("Star Wars: The Force Awakens");
        movies.add("Avengers: Infinity War");
        System.out.println("The third highest-grossing movie is: " + movies.get(2));

	}

}
