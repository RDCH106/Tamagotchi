package com.redditandroiddevelopers.tamagotchi.mappers;

import android.database.Cursor;

import com.redditandroiddevelopers.tamagotchi.model.Sickness;

public class SicknessMapper {

    public static Sickness mapRow(Cursor c) {
        Sickness s = new Sickness();
        s.id = c.getLong(c.getColumnIndex("S_ID"));
        s.medicine = MedicineMapper.mapRow(c);
        s.name = c.getString(c.getColumnIndex("S_NAME"));
        return s;
    }
}