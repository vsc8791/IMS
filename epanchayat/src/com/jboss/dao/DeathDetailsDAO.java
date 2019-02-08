package com.jboss.dao;

import java.util.List;

import com.jboss.pojos.DeathDetails;

public interface DeathDetailsDAO {
	public List<DeathDetails> getDeathDetailss();
	public void saveDeathDetails(DeathDetails theDeathDetails);
	public DeathDetails getDeathDetails(int theId);
	public void deleteDeathDetails(int theId);

}
