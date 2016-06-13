package com.example.akar.popularmovie_2.adapter;

import android.graphics.Rect;
import android.support.v7.widget.RecyclerView;
import android.view.View;

/**
 * Created by a on 7/6/16.
 */
public class Equal_Space extends RecyclerView.ItemDecoration {

private final int mSpaceHeight;

public Equal_Space(int mSpaceHeight) {
        this.mSpaceHeight = mSpaceHeight;
        }

@Override

public void getItemOffsets(Rect outRect, View view, RecyclerView parent, RecyclerView.State state) {
        outRect.bottom = mSpaceHeight;
        outRect.top = mSpaceHeight;
        outRect.left = mSpaceHeight;
        outRect.right = mSpaceHeight;
        }
}
