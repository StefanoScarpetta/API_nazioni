package com.demo.api_nazioni.service;

import com.demo.api_nazioni.model.Photo;

import java.util.ArrayList;
import java.util.Optional;

public interface IPhotoService {
    public Iterable<Photo> getAll();

    public Optional<Photo> getById(int id);

    public Photo create(Photo photo);

    public Optional<Photo> update(int id, Photo photo);

    public Boolean delete(int id);
}
