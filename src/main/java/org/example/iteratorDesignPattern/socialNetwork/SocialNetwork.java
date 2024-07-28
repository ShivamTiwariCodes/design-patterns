package org.example.iteratorDesignPattern.socialNetwork;

import org.example.iteratorDesignPattern.Profile;
import org.example.iteratorDesignPattern.iterator.Iterator;

import java.util.List;

public interface SocialNetwork {

    List<Profile> getFriendsFromApi(String profileId);
    List<Profile> getColleaguesFromApi(String profileId);
}
