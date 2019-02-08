package com.jboss.service;

import java.util.List;

import com.jboss.pojos.DeathDetails;

public interface DeathDetailsService {
	public List<DeathDetails> getDeathDetailss();
	public void saveDeathDetails(DeathDetails theDeathDetails);
	public DeathDetails getDeathDetails(int theId);
	public void deleteDeathDetails(int theId);

}
