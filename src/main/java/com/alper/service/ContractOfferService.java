package com.alper.service;

import com.alper.entity.ContractOffer;
import com.alper.repository.ContractOfferRepository;

public class ContractOfferService extends ServiceManager<ContractOffer,Long> {
	private final ContractOfferRepository contractOfferRepository;
	
	public ContractOfferService() {
		this(new ContractOfferRepository());
	}
	
	public ContractOfferService(ContractOfferRepository contractOfferRepository) {
		super(contractOfferRepository);
		this.contractOfferRepository = contractOfferRepository;
	}
}