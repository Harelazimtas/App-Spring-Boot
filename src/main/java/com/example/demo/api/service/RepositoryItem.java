package com.example.demo.api.service;

import com.example.demo.api.models.Item;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface RepositoryItem extends CrudRepository<Item,Integer> {


}
