//package com.esprit.spring.repository;
//
//
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.CrudRepository;
//import org.springframework.data.repository.query.Param;
//
//import com.esprit.spring.entites.Client;
//import com.esprit.spring.entites.Recherche;
//
//
//public interface RechercheRepository extends CrudRepository<Recherche,Long>{
//	
//	///list of publication aded to profile 
//	//
//	//
//	Recherche findByTypeAndClient(String type, Client client);
//	 
//	@Query("select p.type from Recherche p where p.nbr=:max")
//	public String extract(@Param("max") Long max);
//	
//	
//	@Query("select max(p.nbr) from Recherche p join p.client c where c.id=:id_client")
//	public Long lemax(@Param("id_client") Long id_client);
//	 
//	 
//}