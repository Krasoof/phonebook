package com.ksiazka.ksiazka12.services;

import com.ksiazka.ksiazka12.enties.Usser;
import com.ksiazka.ksiazka12.repositories.usserReposytory;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.persistence.EntityNotFoundException;
import java.util.List;

@Service
@AllArgsConstructor
public class UsserService {

    private final usserReposytory usserReposytory;

    public Usser findById(int id)
    {
        Usser usser = usserReposytory.findById(id).orElseThrow(
                () -> new EntityNotFoundException("cannot found usser with" + id)

        );
        return usser;
    }

    public List<Usser> getAllUssers()
    {
        List<Usser> allUssers = usserReposytory.findAll();

        return allUssers;

    }

    public Usser addUsser(Usser usser1)
    {

        Usser usserToSave = Usser.builder()
                .name(usser1.getName())
                .surrname(usser1.getSurrname())
                .phone(usser1.getPhone())
                .build();

        usserToSave = usserReposytory.save(usserToSave);


        return usserToSave;

    }

    public void deleteUsser(int id)
    {
        usserReposytory.deleteById(id);
    }

}
