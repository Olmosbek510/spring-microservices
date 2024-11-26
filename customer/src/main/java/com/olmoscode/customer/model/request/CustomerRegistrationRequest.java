package com.olmoscode.customer.model.request;

public record CustomerRegistrationRequest(
        String firstName,
        String lastName,
        String email) {
}
