package com.alliander.osgp.adapter.ws.smartmetering.application.mapping;

import java.nio.ByteBuffer;

import com.alliander.osgp.domain.core.valueobjects.smartmetering.ClockStatus;
import com.alliander.osgp.domain.core.valueobjects.smartmetering.CosemDate;
import com.alliander.osgp.domain.core.valueobjects.smartmetering.CosemDateTime;
import com.alliander.osgp.domain.core.valueobjects.smartmetering.CosemTime;

import ma.glasnost.orika.CustomConverter;
import ma.glasnost.orika.MappingContext;
import ma.glasnost.orika.metadata.Type;

public class CosemDateTimeConverter extends CustomConverter<byte[], CosemDateTime> {

    @Override
    public CosemDateTime convert(final byte[] source, final Type<? extends CosemDateTime> destinationType,
            final MappingContext context) {
        final ByteBuffer bb = ByteBuffer.wrap(source);

        final int year = bb.getShort() & 0xFFFF;
        final int month = bb.get() & 0xFF;
        final int dayOfMonth = bb.get() & 0xFF;
        final int dayOfWeek = bb.get() & 0xFF;
        final int hour = bb.get() & 0xFF;
        final int minute = bb.get() & 0xFF;
        final int second = bb.get() & 0xFF;
        final int hundredths = bb.get() & 0xFF;
        final int deviation = bb.getShort();

        final ClockStatus clockStatus = new ClockStatus(bb.get());
        final CosemTime time = new CosemTime(hour, minute, second, hundredths);
        final CosemDate date = new CosemDate(year, month, dayOfMonth, dayOfWeek);

        return new CosemDateTime(date, time, deviation, clockStatus);
    }
}
