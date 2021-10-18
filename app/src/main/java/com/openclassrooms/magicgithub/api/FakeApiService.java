package com.openclassrooms.magicgithub.api;

import com.openclassrooms.magicgithub.model.User;
import java.util.List;
import java.util.Random;

import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.FAKE_USERS_RANDOM;
import static com.openclassrooms.magicgithub.api.FakeApiServiceGenerator.generateUsers;

public class FakeApiService implements ApiService {
    Random randomUser = new Random();
    private List<User> users = generateUsers();

    @Override
    public List<User> getUsers() {
        return users;
    }

    @Override
    public void generateRandomUser() {
        users.add(FAKE_USERS_RANDOM.get(randomUser.nextInt(FAKE_USERS_RANDOM.size())));
    }

    @Override
    public void deleteUser(User user) {
        users.remove(user);
    }
}
