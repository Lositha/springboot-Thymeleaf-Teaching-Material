package lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.dao;

import lk.lalithk90.springboot_thymelaf.hibernate.oneToManyUni.entity.InstructorDetailOneToManyUni;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface InstructorDetailOneToManyUniRepository extends JpaRepository< InstructorDetailOneToManyUni, Integer > {
}
