package com.example.ComplaintBackend.Dao;

import com.example.ComplaintBackend.Model.Complaint;
import org.springframework.data.repository.CrudRepository;

public interface ComplaintDao  extends CrudRepository<Complaint ,Integer> {
}
