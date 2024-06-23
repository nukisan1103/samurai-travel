package com.example.samuraitravel.entity;

import java.sql.Timestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity  //Entityアノテーションをつけることで、このクラスがエンティティとして機能するようになる
         //Entity...テーブルの1行をオブジェクトとして表現するためのクラス。エンティティにはテーブルのカラムに対応するフィールドと、それらのフィールドにアクセスするためのゲッター、セッターを定義する。
@Table(name = "houses") //tableアノテーションをつけることで、そのエンティティにマッピングするテーブル名を定義できる。
@Data // ゲッターとセッターを生成できるアノテーション Lombokと言うライブラリが存在し、このLombokが提供しているアノテーションがDataアノテーションである。
public class House {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)//@IDでこのフィールドを主キーに指定できる。
    //また、@GeneratedValueをつけ、strategy = GenerationType.IDENTITYを指定することで、自動採番してくれるようになる。
    
    @Column(name = "id")//@Columnをつけることで、そのフィールドに対応づけるカラム名を指定出来る。
    private Integer id;

    @Column(name = "name")
    private String name;

    @Column(name = "image_name")
    private String imageName;

    @Column(name = "description")
    private String description;

    @Column(name = "price")
    private Integer price;

    @Column(name = "capacity")
    private Integer capacity;

    @Column(name = "postal_code")
    private String postalCode;

    @Column(name = "address")
    private String address;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "created_at", insertable = false, updatable = false)
    private Timestamp createdAt;

    @Column(name = "updated_at", insertable = false, updatable = false)
    private Timestamp updatedAt;
}
