package com.idat.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.idat.Model.Items;

@Repository
public interface ItemRepository extends JpaRepository<Items, Integer> {

}
