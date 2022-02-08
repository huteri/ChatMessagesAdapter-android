package com.quickblox.ui.kit.chatmessage.adapter.media.utils;

import android.content.Context;
import android.net.Uri;

import com.google.android.exoplayer2.ExoPlayerFactory;
import com.google.android.exoplayer2.SimpleExoPlayer;
import com.google.android.exoplayer2.extractor.DefaultExtractorsFactory;
import com.google.android.exoplayer2.source.ExtractorMediaSource;
import com.google.android.exoplayer2.source.MediaSource;
import com.google.android.exoplayer2.upstream.DefaultHttpDataSourceFactory;
import com.google.android.exoplayer2.util.Util;
import com.quickblox.ui.kit.chatmessage.adapter.R;

/**
 * Created by roman on 7/14/17.
 */

public class SimpleExoPlayerInitializer {

    public static SimpleExoPlayer initializeExoPlayer(Context context) {
        return ExoPlayerFactory.newSimpleInstance(context);
    }

    public static MediaSource buildMediaSource(Uri uri, Context context) {
        String userAgent = Util.getUserAgent(context, context.getResources().getString(R.string.app_name));
        return new ExtractorMediaSource(uri,
                new DefaultHttpDataSourceFactory(userAgent),
                new DefaultExtractorsFactory(), null, null);
    }
}
