package com.jnit.app.model;


import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@Table(name="Author")
@XmlRootElement
public class Author implements Serializable {
		
		private static final long serialVersionUID = 1L;

		@Id
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Long authorId;
		private String authorName;

		public Author() {
			super();
			// TODO Auto-generated constructor stub
		}

		
		public Author(Long authorId, String authorName) {
			super();
			this.authorId = authorId;
			this.authorName = authorName;
		}


		public Long getAuthorId() {
			return authorId;
		}


		public void setAuthorId(Long authorId) {
			this.authorId = authorId;
		}


		public String getAuthorName() {
			return authorName;
		}


		public void setAuthorName(String authorName) {
			this.authorName = authorName;
		}

	
}
