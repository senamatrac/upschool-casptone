package io.upschool.mapper.entity;

import io.upschool.dto.request.AircraftRequest;
import io.upschool.entity.Aircraft;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface AircraftMapper {
    Aircraft map(AircraftRequest aircraftRequest);
}