package finaccel.model;

import lombok.AllArgsConstructor;

/**
 *
 * @author nuboat
 */
@AllArgsConstructor
public class RestResult<T> {
	
	public final Integer status;
	public final String version;
	public final T result;
	public final String error;

}
