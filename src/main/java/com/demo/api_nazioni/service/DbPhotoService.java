package com.demo.api_nazioni.service;

import com.demo.api_nazioni.model.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;

@Service
public class DbPhotoService implements IPhotoService{
    @Override
    public Iterable<Photo> getAll() {
        return new ArrayList<Photo>();
    }

    @Override
    public Optional<Photo> getById(int id) {
        return Optional.empty();
    }

    @Override
    public Photo create(Photo photo) {
        return null;
    }

    @Override
    public Optional<Photo> update(int id, Photo photo) {
        return Optional.empty();
    }

    @Override
    public Boolean delete(int id) {
        return false;
    }
}
