package com.netflix.archaius.config;

import com.netflix.archaius.Config;
import com.netflix.archaius.ConfigListener;

/**
 * Default implementation with noops for all ConfigListener events
 * @author elandau
 *
 */
public class DefaultConfigListener implements ConfigListener {

    @Override
    public void onConfigAdded(Config config) {
    }

    @Override
    public void onConfigRemoved(Config config) {
    }

    @Override
    public void onConfigUpdated(Config config) {
    }

    @Override
    public void onError(Throwable error, Config config) {
    }

}