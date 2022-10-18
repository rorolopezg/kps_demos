package tech.kopernicus.demos.hexagonal.demhex.domain;

import java.io.Serializable;
import java.util.UUID;

public class GenericID implements Serializable {
    private final UUID id;

    public GenericID(UUID id) {
        this.id = id;
    }

    public static GenericID withId(String id) {
        return new GenericID(UUID.fromString(id));
    }

    public static GenericID withoutId() {
        return new GenericID(UUID.randomUUID());
    }
 }
