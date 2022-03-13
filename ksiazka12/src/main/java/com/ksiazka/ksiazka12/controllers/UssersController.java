package com.ksiazka.ksiazka12.controllers;


import com.ksiazka.ksiazka12.enties.Usser;
import com.ksiazka.ksiazka12.services.UsserService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/usser")
@AllArgsConstructor
public class UssersController {

    private final UsserService usserService;

    @GetMapping("/{id}")
    public ResponseEntity<Usser> getById(@PathVariable("id") int id)
    {
        return new ResponseEntity<>(usserService.findById(id), HttpStatus.OK);
    }

    @GetMapping("/all")
    public ResponseEntity<List<Usser>> getAllUssers()
    {
        return new ResponseEntity<>(usserService.getAllUssers(), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<Usser> addUsser (@RequestBody Usser usser)
    {
        Usser usserCreated = usserService.addUsser(usser);


        return new ResponseEntity<>(usserCreated, HttpStatus.CREATED);

    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Usser> deleteUsser(@PathVariable("id") int id)
    {
        usserService.deleteUsser(id);

        return new ResponseEntity<>(HttpStatus.OK);

    }
}
