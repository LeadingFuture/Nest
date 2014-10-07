package cn.edu.sdut.nest.convert;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.apache.struts2.util.StrutsTypeConverter;

public class DateConvert extends StrutsTypeConverter{

	SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");

	@Override
	public Object convertFromString(Map arg0, String[] arg1, Class arg2) {
		// TODO Auto-generated method stub
		
		try {
			return sdf.parse(arg1[0]);
		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}

	@Override
	public String convertToString(Map arg0, Object arg1) {
		// TODO Auto-generated method stub
		
		return sdf.format((Date)arg1);
	}

}
