package com.example.pranali_deogade.amigo.record;

/**
 * Created by pranali_deogade on 11-12-2017.
 */

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


public interface ParsedNdefRecord {

    /**
     * Returns a view to display this record.
     */
    public View getView(Activity activity, LayoutInflater inflater, ViewGroup parent,
                        int offset);

}