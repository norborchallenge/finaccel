package finaccel.facade;

import com.restfb.types.User;
import finaccel.converter.FbDateStringToJoda;
import finaccel.entity.AccountEntity;
import finaccel.repository.AccountRepo;
import finaccel.service.FbProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @author nuboat
 */
@Service
public class FbAuthenFacade implements FbDateStringToJoda {

	@Autowired
	private AccountRepo repo;

	@Autowired
	private FbProfileService fbService;

	@Transactional
	private void save(final User user) {
		repo.save(new AccountEntity(user.getEmail(), user.getName(), user.getBio(), toJoda(user.getBirthday())));
	}

	public User authen(final String token) {
		final User user = fbService.fetch(token);
		save(user);

		return user;
	}

}
