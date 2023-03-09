package com.example.demo.Controller.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.Model.entity;

public interface repository extends JpaRepository<entity, Integer>{

}