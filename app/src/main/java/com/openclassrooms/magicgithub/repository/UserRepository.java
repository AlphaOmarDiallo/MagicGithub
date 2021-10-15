package com.openclassrooms.magicgithub.repository;

import com.openclassrooms.magicgithub.api.ApiService;
// import com.openclassrooms.magicgithub.api.FakeApiService;
// import com.openclassrooms.magicgithub.api.FakeApiServiceGenerator;
import com.openclassrooms.magicgithub.model.User;

//import java.util.ArrayList;
import java.util.List;

public class UserRepository {

    private final ApiService apiService; // TODO: A utiliser

    public UserRepository(ApiService apiService) {
        this.apiService = apiService;
    }

    /* Implemented methods from FakeApiService as UserRepository acts as a liaison between the mobile
    app user and the Api as they should not interact directly.
    Used apiService as a variable to target the methods from ApiService as they are not static.*/

    public List<User> getUsers() {
        // TODO: A modifier
        return apiService.getUsers();
    }
    public void generateRandomUser() {
        // TODO: A modifier
        apiService.generateRandomUser();
    }
    public void deleteUser(User user) {
        // TODO: A modifier
        apiService.deleteUser(user);
    }
}
