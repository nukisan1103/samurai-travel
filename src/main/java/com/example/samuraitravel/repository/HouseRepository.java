package com.example.samuraitravel.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.samuraitravel.entity.House;

public interface HouseRepository extends JpaRepository<House, Integer> {
	//JpaRepositoryを継承することで、引数に指定しているエンティティのCRUD操作（Findll()等)が出来るようになる。
	//JpaRepository<エンティティのクラス型 主キーの型>で定義
	
	public Page<House> findByNameLike(String keyword, Pageable pageable);
	
	 public Page<House> findByNameLikeOrAddressLikeOrderByCreatedAtDesc(String nameKeyword, String addressKeyword, Pageable pageable);  
	      public Page<House> findByNameLikeOrAddressLikeOrderByPriceAsc(String nameKeyword, String addressKeyword, Pageable pageable);  
	      public Page<House> findByAddressLikeOrderByCreatedAtDesc(String area, Pageable pageable);
	      public Page<House> findByAddressLikeOrderByPriceAsc(String area, Pageable pageable);
	      public Page<House> findByPriceLessThanEqualOrderByCreatedAtDesc(Integer price, Pageable pageable);
	      public Page<House> findByPriceLessThanEqualOrderByPriceAsc(Integer price, Pageable pageable); 
	      public Page<House> findAllByOrderByCreatedAtDesc(Pageable pageable);
	      public Page<House> findAllByOrderByPriceAsc(Pageable pageable);    
	      public List<House> findTop10ByOrderByCreatedAtDesc();

}
