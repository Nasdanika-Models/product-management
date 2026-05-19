package org.nasdanika.models.productmanagement.doc;

import org.eclipse.emf.ecore.EObject;

/**
 * Base interface for mix-ins. 
 * @param <T>
 */
public interface NodeProcessorMixIn<T extends EObject> {
	
	/**
	 * Typed access to the implementing class instance.
	 * @return
	 */
	ModelElementNodeProcessor<T> self();

}
