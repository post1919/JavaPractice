package com.dongah.pattern;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class UserInfoLombokBuilder {
    private String userId;
    private String userName;
    private String password;
    private String email;
}
