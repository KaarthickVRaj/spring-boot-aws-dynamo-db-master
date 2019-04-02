/**
 * 
 */
package org.elearn.dynamodb.rest;

import java.util.List;

import org.elearn.dynamodb.model.Player;
import org.elearn.dynamodb.repository.PlayerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kloudone
 *
 */
@RestController
@RequestMapping("/api/v1")
public class PlayerResource {
	
	@Autowired
	private PlayerRepository playerRepository;

	/**
	 * 
	 * @return
	 */
	@GetMapping("/players")
	public List<Player> players() {
		return (List<Player>) playerRepository.findAll();
	}
}
