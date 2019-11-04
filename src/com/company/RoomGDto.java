package com.company;

import java.util.ArrayList;
import java.util.List;

public class RoomGDto {
    private Integer floorId;
    private List<RoomGetUpDto> rooms = new ArrayList<>();

    public void addRoom(RoomGetUpDto roomDto){
        rooms.add(roomDto);
    }

    public RoomGDto() {

    }


    public RoomGDto(List<RoomGetUpDto> rooms, Integer floorId) {
        this.rooms = rooms;
        this.floorId = floorId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }



    public List<RoomGetUpDto> getRooms() {
        return rooms;
    }

    public void setRooms(List<RoomGetUpDto> rooms) {
        this.rooms = rooms;
    }

    @Override
    public String toString() {
        return "RoomGetDto{" + "rooms=" + rooms + '}';
    }

}
