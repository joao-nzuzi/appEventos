package com.appeventos.appeventos.repository;

import com.appeventos.appeventos.models.Evento;
import org.springframework.data.repository.CrudRepository;

public interface EventoRepository extends CrudRepository<Evento, String> {
}
