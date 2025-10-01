package com.chatapp.vibespace.repositories;

import com.chatapp.vibespace.entities.Room;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface  RoomRepository extends MongoRepository<Room,String> {

    Room findByRoomId(String roomId);
}
