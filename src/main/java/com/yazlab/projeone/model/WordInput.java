package com.yazlab.projeone.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.bson.types.ObjectId;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "metinler")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class WordInput {
    @Id
    private ObjectId id;
    private String birlesmis;
    private List<String> girilenler;

    private String gecensure;
}
