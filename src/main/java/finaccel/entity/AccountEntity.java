package finaccel.entity;

import lombok.AllArgsConstructor;
import org.joda.time.DateTime;

/**
 *
 * @author nuboat
 */
@AllArgsConstructor
public class AccountEntity {

	public final String email;

	public final String enname;
	public final String bio;
	public final DateTime birthday;
}
