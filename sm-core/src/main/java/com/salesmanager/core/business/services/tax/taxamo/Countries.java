package com.salesmanager.core.business.services.tax.taxamo;

public class Countries {
    Detected DetectedObject;
    Forced ForcedObject;


    // Getter Methods

    public Detected getDetected() {
        return DetectedObject;
    }

    public Forced getForced() {
        return ForcedObject;
    }

    // Setter Methods

    public void setDetected(Detected detectedObject) {
        this.DetectedObject = detectedObject;
    }

    public void setForced(Forced forcedObject) {
        this.ForcedObject = forcedObject;
    }
}
