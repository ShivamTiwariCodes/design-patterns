package org.example.iteratorDesignPattern.iterator;

import org.example.iteratorDesignPattern.Profile;
import org.example.iteratorDesignPattern.socialNetwork.SocialNetwork;

import java.util.List;

public class FriendsIterator implements Iterator{

    private SocialNetwork socialNetwork;
    private String profileId;
    private List<Profile> friendsList;
    private int currentPosition;


    public FriendsIterator(SocialNetwork socialNetwork, String profileId) {
        this.socialNetwork = socialNetwork;
        this.profileId = profileId;
        this.currentPosition = 0;
        this.friendsList = socialNetwork.getFriendsFromApi(profileId);
    }

    @Override
    public boolean hasNext() {
        if(currentPosition < friendsList.size()) return true;
        return false;
    }

    @Override
    public Profile next() {
        if(hasNext()) {
            return friendsList.get(currentPosition++);
        }
        return null;
    }
}
