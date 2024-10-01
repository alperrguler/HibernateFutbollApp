package com.alper.service;

import com.alper.entity.Manager;
import com.alper.entity.TransferOffer;
import com.alper.repository.TransferOfferRepository;

import java.util.List;

public class TransferOfferService extends ServiceManager<TransferOffer,Long> {
	private final TransferOfferRepository transferOfferRepository;
	
	public TransferOfferService() {
		this(new TransferOfferRepository());
	}
	
	public TransferOfferService(TransferOfferRepository transferOfferRepository) {
		super(transferOfferRepository);
		this.transferOfferRepository = transferOfferRepository;
	}
	
	public List<TransferOffer> futbolcuIcinYapilanTeklifler(Manager manager){
		return transferOfferRepository.futbolcuIcinYapilanTeklifler(manager);
	}
	
}