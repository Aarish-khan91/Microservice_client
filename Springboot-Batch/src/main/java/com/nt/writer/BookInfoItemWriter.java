package com.nt.writer;

import org.springframework.batch.item.ItemWriter;
import org.springframework.stereotype.Component;

@Component("biWriter")
public class BookInfoItemWriter implements ItemWriter<String> {

	@Override
	public void write(org.springframework.batch.item.Chunk<? extends String> chunk) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("BookInfoItemWriter.write()");
		System.out.println("Proccessed books are " + chunk.toString());

	}

}