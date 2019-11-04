package com.company;

import java.util.ArrayList;
import java.util.List;

public class RoomGetUpDto {

    private Integer roomType;

    List<RoomGDto> roomList = new ArrayList<>();

    public RoomGetUpDto() {
    }

    public RoomGetUpDto(Integer roomType, List<RoomGDto> roomList) {
        this.roomType = roomType;
        this.roomList = roomList;
    }

    public void addRoom(RoomGDto roomDto){
        roomList.add(roomDto);
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public List<RoomGDto> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<RoomGDto> roomList) {
        this.roomList = roomList;
    }

    @Override
    public String toString() {
        return "RoomGetUpDto{" + "roomType=" + roomType + ", roomList=" + roomList + '}';
    }

}
