package com.therishka.androidlab;

import android.app.Activity;
import android.content.Intent;
import android.support.annotation.NonNull;

/**
 * @author Rishad Mustafaev.
 */
public class ScreenDelegate {

    public enum Screens {
        LINEAR_LAYOUT_SCREEN,
        RELATIVE_LAYOUT_SCREEN,
        SHOWCASE_SCREEN,
        CATS_SCREEN,
        COLORS_SCREEN
    }


    public static void startScreen(@NonNull Screens screen, @NonNull Activity activity) {
        activity.startActivity(getRequiredIntent(screen, activity));
    }

    private static Intent getRequiredIntent(@NonNull Screens screen, @NonNull Activity activity) {
        Intent screenIntent;
        switch (screen) {
            case LINEAR_LAYOUT_SCREEN:
                screenIntent = new Intent(activity, LinearLayoutActivity.class);
                break;
            case RELATIVE_LAYOUT_SCREEN:
                screenIntent = new Intent(activity, RelativeLayoutActivity.class);
                break;
            case SHOWCASE_SCREEN:
                screenIntent = new Intent(activity, ViewsShowcase.class);
                break;
            case CATS_SCREEN:
                screenIntent = new Intent(activity, KittenActivity.class);
                break;
            case COLORS_SCREEN:
                screenIntent = new Intent(activity, ColorActivity.class);
                break;
            default:
                screenIntent = new Intent(activity, LinearLayoutActivity.class);
        }
        return screenIntent;
    }
}
