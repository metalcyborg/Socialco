package com.metalcyborg.socialco.util;

import android.util.Base64;

import java.io.UnsupportedEncodingException;

/**
 * Created by cyborg on 25.03.2018.
 */

public final class TokenUtil {

    private TokenUtil() {

    }

    public static String getBase64String(String source) {
        byte[] bytes = null;
        try {
            bytes = source.getBytes("UTF-8");
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }

        return Base64.encodeToString(bytes, Base64.NO_WRAP);
    }
}
