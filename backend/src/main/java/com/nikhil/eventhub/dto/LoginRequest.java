package com.nikhil.eventhub.dto;

public record LoginRequest(
        String email,
        String password
) {
}
