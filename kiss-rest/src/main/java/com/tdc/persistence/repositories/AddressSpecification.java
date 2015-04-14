package com.tdc.persistence.repositories;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

import org.springframework.data.jpa.domain.Specification;

import com.tdc.persistence.ams.dao.entity.Addresses;
import com.tdc.util.SearchAddressRequest;

public class AddressSpecification {

	public static Specification<Addresses> search(
			final SearchAddressRequest addressRequest) {

		return new Specification<Addresses>() {

			List<Predicate> predicates = new ArrayList<Predicate>();

			public Predicate toPredicate(Root<Addresses> addressRoot,
					CriteriaQuery<?> query, CriteriaBuilder cb) {

				if (addressRequest.getStreetname() != null) {
					predicates.add(cb.equal(
							addressRoot.get("streets").get("streetname"),
							addressRequest.getStreetname()));
				}
				if (addressRequest.getDoor() != null) {
					predicates.add(cb.equal(addressRoot.get("door"),
							addressRequest.getDoor()));
				}
				if (addressRequest.getFloor() != null) {
					predicates.add(cb.equal(addressRoot.get("floor"),
							addressRequest.getFloor()));
				}
				if (addressRequest.getPostalcode() != null) {
					predicates.add(cb.equal(addressRoot.get("postalcode"),
							addressRequest.getPostalcode()));
				}
				if (addressRequest.getMunicipalitycode()!= 0) {
					predicates.add(cb.equal(addressRoot.get("streets").get("municipalities").get("municipalitycode"),
							addressRequest.getMunicipalitycode()));
				}
				if (addressRequest.getMunicipalityname()!= null) {
					predicates.add(cb.equal(addressRoot.get("streets").get("municipalities").get("municipalityname"),
							addressRequest.getMunicipalityname()));
				}
				if (addressRequest.getMunicipalityname()!= null) {
					predicates.add(cb.equal(addressRoot.get("streets").get("municipalities").get("municipalityname"),
							addressRequest.getMunicipalityname()));
				}
				return cb.and(predicates.toArray(new Predicate[] {}));
			}

		};
	}

}
