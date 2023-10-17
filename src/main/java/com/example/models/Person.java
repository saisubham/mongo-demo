package com.example.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "persons")
public record Person(@Id String id, String name) {
}
