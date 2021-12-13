package com.abhinav.videomeeting.listeners;

import com.abhinav.videomeeting.models.User;

public interface UsersListener {

    void initiateVideoMeeting(User user);

    void initiateAudioMeeting(User user);

    void onMultipleUsersAction(Boolean isMultipleUsersSelected);
}
