package com.nt.reader;

import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.NonTransientResourceException;
import org.springframework.batch.item.ParseException;
import org.springframework.batch.item.UnexpectedInputException;
import org.springframework.stereotype.Component;

@Component("biReader")
public class BookInfoReader implements ItemReader<String> {

	private String books[] = new String[] { "TU", "CRJ", "EJ", "BBJ" };
	int count = 0;

	@Override
	public String read() throws Exception, UnexpectedInputException, ParseException, NonTransientResourceException {
		if (count < books.length) {
			return books[count++];
		} else {
			return null;
		}
	}

}
