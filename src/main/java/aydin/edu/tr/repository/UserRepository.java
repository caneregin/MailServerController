package aydin.edu.tr.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class UserRepository {
	@Autowired
	JdbcTemplate jdbcTemplate;
	public List<String> getAllUserNames() {
		List<String> usernameList = new ArrayList<>();
		usernameList.addAll(jdbcTemplate.queryForList("SELECT accountaddress FROM hm_accounts WHERE accountid between 1 and 5", String.class));
		return usernameList;
	}

}