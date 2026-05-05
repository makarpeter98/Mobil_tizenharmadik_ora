package hu.unideb.mobil.mobil_tizenharmadik_ora;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.appwidget.AppWidgetProvider;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.hardware.camera2.CameraAccessException;
import android.hardware.camera2.CameraManager;
import android.widget.RemoteViews;

import java.time.chrono.MinguoChronology;

public class TorchWidget extends AppWidgetProvider {

    static final String ACTION_TOGGLE = "TEST_ACTION";

    @Override
    public void onUpdate(Context context, AppWidgetManager appWidgetManager, int[] appWidgetIds) {

    }

    @Override
    public void onReceive(Context context, Intent intent) {
        super.onReceive(context, intent);
    }
}