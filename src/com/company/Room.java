package com.company;

import java.util.Date;

public class Room {
    private Integer roomId;

    private Integer orgId;

    private Integer floorId;

    private String roomNumber;

    private Integer roomType;


    private String roomNameEn;


    private String roomNameAb;

    private Integer createdBy;

    public Room(Integer roomId, Integer orgId, Integer floorId, String roomNumber, Integer roomType, String roomNameEn, String roomNameAb, Integer createdBy) {
        this.roomId = roomId;
        this.orgId = orgId;
        this.floorId = floorId;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.roomNameEn = roomNameEn;
        this.roomNameAb = roomNameAb;
        this.createdBy = createdBy;
    }

    public Integer getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public Integer getOrgId() {
        return orgId;
    }

    public void setOrgId(Integer orgId) {
        this.orgId = orgId;
    }

    public Integer getFloorId() {
        return floorId;
    }

    public void setFloorId(Integer floorId) {
        this.floorId = floorId;
    }

    public String getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(String roomNumber) {
        this.roomNumber = roomNumber;
    }

    public Integer getRoomType() {
        return roomType;
    }

    public void setRoomType(Integer roomType) {
        this.roomType = roomType;
    }

    public String getRoomNameEn() {
        return roomNameEn;
    }

    public void setRoomNameEn(String roomNameEn) {
        this.roomNameEn = roomNameEn;
    }

    public String getRoomNameAb() {
        return roomNameAb;
    }

    public void setRoomNameAb(String roomNameAb) {
        this.roomNameAb = roomNameAb;
    }

    public Integer getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(Integer createdBy) {
        this.createdBy = createdBy;
    }

    @Override
    public String toString() {
        return "Room{" + "roomId=" + roomId + ", orgId=" + orgId + ", floorId=" + floorId + ", roomNumber='" + roomNumber + '\'' + ", roomType=" + roomType + ", roomNameEn='" + roomNameEn + '\'' + ", roomNameAb='" + roomNameAb + '\'' + ", createdBy=" + createdBy + '}';
    }
}