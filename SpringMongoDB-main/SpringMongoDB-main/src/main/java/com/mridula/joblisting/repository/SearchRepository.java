package com.mridula.joblisting.repository;

import com.mridula.joblisting.model.Post;

import java.util.List;

public interface SearchRepository {

    List<Post> findByText(String text);

}
