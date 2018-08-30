/*
 * Copyright (c) 2018 Zhang Hai <Dreaming.in.Code.ZH@Gmail.com>
 * All Rights Reserved.
 */

package me.zhanghai.android.materialfilemanager.terminal;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;

import me.zhanghai.android.materialfilemanager.util.AppUtils;

public class Terminal {

    private Terminal() {}

    public static boolean open(String path, Context context) {
        return AppUtils.startActivity(makeIntent(path), context);
    }

    private static Intent makeIntent(String path) {
        return new Intent()
                .setComponent(new ComponentName("jackpal.androidterm",
                        "jackpal.androidterm.TermHere"))
                .setAction(Intent.ACTION_SEND)
                .putExtra(Intent.EXTRA_STREAM, Uri.parse(path));
    }
}
