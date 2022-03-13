package com.ksiazka.ksiazka12.repositories;

import com.ksiazka.ksiazka12.enties.Usser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface usserReposytory extends JpaRepository<Usser, Integer> {
}
