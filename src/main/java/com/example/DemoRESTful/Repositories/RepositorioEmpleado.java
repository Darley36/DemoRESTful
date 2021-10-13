package com.example.DemoRESTful.Repositories;

import com.example.DemoRESTful.Models.Empleado;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioEmpleado extends MongoRepository<Empleado, String> {
}
