package pizzaloop;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;
import java.util.List;

@Transactional
public interface OrderRepository extends CrudRepository<OrderDetails, Integer> {
    /*
     * Find oeder by Id
     */
    List<OrderDetails> findByCartId(Integer id);

    /*
     * Delete pizza by Id
     */
    List<OrderDetails> deleteByCartId(Integer id);
}
