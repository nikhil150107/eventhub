package com.nikhil.eventhub.dto;

public record  RegisterRequest (
    String name,
    String email,
    String password
){}
