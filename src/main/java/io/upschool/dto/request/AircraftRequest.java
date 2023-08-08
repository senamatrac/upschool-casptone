package io.upschool.dto.request;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class AircraftRequest {
    @NotBlank
    private String iataCode;
    @NotBlank
    private String model;
    @NotNull
    private Integer maxSeat;

    private List<SeatRequest> seats;
}
