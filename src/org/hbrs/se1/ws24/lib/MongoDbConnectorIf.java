package org.hbrs.se1.ws24.lib;

import org.hbrs.se1.ws24.model.UserStory;
import java.util.ArrayList;

public interface MongoDbConnectorIf {
    void openConnection();
    void closeConnection();

    void insertUserStory(UserStory story);
    void updateUserStory(int id, UserStory story);
    void deleteUserStory(int id);
    void clearUserStories();
    UserStory readUserStory(int id);
    ArrayList<UserStory> listUserStories();
}
