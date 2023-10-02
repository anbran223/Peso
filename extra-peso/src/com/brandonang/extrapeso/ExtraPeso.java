package com.brandonang.pesopiso;

import com.google.appinventor.components.annotations.SimpleFunction;
import com.google.appinventor.components.runtime.AndroidNonvisibleComponent;
import com.google.appinventor.components.runtime.ComponentContainer;
import com.google.appinventor.components.runtime.errors.YailRuntimeError;
import com.google.appinventor.components.runtime.util.YailList;

public class ExtraPeso extends AndroidNonvisibleComponent {

  public ExtraPeso(ComponentContainer container) {
    super(container.$form());
  }

  @SimpleFunction
  public String SeperateThousands(int numberFirst, int numberRest){
    String seperateTh = numberFirst + "," + numberRest;
    return seperateTh;
  }

  @SimpleFunction
  public String Cents(int peso, int cents){
    String centsConstruct = peso + "." + cents;
    return centsConstruct;
  }

  @SimpleFunction
  public String FormatPeso(int peso){
    String formatPeso = "₱" + peso;
    return formatPeso;
  }
}
