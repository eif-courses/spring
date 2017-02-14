package com.example.models;

/**
 * Created by Marius on 2/12/2017.
 */
public interface PrekeService {
    Iterable<Preke> atvaizduotiPrekes();
    Preke prekePagalId(Integer id);
}
