/**
 * Copyright 2017 Smart Society Services B.V.
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 */
package com.alliander.osgp.adapter.domain.smartmetering.application.mapping.customconverters;

import com.alliander.osgp.domain.core.valueobjects.smartmetering.GetAllAttributeValuesResponse;
import com.alliander.osgp.dto.valueobjects.smartmetering.GetAllAttributeValuesResponseDto;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class GetAttributeValuesResponseConverter
        extends CustomConverter<GetAllAttributeValuesResponseDto, GetAllAttributeValuesResponse> {

    @Override
    public GetAllAttributeValuesResponse convert(final GetAllAttributeValuesResponseDto source,
            final Type<? extends GetAllAttributeValuesResponse> destinationType, final MappingContext context) {
        return new GetAllAttributeValuesResponse(source.getAttributeValuesData());

    }

}
