package com.quickblox.ui.kit.chatmessage.adapter.media.view;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ProgressBar;

import androidx.annotation.Nullable;

import com.google.android.exoplayer2.ui.TimeBar;


/**
 * Created by roman on 8/4/17.
 */

public class TimeProgressBar extends ProgressBar implements TimeBar {

    private long duration;
    private long position;


    public TimeProgressBar(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    @Override
    public void addListener(OnScrubListener listener) {

    }

    @Override
    public void removeListener(OnScrubListener listener) {

    }

    @Override
    public void setEnabled(boolean enabled) {

    }


    @Override
    public void setKeyTimeIncrement(long time) {

    }

    @Override
    public void setKeyCountIncrement(int count) {

    }

    @Override
    public void setPosition(long position) {
        this.position = position;
    }

    @Override
    public void setBufferedPosition(long bufferedPosition) {

    }

    @Override
    public void setDuration(long duration) {
        this.duration = duration;
        updateProgress();
    }

    @Override
    public long getPreferredUpdateDelay() {
        return 0;
    }

    @Override
    public void setAdGroupTimesMs(@Nullable long[] adGroupTimesMs, @Nullable boolean[] playedAdGroups, int adGroupCount) {

    }

    private void updateProgress() {
        int scrubberPixelPosition = 0;
        if(duration != 0) {
            scrubberPixelPosition = (int) ((getMax() * position) / duration);
        }
        setProgress(scrubberPixelPosition);
    }
}
