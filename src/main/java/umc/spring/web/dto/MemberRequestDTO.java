package umc.spring.web.dto;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import umc.spring.validation.annotation.ExistCategories;
import umc.spring.validation.annotation.ExistMember;
import umc.spring.validation.annotation.ExistMission;
import umc.spring.validation.annotation.IsChallengingMission;

import java.util.List;

public class MemberRequestDTO {

    @Getter
    public static class JoinDto{
        @NotBlank
        String name;
        @NotNull
        Integer gender;
        @NotNull
        Integer birthYear;
        @NotNull
        Integer birthMonth;
        @NotNull
        Integer birthDay;
        @Size(min = 5, max = 12)
        String address;
        @Size(min = 5, max = 12)
        String specAddress;
        @ExistCategories
        List<Long> preferCategory;
    }

    @Getter
    @IsChallengingMission
    public static class DoMission {
        @ExistMember
        Long memberId;
        @ExistMission
        Long missionId;
    }
}
