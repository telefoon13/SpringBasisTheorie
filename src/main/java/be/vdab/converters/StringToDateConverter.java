package be.vdab.converters;



import org.springframework.core.convert.converter.Converter;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

 class StringToDateConverter implements Converter<String, Date> {

	private static final String DATUM_FORMAT = "yyyy-MM-dd";

	@Override
	public Date convert(String string){
		SimpleDateFormat format = new SimpleDateFormat(DATUM_FORMAT);
		try{
			return format.parse(string);
		} catch (ParseException ex){
			throw new IllegalArgumentException(ex);
		}
	}
}
