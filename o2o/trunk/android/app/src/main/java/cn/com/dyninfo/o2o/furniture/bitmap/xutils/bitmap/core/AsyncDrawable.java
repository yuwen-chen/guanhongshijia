/*
 * Copyright (c) 2009-2016 SHENZHEN Eternal Dynasty Technology Co.,Ltd.
 * All rights reserved.
 *
 * This file contains valuable properties of  SHENZHEN Eternal Dynasty
 * Technology Co.,Ltd.,  embodying  substantial  creative efforts  and
 * confidential information, ideas and expressions.    No part of this
 * file may be reproduced or distributed in any form or by  any  means,
 * or stored in a data base or a retrieval system,  without  the prior
 * written permission  of  SHENZHEN Eternal Dynasty Technology Co.,Ltd.
 *
 */

package cn.com.dyninfo.o2o.furniture.bitmap.xutils.bitmap.core;

import android.graphics.*;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.lang.ref.WeakReference;

import cn.com.dyninfo.o2o.furniture.bitmap.xutils.BitmapUtils.BitmapLoadTask;

/**
 * Author: wyouflf
 * Date: 13-11-17
 * Time: 上午11:42
 */
public class AsyncDrawable<T extends View> extends Drawable {

    private final WeakReference<BitmapLoadTask<T>> bitmapLoadTaskReference;

    private final Drawable baseDrawable;

    public AsyncDrawable(Drawable drawable, BitmapLoadTask<T> bitmapWorkerTask) {
        if (drawable == null) {
            throw new IllegalArgumentException("drawable may not be null");
        }
        if (bitmapWorkerTask == null) {
            throw new IllegalArgumentException("bitmapWorkerTask may not be null");
        }
        baseDrawable = drawable;
        bitmapLoadTaskReference = new WeakReference<BitmapLoadTask<T>>(bitmapWorkerTask);
    }

    public BitmapLoadTask<T> getBitmapWorkerTask() {
        return bitmapLoadTaskReference.get();
    }

    @Override
    public void draw(Canvas canvas) {
        baseDrawable.draw(canvas);
    }

    @Override
    public void setAlpha(int i) {
        baseDrawable.setAlpha(i);
    }

    @Override
    public void setColorFilter(ColorFilter colorFilter) {
        baseDrawable.setColorFilter(colorFilter);
    }

    @Override
    public int getOpacity() {
        return baseDrawable.getOpacity();
    }

    @Override
    public void setBounds(int left, int top, int right, int bottom) {
        baseDrawable.setBounds(left, top, right, bottom);
    }

    @Override
    public void setBounds(Rect bounds) {
        baseDrawable.setBounds(bounds);
    }

    @Override
    public void setChangingConfigurations(int configs) {
        baseDrawable.setChangingConfigurations(configs);
    }

    @Override
    public int getChangingConfigurations() {
        return baseDrawable.getChangingConfigurations();
    }

    @Override
    public void setDither(boolean dither) {
        baseDrawable.setDither(dither);
    }

    @Override
    public void setFilterBitmap(boolean filter) {
        baseDrawable.setFilterBitmap(filter);
    }

    @Override
    public void invalidateSelf() {
        baseDrawable.invalidateSelf();
    }

    @Override
    public void scheduleSelf(Runnable what, long when) {
        baseDrawable.scheduleSelf(what, when);
    }

    @Override
    public void unscheduleSelf(Runnable what) {
        baseDrawable.unscheduleSelf(what);
    }

    @Override
    public void setColorFilter(int color, PorterDuff.Mode mode) {
        baseDrawable.setColorFilter(color, mode);
    }

    @Override
    public void clearColorFilter() {
        baseDrawable.clearColorFilter();
    }

    @Override
    public boolean isStateful() {
        return baseDrawable.isStateful();
    }

    @Override
    public boolean setState(int[] stateSet) {
        return baseDrawable.setState(stateSet);
    }

    @Override
    public int[] getState() {
        return baseDrawable.getState();
    }

    @Override
    public Drawable getCurrent() {
        return baseDrawable.getCurrent();
    }

    @Override
    public boolean setVisible(boolean visible, boolean restart) {
        return baseDrawable.setVisible(visible, restart);
    }

    @Override
    public Region getTransparentRegion() {
        return baseDrawable.getTransparentRegion();
    }

    @Override
    public int getIntrinsicWidth() {
        return baseDrawable.getIntrinsicWidth();
    }

    @Override
    public int getIntrinsicHeight() {
        return baseDrawable.getIntrinsicHeight();
    }

    @Override
    public int getMinimumWidth() {
        return baseDrawable.getMinimumWidth();
    }

    @Override
    public int getMinimumHeight() {
        return baseDrawable.getMinimumHeight();
    }

    @Override
    public boolean getPadding(Rect padding) {
        return baseDrawable.getPadding(padding);
    }

    @Override
    public Drawable mutate() {
        return baseDrawable.mutate();
    }

    @Override
    public ConstantState getConstantState() {
        return baseDrawable.getConstantState();
    }
}