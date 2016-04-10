package finaccel.converter;

import org.joda.time.DateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

/**
 * 04/06/1982
 * @author nuboat
 */
public interface FbDateStringToJoda {
	
	static final String FORMAT = "MM/dd/yyyy";
	static final DateTimeFormatter DTF = DateTimeFormat.forPattern(FORMAT);

	default DateTime toJoda(final String date) {
		return DTF.parseDateTime(date);
	}

}
