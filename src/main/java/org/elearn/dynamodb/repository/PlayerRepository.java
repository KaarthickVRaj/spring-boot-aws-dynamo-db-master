/**
 * 
 */
package org.elearn.dynamodb.repository;

import org.elearn.dynamodb.model.Player;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;
import org.elearn.dynamodb.model.Sports;
import java.util.List;

/**
 * @author kloudone
 *
 */
@EnableScan
public interface PlayerRepository extends CrudRepository<Player, String> {

	List<Player> findBySports(Sports sports);
}
