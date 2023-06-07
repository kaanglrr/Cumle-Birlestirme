package com.yazlab.projeone.repos;

import com.yazlab.projeone.model.WordInput;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface WordInputRepository extends MongoRepository<WordInput, ObjectId> {
}
