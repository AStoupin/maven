package hello;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface Mytable1Repository extends CrudRepository<Mytable1, Long> {

    List<Mytable1> findByName(String name);

    @Query("select c from Mytable1 c where c.name like '%' || :name || '%'")
    List<Mytable1> findByNameLike(@Param("name") String name);

}