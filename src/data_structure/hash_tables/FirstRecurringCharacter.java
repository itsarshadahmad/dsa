package src.data_structure.hash_tables;

//Google Question
//Given an array = [2,5,1,2,3,5,1,2,4]:
//It should return 2

//Given an array = [2,1,1,2,3,5,1,2,4]:
//It should return 1

//Given an array = [2,3,4,5]:
//It should return undefined

//Bonus... What if we had this:
// [2,5,5,2,3,5,1,2,4]
// return 5 because the pairs are before 2,2

import java.util.HashSet;

public class FirstRecurringCharacter {

    // Brute Force or Naive way
    private Object getFirstRecurring1(Object[] items) {
        for (int i = 0; i < items.length; i++) {
            for (int j = i + 1; j < items.length; j++) {
                if (items[i] == items[j]) {
                    return items[i];
                }
            }
        }
        return null;
    }

    // Hashing or hashset way
    private Object getFirstRecurring2(Object[] items) {
        HashSet<Object> data = new HashSet<>();
        for (Object item : items) {
            if (data.contains(item)) {
                return item;
            } else {
                data.add(item);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        FirstRecurringCharacter recurring = new FirstRecurringCharacter();
        Object[] items1 = {10, 54, 12, 88, 55, 15};
        Object[] items2 = {10, 54, 12, 88, 55, 12};
        System.out.println(recurring.getFirstRecurring1(items1));
        System.out.println(recurring.getFirstRecurring2(items2));
    }
}
