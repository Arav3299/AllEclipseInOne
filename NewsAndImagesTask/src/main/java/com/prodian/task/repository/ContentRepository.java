package com.prodian.task.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.prodian.task.modal.Content;

@Repository
public interface ContentRepository extends JpaRepository<Content, Long> {

}
