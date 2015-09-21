package intersect.daris.plugin;

/**
 * Constants.
 * 
 * Initialize the constant values of doc namespace, role namespace, dictionary
 * namespace and service prefix.
 * 
 *
 */

public class Constants {

    //@formatter:off
	public static final String ORG_NAME_SHORT       = "intersect";
	public static final String ORG_NAME_FULL        = "Intersect Australia Ltd";
	public static final String DOC_NAMESPACE        = "intersect.daris";
	public static final String DICTIONARY_NAMESPACE = "intersect.daris";
	public static final String ROLE_NAMESPACE       = "intersect.daris";
	public static final String SERVICE_PREFIX       = "intersect.daris";
	//@formatter:on

    public static String prependDocNamespace(String doc) {
        return DOC_NAMESPACE + ":" + doc;
    }

    public static String prependDictionaryNamespace(String dictionary) {
        return DICTIONARY_NAMESPACE + ":" + dictionary;
    }

    public static String prependRoleNamespace(String role) {
        return ROLE_NAMESPACE + ":" + role;
    }

    private Constants() {

    }

}
