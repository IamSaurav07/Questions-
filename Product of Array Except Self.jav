import java.util.*;

class RandomizedSet {
    private Map<Integer, Integer> map;  // Maps value to its index in the list
    private List<Integer> list;        // Stores the values
    private Random random;             // For generating random indices

    public RandomizedSet() {
        map = new HashMap<>();
        list = new ArrayList<>();
        random = new Random();
    }

    
    public boolean insert(int val) {
        if (map.containsKey(val)) {
            return false; // Value already exists
        }
        map.put(val, list.size()); // Add value and its index to the map
        list.add(val);            // Add value to the list
        return true;
    }

    /** Removes a value from the set. Returns true if the set contained the specified element. */
    public boolean remove(int val) {
        if (!map.containsKey(val)) {
            return false; // Value does not exist
        }

        // Get index of the value to be removed
        int index = map.get(val);

        // Swap the value with the last element in the list
        int lastValue = list.get(list.size() - 1);
        list.set(index, lastValue);
        map.put(lastValue, index);

        // Remove the last element from the list
        list.remove(list.size() - 1);

        // Remove the value from the map
        map.remove(val);

        return true;
    }

    /** Get a random element from the set. */
    public int getRandom() {
        int randomIndex = random.nextInt(list.size());
        return list.get(randomIndex);
    }
}
