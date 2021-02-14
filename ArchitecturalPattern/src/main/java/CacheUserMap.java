import java.util.*;

public class CacheUserMap {
    private Map<Integer, User> personMap = new HashMap();

    public void addUser(User user) {
        personMap.put(user.getId(), user);
    }

    public User getUser(int key) {
        return personMap.get(key);
    }
    public User[] getAllUsers() {
        User[] users = new User[personMap.size()];
        List<User> arList = new ArrayList<>();

        for (Map.Entry<Integer, User> map : personMap.entrySet()) {
            arList.add(map.getValue());
        }
        return arList.toArray(users);
    }

}
