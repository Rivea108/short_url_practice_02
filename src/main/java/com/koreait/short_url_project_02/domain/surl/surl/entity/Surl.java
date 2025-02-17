package com.koreait.short_url_project_02.domain.surl.surl.entity;

import com.koreait.short_url_project_02.global.jpa.entity.BaseTime;
import jakarta.persistence.Entity;
import lombok.*;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor(access = AccessLevel.PROTECTED)
@AllArgsConstructor(access = AccessLevel.PROTECTED)
public class Surl extends BaseTime {
    private String body;
    private String url;

    @Setter(AccessLevel.NONE)
    private long count;

    public void increaseCount() {
        count++;
    }
}
