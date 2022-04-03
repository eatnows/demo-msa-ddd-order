package dev.practice.order.domain.partner;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class PartnerCommand {
    private final String partnerName;
    private final String businessNo;
    private final String email;

    @Builder
    public PartnerCommand(String partnerName, String businessNo, String email) {
        this.partnerName = partnerName;
        this.businessNo = businessNo;
        this.email = email;
    }

    public Partner toEntity() {
        return Partner.builder()
                .partnerName(partnerName)
                .businessNo(businessNo)
                .email(email)
                .build();
    }
}
