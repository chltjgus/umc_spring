package umc.spring.web.dto;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;

import java.time.LocalDate;

public class StoreRequestDTO {

    @Getter
    public static class JoinDto {
        @NotEmpty
        String name;
        @NotNull
        String category;
        @NotNull
        String address;
        @NotNull
        String operatingHours;
        @NotNull
        String region;
    }

    @Getter
    public static class CreateReviewDto {
        @NotEmpty
        String content;
        @NotNull
        Float rating;
    }

    @Getter
    public static class CreateMissionDto {
        @NotEmpty
        String content;
        @NotNull
        String ownerCode;
        @NotNull
        LocalDate deadline;
        @NotNull
        Integer reward;
    }

}