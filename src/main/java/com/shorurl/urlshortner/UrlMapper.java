package com.shorurl.urlshortner;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

/**
 * This class used to set the values to short url, long url, and cout.
 * 
 * @author surendra gupta
 * @Date : 10-Dec-2020
 * @DESC - Map short url with long url
 */
public class UrlMapper implements RowMapper<Url> {

	@Override
	public Url mapRow(ResultSet rs, int rowNum) throws SQLException {
		Url url = new Url();
		url.setLongUrl(rs.getString("longUrl"));
		url.setShortUrl(rs.getString("shortUrl"));
		return url;
	}
}
