package firstproject.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import firstproject.model.entity.Buku;

public interface BukuRepository extends CrudRepository<Buku, String>{
    
    List<Buku> findAll();

}
