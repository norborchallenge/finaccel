package finaccel.repository;

import finaccel.Application;
import finaccel.entity.AccountEntity;
import java.util.UUID;
import lombok.extern.slf4j.Slf4j;
import org.joda.time.DateTime;
import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.MethodSorters;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

/**
 *
 * @author nuboat
 */
@Slf4j
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
@RunWith(SpringJUnit4ClassRunner.class)
@WebAppConfiguration
@SpringApplicationConfiguration(classes = Application.class)
public class AccountRepoTest {

	@Autowired
	private AccountRepo repo;

	@Test
	public void testSave() {
		final AccountEntity entity = new AccountEntity(UUID.randomUUID().toString(), "RepoTest", "Test", new DateTime());
		repo.save(entity);
	}

}
