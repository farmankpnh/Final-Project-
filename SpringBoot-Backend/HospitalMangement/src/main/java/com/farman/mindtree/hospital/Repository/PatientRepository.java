package com.farman.mindtree.hospital.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.farman.mindtree.hospital.Entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Integer>
{

}
