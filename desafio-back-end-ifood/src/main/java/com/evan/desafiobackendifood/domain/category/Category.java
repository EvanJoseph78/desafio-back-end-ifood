package com.evan.desafiobackendifood.domain.category;

import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import lombok.Getter;

@Document(collation = "categories")
@Getter
@Setter
@NoArgsConstructor
public class Category {
    @Id
    private String id;
    private String title;
    private String description;
    private String ownerId;
}