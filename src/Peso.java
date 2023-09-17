package com.brandonang.peso;

import android.app.Activity;
import android.content.Context;
import com.google.appinventor.components.annotations.*;
import com.google.appinventor.components.common.ComponentCategory;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.EventDispatcher;

@DesignerComponent(
        version = 1,
        description = "Peso Made with Niotron IDE.",
        category = ComponentCategory.EXTENSION,
        nonVisible = true,
        iconName = "")

@SimpleObject(external = true)
//Libraries
@UsesLibraries(libraries = "")
//Permissions
@UsesPermissions(permissionNames = "")

public class Peso extends AndroidNonvisibleComponent {

    //Activity and Context
    private Context context;
    private Activity activity;

    public Peso(ComponentContainer container){
        super(container.$form());
        this.activity = container.$context();
        this.context = container.$context();
    }

    @SimpleFunction(description = "To Format Peso Bills")
    public String FormatPeso(int number){
        String peso = "₱" + number;
        return peso;
    }
}