package com.company;

import java.util.ArrayList;
import java.util.List;

public class RoomFinalDto {

    private List<RoomGDto> data = new ArrayList<>();

    public void addData(RoomGDto room){
        data.add(room);
    }

    public RoomFinalDto() {

    }

    public RoomFinalDto(List<RoomGDto> data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "RoomFinalDto{" + "data=" + data + '}';
    }

}
