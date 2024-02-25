package com.example.core.repository;

import com.example.core.controller.DTO.CustomVideoDTO;
import com.example.core.model.Video;
import jakarta.persistence.*;
import jakarta.persistence.criteria.CriteriaBuilder;
import jakarta.persistence.criteria.CriteriaQuery;
import jakarta.persistence.criteria.Root;
import org.hibernate.Session;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface VideoRepository extends JpaRepository<Video, Integer> {

//    EntityManagerFactory emf = Persistence.createEntityManagerFactory("com.example.core");
//    @Autowired
//    EntityManager em;

//    @Query("""
//SELECT new V(v.title, v.url)
//FROM Video v
//WHERE v.deleted = false
//""")
    Video findVideoById(Integer id);

    int deleteVideoById(Integer video_id);


    @Query(nativeQuery = true,
            value = "select v.* " +
            "from core_schema.video v " +
            "join core_schema.video_2_video_setting v2vs on v.video_id = v2vs.video_id " +
            "where v2vs.video_setting_id = :id")
    List<Video> findVideosBySettingId(Integer id);

    @Query("""
            SELECT v1
            FROM Video v1 
            WHERE v1.length = (SELECT max(v2.length) FROM Video v2)
            """)
    Video findLongestVideo();


//    @Query("""
//            SELECT v1
//            FROM Video v1
//            WHERE v1.length = (SELECT min(v2.length) FROM Video v2)
//            """)
//    Video findShortestVideo();

//    default Video findShortestVideo(Integer id) {
//        CriteriaBuilder cb = em.getCriteriaBuilder();
//        CriteriaQuery<Video> criteria = cb.createQuery(Video.class);
//        Root<Video> root = criteria.from(Video.class);
//        criteria.where(cb.equal(root.get("id"), id));
//        return em.createQuery(criteria).getSingleResult();
//    }


    // Entity life cycle -
    // Lazy and Eager fetching - (should try it)
    // join fetch, n+1 queries problem --
    // JPQL query -
    // try fetch,
    // try using constructor in select ? (should try it)
    // Native query --
    // how to map native query result in jpa ? interface projection (should try it)
    // Criteria Builder ? (should try it)
    // Transaction management in spring @Transactional -- (should try it)
    // Async -- (should try it)
    // Serialization & Deserialization jackson (object mapper) --
    // Pessimistic locking, optimistic locking (just read)
    // Read about AOP and spring aspects (just read)
    // * Create users management micro service, create api, call it from core (there is many methods) (should try it)
    // ** AWS: SQS, SNS, Lambda, Step function, Secret Manager (just read)-
    // *** Functional interfaces: Function, Supplier, Consumer (should try it)
    // *** Streams: filter, forEach, map, collect (to list, joining, to map), grouping by, sorted, anyMatch (should try it)


    // Java brains

}
