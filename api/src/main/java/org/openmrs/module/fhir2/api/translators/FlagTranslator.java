package org.openmrs.module.fhir2.api.translators;

import javax.annotation.Nonnull;

import org.hl7.fhir.r4.model.Flag;

public interface FlagTranslator extends ToFhirTranslator<A, B>{
	// i think this interface should probably extend something like
	// ToFhirTranslator<A, B> where par_a is the openmrs flag model
	// and par_b is the fhir flag model
	
	// now this is where the magic happens
	// we can have methods to translate between the openmrs flag model
	// and the fhir flag resource
	
	/**
	 * @param openmrsFlag the OpenMRS Flag to translate
	 * @return the corresponding FHIR Flag
	 */
	Flag toFhirResource(openmrsFlag);
	
	/**
	 * @param fhirFlag the FHIR Flag to map
	 * @return the corresponding OpenMRS Flag
	 */
	FhirFlag toOpenmrsType(fhirFlag);
}
