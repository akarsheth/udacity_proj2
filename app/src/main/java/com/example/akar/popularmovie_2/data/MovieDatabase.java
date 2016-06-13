package com.example.akar.popularmovie_2.data;

import net.simonvt.schematic.annotation.Database;
import net.simonvt.schematic.annotation.Table;


@Database(version = MovieDatabase.VERSION)
public class MovieDatabase {

    public static final int VERSION = 1;

    @Table(MovieFavoritesColumns.class)
    public static final String FAVORITES = "favorites";

}