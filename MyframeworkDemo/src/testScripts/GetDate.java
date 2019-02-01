package testScripts;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import configuration.Base;

public class GetDate extends Base {

	public static void main(String[] args) {

		DateFormat dformat = new SimpleDateFormat("dd/MMM/yyyy HH:mm:ss");

		Date dt = new Date();

		String mySystemDate = dformat.format(dt);

		System.out.println("My current date is = " + mySystemDate);
	}

}
