package com.example.akar.popularmovie_2.adapter;

public interface RecyclerItemListener<T> {
    int getCurrentPage();
    void onRecyclerItemSelected(int position, T model);
    void onScrolledToLast(int position, int nextPageIndex);
}
