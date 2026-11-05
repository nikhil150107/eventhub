package com.nikhil.eventhub.dto;

public record AuthResponse(
        String acessToken,
        String tokenType,
        long expiresIn,
        UserResponse user
) {
}
