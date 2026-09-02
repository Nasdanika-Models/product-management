package org.nasdanika.models.productmanagement;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

public enum Icon {
	
    PERSONA(ProductmanagementPackage.Literals.PERSONA, "avatar.svg"),
    PERSONA_DOMAIN(ProductmanagementPackage.Literals.PERSONA_DOMAIN, "people.svg"),
    CAPABILITY(ProductmanagementPackage.Literals.CAPABILITY, "capability.svg"),
    CONCERN(ProductmanagementPackage.Literals.CONCERN, "concern.svg"),
    CONCERN_DOMAIN(ProductmanagementPackage.Literals.CONCERN_DOMAIN, "concern.svg"),
    PAIN_POINT(ProductmanagementPackage.Literals.PAIN_POINT, "pain.svg"),
    NEED(ProductmanagementPackage.Literals.NEED , "hand.svg"),
    GOAL(ProductmanagementPackage.Literals.GOAL , "target.svg"),
    PRODUCT_MODEL(ProductmanagementPackage.Literals.PRODUCT_MODEL , "product-model.svg");
	
    private static final String BASE_URL = "https://product-management.models.nasdanika.org/images/";

    private final String url;

	private EClass eClass;

    Icon(EClass eClass, String url) {
    	this.eClass = eClass;
        this.url = url;
    }

    /**
     * @return the absolute URL of the icon's SVG resource.
     */
    public String getUrl() {
        return BASE_URL + url;
    }

    @Override
    public String toString() {
        return url;
    }
    /**
     * Returns the most specific matching icon for the given EClass.
     * Among matching icons, prefers the one whose EClass is a subtype of others.
     * If no supertype relationship exists between two candidates, the first one wins.
     */
    public static String getTypeIcon(EClass eClass) {
        return java.util.Arrays.stream(values())
            .filter(icon -> icon.eClass != null && icon.eClass.isSuperTypeOf(eClass))
            .reduce((a, b) -> {
                // b is more specific if a.eClass is a supertype of b.eClass
                if (b.eClass.getEAllSuperTypes().contains(a.eClass)) {
                    return b;
                }
                // a is more specific if b.eClass is a supertype of a.eClass
                if (a.eClass.getEAllSuperTypes().contains(b.eClass)) {
                    return a;
                }
                // no supertype relationship - keep first
                return a;
            })
            .map(Icon::getUrl)
            .orElse(null);
    }

    /**
     * Returns the most specific matching icon for the given EObject.
     * Among matching icons, prefers the one whose EClass is a subtype of others.
     * If no supertype relationship exists between two candidates, the first one wins.
     */
    public static String getIcon(EObject eObject) {
    	return eObject != null ? getTypeIcon(eObject.eClass()) : null;
    }

}

