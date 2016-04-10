package finaccel.repository;

import finaccel.entity.AccountEntity;
import java.sql.Timestamp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @author nuboat
 */
@Repository
public class AccountRepo {

	private static final String INSERT
			= "INSERT INTO accounts(email, enname, bio, birthday) VALUES (?, ?, ?, ?)";
	private static final String UPDATE
			= "UPDATE accounts SET enname=?, bio=?, birthday=? WHERE email=?";

	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(final AccountEntity entity) {
		int count;
		
		try {
			count = jdbcTemplate.update(INSERT, entity.email, entity.enname, entity.bio, new Timestamp(entity.birthday.getMillis()));
		} catch (final Exception e) {
 			count = jdbcTemplate.update(UPDATE, entity.enname, entity.bio, new Timestamp(entity.birthday.getMillis()), entity.email);
		}
		
		assert count == 1;
	}

}
