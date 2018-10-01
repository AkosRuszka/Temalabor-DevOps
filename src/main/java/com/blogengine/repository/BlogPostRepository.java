package com.blogengine.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.blogengine.domain.BlogPost;

@Repository
public interface BlogPostRepository extends CrudRepository<BlogPost, Long> {
	
	/** 
	 * Visszaadja az összes BlogPost-t, ami az adatbázisban található.
	 * Ha nincs az adatbázisban BlogPost, akkor üres tömbbel tér vissza 
	 * */
	public List<BlogPost> findAll();

	/** 
	 * Visszaadja azt a BlogPost-t, amelyiknek a címe megegyezik a paraméterrel
	 * Ha nincs ilyen BlogPost, akkor null értékkel tér vissza!
	 * */
	public Optional<BlogPost> findFirst1ByTitle(String title);

	/** 
	 * Visszaadja azokat a BlogPostokat, amelyeknek a létrehozási dátuma
	 * megegyezik a paraméterben szereplő dátummal.
	 * A visszaadott BlogPost lista, dátum szerint növekvő sorrendbe van rendezve.
	 * Ha nincs a keresésnek megfelelő BlogPost akkor üres Listával tér vissza. 
	 * */
	public List<BlogPost> findByPostedDateOrderByPostedDateAsc(String posteddate);
	
	/** 
	 * Visszaadja azokat a BlogPostokat, amelyeknek a létrehozási dátuma
	 * megegyezik a paraméterben szereplő dátummal.
	 * A visszaadott BlogPost lista, dátum szerinti csökkenő sorrendbe van rendezve.
	 * Ha nincs a keresésnek megfelelő BlogPost akkor üres Listával tér vissza. 
	 * */
	public List<BlogPost> findByPostedDateOrderByPostedDateDesc(String posteddate);

	/** 
	 * Visszaadja azokat a BlogPostokat, amelyeknek a létrehozási dátuma
	 * megegyezik a paraméterben szereplő dátummal.
	 * Ha nincs a keresésnek megfelelő BlogPost akkor üres Listával tér vissza.
	 * */
	public List<BlogPost> findByPostedDate(String posteddate);
	
}