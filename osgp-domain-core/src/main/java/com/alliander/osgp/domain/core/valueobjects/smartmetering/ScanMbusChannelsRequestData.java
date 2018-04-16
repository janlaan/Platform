/**
 * Copyright 2018 Smart Society Services B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package com.alliander.osgp.domain.core.valueobjects.smartmetering;

import com.alliander.osgp.domain.core.valueobjects.DeviceFunction;
import com.alliander.osgp.shared.exceptionhandling.FunctionalException;

public class ScanMbusChannelsRequestData implements ActionRequest {

    private static final long serialVersionUID = 4002186950650450208L;

    @Override
    public void validate() throws FunctionalException {
        // No validation neededb
    }

    @Override
    public DeviceFunction getDeviceFunction() {
        return DeviceFunction.GET_CONFIGURATION;
    }

}