package jp.tuyoyun;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "SYSTEM.MV_TEST6")
public class Rss {
	@Id
	@Column(name = "RSS_INFO_ID")
	private Long rssInfoId;

	@Column(name = "RSS_URL")
	private String rssUrl;

	public Long getRssInfoId() {
		return rssInfoId;
	}

	public void setRssInfoId(Long rssInfoId) {
		this.rssInfoId = rssInfoId;
	}

	public String getRssUrl() {
		return rssUrl;
	}

	public void setRssUrl(String rssUrl) {
		this.rssUrl = rssUrl;
	}

}
